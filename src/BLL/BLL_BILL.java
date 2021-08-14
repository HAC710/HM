/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DTO.Bill;
import DTO.MenuBill;
import DTO.MenuBillInfo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Xuan Hoang
 */
public class BLL_BILL {
    private static BLL_BILL _INSTANCE;
    private BLL_BILL() {}
    public static BLL_BILL getInstance(){
        if(_INSTANCE == null){
            _INSTANCE = new BLL_BILL();
        }
        return _INSTANCE;
    }
    public ArrayList<MenuBill> getListMenuBillsNow(String id){
        return DAL.DAL_QLBILL.getInstance().getListMenuBillsNow(id);
    }
    public ArrayList<MenuBillInfo> getListMenuBillInfosNow(String id){
        return DAL.DAL_QLBILL.getInstance().getListMenuBillInfosNow(id);
    }
    public int establishSumMoney(String idRoom, String idBill){
        return DAL.DAL_QLBILL.getInstance().establishSumMoney(idRoom,idBill);
    }
    public void addBillInfo(String idBill, String idService, int number){
        DAL.DAL_QLBILL.getInstance().addBillInfo(idBill,idService,number);
    }
    public void createBill(String idRoom, int idCustomer){
        DAL.DAL_QLBILL.getInstance().createBill(idRoom, idCustomer);
    }
    public void pay(String idBill){
        DAL.DAL_QLBILL.getInstance().pay(idBill);
    }
    public void cancelBill(String idBill){
        DAL.DAL_QLBILL.getInstance().cancelBill(idBill);
    }
    public ArrayList<Bill> getListBillByDate(String from, String to){
        return DAL.DAL_QLBILL.getInstance().getListBillByDate(from, to);
    }
    //public Arraylist<String> 
    public void ChangeRoom(String idBill, String idNewRoom){
        DAL.DAL_QLBILL.getInstance().ChangeRoom(idBill, idNewRoom);
    }
}
