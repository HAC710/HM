/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.Bill;
import DTO.MenuBill;
import DTO.MenuBillInfo;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author Xuan Hoang
 */
public class DAL_QLBILL {
    private static DAL_QLBILL _Instance;
    private DAL_QLBILL(){}
    
    public static DAL_QLBILL getInstance(){
        if(_Instance == null){
            _Instance = new DAL_QLBILL();
        }
        return _Instance;
    }
    public ArrayList<MenuBill> getListMenuBillsNow(String id){
        return DAL.DB_Helper.getInstance().getListMenuBillsNow(id);
    }
    public ArrayList<MenuBillInfo> getListMenuBillInfosNow(String id){
        return DAL.DB_Helper.getInstance().getListMenuBillInfosNow(id);
    }
    public int establishSumMoney(String idRoom, String idBill){
        int sum = 0;
        ArrayList<MenuBillInfo> list = getListMenuBillInfosNow(idRoom);
        ArrayList<MenuBill> list1 = getListMenuBillsNow(idRoom);
        sum += list1.get(0).getPriceRoom();
        for(MenuBillInfo e : list){
            sum += e.getSumNumber();
        }
        
        String query = "UPDATE Bill SET sumMoney = " + sum + " where idBill = " + idBill;
        System.out.println(query);
        DAL.DB_Helper.getInstance().ExcuteD(query);
        return sum;
    }
    public void addBillInfo(String idBill, String idService, int number){
        int priceService = DAL.DB_Helper.getInstance().getPriceServiceByIdService(idService);
        if(priceService != -1){
            int sumMoney = priceService * number;
            int idBillInfo2 = DAL.DB_Helper.getInstance().getIdBillInfo(idBill, idService);
            if(idBillInfo2 == -1){
                if(number > 0){
                    int idBillInfo = DAL.DB_Helper.getInstance().getIdBillInfoNow() + 1;
                    String query = "INSERT INTO BillInfo(idBillInfo,idBill,"
                            + "idTypeOfService,number,SumMoney) Values("+idBillInfo+","
                            + ""+idBill+","+idService+","+number+","+sumMoney+")";
                    DAL.DB_Helper.getInstance().ExcuteD(query);
                }
            }else{
                int numberNow = DAL.DB_Helper.getInstance().getNumberNow(idBill, idService);
                int sumNumber = numberNow + number;
                if(sumNumber > 0){
                    String query = "UPDATE BillInfo Set number = number + "+number+""
                        + " where idBillInfo = "+idBillInfo2+"";
                    String query2 = "UPDATE BillInfo Set SumMoney = SumMoney + "+sumMoney+""
                        + " where idBillInfo = "+idBillInfo2+"";
                    DAL.DB_Helper.getInstance().ExcuteD(query);
                    DAL.DB_Helper.getInstance().ExcuteD(query2);
                }else{
                    String query = "Delete * from BillInfo where idBillInfo = "+idBillInfo2+"";
                    DAL.DB_Helper.getInstance().ExcuteD(query);
                    System.out.println(query);
                }
            }
        }
    }
    public void createBill(String idRoom, int idCustomer){
        try {
            java.util.Date date=new java.util.Date();
            int idBill = DAL.DB_Helper.getInstance().getIdBillNow() + 1;
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            String d = df.format(date);
            String query = "Insert into Bill(idBill,idCustomer,idRoom,dateCheckIn"
                + ",check) Values("+idBill+","+idCustomer+","+idRoom+",#"+d+"#,false)";
            DAL.DB_Helper.getInstance().ExcuteD(query);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    public ArrayList<Bill> getListBillByDate(String from, String to){
        try {
            String query = "select * from Bill where dateCheckIn >= #"+from+"# and dateCheckOut <= #"+to+"# and check = true";
            System.out.println(query);
            return DAL.DB_Helper.getInstance().GetListBillFromTo(query);
        } catch (Exception e) {
            System.out.println("loi " + e);
            return null;
            
        }
        
    }
    public void pay(String idBill){
        java.util.Date date=new java.util.Date();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String d = df.format(date);
        System.out.println(idBill);
        String query = "UPDATE Bill Set check = true where idBill = "+idBill+"";
        String query2 = "UPDATE Bill Set dateCheckOut = #"+d+"# where idBill = "+idBill+"";
        DB_Helper.getInstance().ExcuteD(query);
        DB_Helper.getInstance().ExcuteD(query2);
    }
    public void cancelBill(String idBill){
        String query = "Delete * from BillInfo where idBill = "+idBill+"";
        String query1 = "Delete * from Bill where idBill = "+idBill+"";
        DB_Helper.getInstance().ExcuteD(query);
        DB_Helper.getInstance().ExcuteD(query1);
    }
    public void ChangeRoom(String idBill, String idNewRoom){
        String query = "UPDATE Bill Set idRoom = "+idNewRoom+" where idBill = "+idBill+"";
        DB_Helper.getInstance().ExcuteD(query);
    }
    public ArrayList<Bill> getListBill(Date from, Date to){
        ArrayList<Bill> l = new ArrayList<Bill>();
        //String query = "Select * from Bill where "
        
        return l;
    }
}
