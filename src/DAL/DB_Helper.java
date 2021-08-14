
package DAL;

import DTO.Customer;
import DTO.Staff;
import DTO.Account;
import DTO.Bill;
import DTO.LoginHistory;
import DTO.MenuBill;
import DTO.MenuBillInfo;
import DTO.Room;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DB_Helper {
    
    private static DB_Helper _INSTANCE;
    
    String sql;
    String url;
    Connection con;
    Statement stm;
    ResultSet rst;
    PreparedStatement pst;
    
    private DB_Helper() {
        url = "jdbc:ucanaccess://QLKS.accdb";
    }
    
    public static DB_Helper getInstance(){
        if(_INSTANCE == null){
            _INSTANCE = new DB_Helper();
        }
        return _INSTANCE;
    }
    
    public ArrayList<Customer> GetListCustomer(String sql){
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection(url);
            stm = con.createStatement();
            rst = stm.executeQuery(sql);
            while (rst.next()) {
            Customer customer = new Customer(rst.getInt("idCustomer"), rst.getString("nameCustomer"), rst.getInt("ageCustomer"),
                    rst.getString("addressCustomer"), rst.getInt("phoneNumber"), rst.getBoolean("idTypeCustomer"),rst.getBoolean("genderCustomer"));
            customerList.add(customer);
            }
            
        } catch (Exception e) {
        }
        return customerList;
    }
    
    public ArrayList<Staff> GetListStaff(String sql){
        ArrayList<Staff> StaffList = new ArrayList<Staff>();
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection(url);
            stm = con.createStatement();
            rst = stm.executeQuery(sql);
            while (rst.next()) {
            Staff Staff = new Staff(rst.getInt("idStaff"), rst.getString("nameStaff"), rst.getInt("ageStaff"),
                    rst.getString("addressStaff"), rst.getInt("phoneNumber"), rst.getInt("idPosstion"),rst.getBoolean("gender"));
            StaffList.add(Staff);
            }
            
        } catch (Exception e) {
        }
        return StaffList;
    }
    
    public void ExcuteDB(String sql){
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection(url);
            pst = con.prepareStatement(sql);
            int a = pst.executeUpdate();
            if(a>0){
                JOptionPane.showMessageDialog(null, "Delete Success!!!");
            }
        } catch (Exception e) {
        }
    }
    public void ExcuteD(String query){
        try {
            String connectionURL = "jdbc:ucanaccess://QLKS.accdb";
            Connection connection = DriverManager.getConnection(connectionURL);
            Statement st = connection.createStatement();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Exception " + e);
        }
    }
    public void ExcuteEditAccount(String sql){
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection(url);
            pst = con.prepareStatement(sql);
            int a = pst.executeUpdate();
            if(a>0){
                JOptionPane.showMessageDialog(null, "Update Success!!!");
            }
        } catch (Exception e) {
        }
    }
    
    public void ExcuteNew(String sql){
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection(url);
            pst = con.prepareStatement(sql);
            int a = pst.executeUpdate();           
        } catch (Exception e) {
        }
    }
    
    public void ExcuteResetPass(String sql){
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection(url);
            pst = con.prepareStatement(sql);
            int a = pst.executeUpdate();
            if(a>0){
                JOptionPane.showMessageDialog(null, "Reset Password Success!!!");
            }
        } catch (Exception e) {
        }
    }
    
    public ArrayList<Account> GetListAccount(String sql){
        ArrayList<Account> AccountList = new ArrayList<Account>();
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection(url);
            stm = con.createStatement();
            rst = stm.executeQuery(sql);
            while (rst.next()) {
            Account account = new Account(rst.getInt("idAccount"), rst.getString("Username"), rst.getString("displayName"),
                    rst.getString("Password"),rst.getInt("idTypeAccount") );
            AccountList.add(account);
            }
            
        } catch (Exception e) {
        }
        return AccountList;
    }
    
    public ArrayList<LoginHistory> GetListLoginHistory(String sql){
        ArrayList<LoginHistory> LoginHistoryList = new ArrayList<LoginHistory>();
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection(url);
            stm = con.createStatement();
            rst = stm.executeQuery(sql);
            while (rst.next()) {
            LoginHistory loginHistory = new LoginHistory(rst.getInt("ID"), rst.getString("username"), rst.getInt("Type"), rst.getString("DateTimeLogin") );
            LoginHistoryList.add(loginHistory);
            }
            
        } catch (Exception e) {
        }
        return LoginHistoryList;
    }
    
    public Account GetAccount(String sql, String usn){
        Account a = new Account();
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection(url);
            pst = con.prepareStatement(sql);
            pst.setString(1, usn);
            rst = pst.executeQuery();
            if(rst.next()){
                a.id = rst.getInt("idAccount");
                a.displayname = rst.getString("displayName");
                a.username = rst.getString("Username");
                a.password = rst.getString("Password");
                a.type = rst.getInt("idTypeAccount");
            }
        } catch (Exception e) {
        }
        return a;
    }
    public void ExcuteDB(String sql, String npw, String pw){
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection(url);
            pst = con.prepareStatement(sql);
            pst.setString(1, npw);
            pst.setString(2, pw);
            int a = pst.executeUpdate();
            if(a>0){
                JOptionPane.showMessageDialog(null, "Success!!!");
            }
        } catch (Exception e) {
        }
    }
    public ArrayList<Bill> GetListBillFromTo(String query){
        ArrayList<Bill> list = new ArrayList<Bill>();
        try {
            String connectionURL = "jdbc:ucanaccess://QLKS.accdb";
            Connection connection = DriverManager.getConnection(connectionURL);
            Statement st = connection.createStatement();
            rst = st.executeQuery(query);
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
            while (rst.next()) {
                String[] resultInFirst = rst.getString("dateCheckIn").split(" ");
                String[] resultOutFirst = rst.getString("dateCheckOut").split(" ");
                String[] resultInConvert = resultInFirst[0].split("-");
                String[] resultOutConvert = resultInFirst[0].split("-");
                String resultInAfter = resultInConvert[2] + "/" + resultInConvert[1] + "/" + resultInConvert[0];
                String resultOutAfter = resultOutConvert[2] + "/" + resultOutConvert[1] + "/" + resultOutConvert[0];
                Bill bill = new Bill(rst.getInt("idBill"), rst.getInt("idCustomer"), rst.getInt("idRoom"),
                    rst.getInt("sumMoney"),df.parse(resultInAfter),
                    df.parse(resultOutAfter),rst.getBoolean("check"));
                list.add(bill);
            }
        } catch (Exception e) {
            System.out.println("cau query " + e);
        } 
        return list;
    }
    //Customer
    public void AddCustomer(String sql, Customer c){
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection(url);
            pst = con.prepareStatement(sql);
            pst.setString(1, Integer.toString(c.id));
            pst.setString(2, c.name);
            pst.setString(3, Integer.toString(c.age));
            pst.setString(4, c.adress);
            pst.setString(5, Integer.toString(c.phone));
            pst.setString(6, String.valueOf(c.type));
            pst.setString(7, String.valueOf(c.gender));
            int a = pst.executeUpdate();
            if(a>0){
                JOptionPane.showMessageDialog(null, "Add Success!!!");
            }
        } catch (Exception e) {
        }
    }
    public void EditCustomer(String sql, Customer c){
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection(url);
            pst = con.prepareStatement(sql);
            pst.setString(1, String.valueOf(c.id));
            pst.setString(2, c.name);
            pst.setString(3, String.valueOf(c.age));
            pst.setString(4, c.adress);
            pst.setString(5, String.valueOf(c.phone));
            pst.setString(6, String.valueOf(c.type));
            pst.setString(7, String.valueOf(c.gender));
            int a = pst.executeUpdate();
            if(a>0){
                JOptionPane.showMessageDialog(null, "Edit Success!!!");
            }
        } catch (Exception e) {
        }
    }
    
    //Staff
    public void AddStaff(String sql, Staff d){
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection(url);
            pst = con.prepareStatement(sql);
            pst.setString(1, Integer.toString(d.id));
            pst.setString(2, d.name);
            pst.setString(3, Integer.toString(d.age));
            pst.setString(4, String.valueOf(d.gender));
            pst.setString(5, Integer.toString(d.phone));
            pst.setString(6, d.adress);
            pst.setString(7, String.valueOf(d.posstion));
            int a = pst.executeUpdate();
            if(a>0){
                JOptionPane.showMessageDialog(null, "Add Success!!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void EditStaff(String sql, Staff d){
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection(url);
            pst = con.prepareStatement(sql);
            pst.setString(1, d.name);
            pst.setString(2, Integer.toString(d.age));
            pst.setString(3, String.valueOf(d.gender));
            pst.setString(4, Integer.toString(d.phone));
            pst.setString(5, d.adress);
            pst.setString(6, String.valueOf(d.posstion));
            pst.setString(7, String.valueOf(d.id));
            int a = pst.executeUpdate();
            if(a>0){
                JOptionPane.showMessageDialog(null, "Edit Success!!!");
            }
        } catch (Exception e) {
        }
    }
    
    //Account
    public void AddAccount(String sql, Account b){
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection(url);
            pst = con.prepareStatement(sql);
            pst.setString(1, Integer.toString(b.id));
            pst.setString(2, b.username);
            pst.setString(3, b.displayname);
            pst.setString(4, b.password);
            pst.setString(5, String.valueOf(b.type));
            int a = pst.executeUpdate();
            if(a>0){
                JOptionPane.showMessageDialog(null, "Add Success!!!");               
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void EditAccount(String sql, Account b){
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection(url);
            pst = con.prepareStatement(sql);
            pst.setString(1, Integer.toString(b.id));
            pst.setString(2, b.username);
            pst.setString(3, b.displayname);
            pst.setString(4, b.password);
            pst.setString(5, String.valueOf(b.type));
            int a = pst.executeUpdate();
            if(a>0){
                JOptionPane.showMessageDialog(null, "Edit Success!!!");
            }
        } catch (Exception e) {
        }
    }
    
    public ArrayList<Room> GetListRoom(String sql){
        ArrayList<Room> rooms = new ArrayList<Room>();
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection(url);
            stm = con.createStatement();
            rst = stm.executeQuery(sql);
            while (rst.next()) {
            Room room = new Room(rst.getInt("idRoom"), rst.getBoolean("idTypeRoom"));
            rooms.add(room);
            }
            
        } catch (Exception e) {
        }
        return rooms;
    }
    
    public void AddRoom(String sql, Room c){
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection(url);
            pst = con.prepareStatement(sql);
            pst.setString(1, Integer.toString(c.id));
            pst.setString(2, String.valueOf(c.type));
            int a = pst.executeUpdate();
            if(a>0){
                JOptionPane.showMessageDialog(null, "Add Success!!!");
            }
        } catch (Exception e) {
        }
    }
    
    public void EditRoom(String sql, Room c){
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection(url);
            pst = con.prepareStatement(sql);
            pst.setString(1, String.valueOf(c.type));
            pst.setString(2, String.valueOf(c.id));
            int a = pst.executeUpdate();
            if(a>0){
                JOptionPane.showMessageDialog(null, "Edit Success!!!");
            }
        } catch (Exception e) {
        }
    }
    
    public ArrayList<String> ListService(){
        ArrayList<String> list = new ArrayList<String>();
        ResultSet rs = null;
        try {
            String connectionURL = "jdbc:ucanaccess://QLKS.accdb";
            Connection connection = DriverManager.getConnection(connectionURL);
            Statement st = connection.createStatement();
            rs = st.executeQuery("select nameTypeOfService from TypeOfService");
        } catch (Exception e) {
        } 
        try {
            while(rs.next()){
                String Name = rs.getString("nameTypeOfService");
                list.add(Name);
        }
        } catch (Exception e) {
        }
        return list;
    } 
    public ArrayList<MenuBill> getListMenuBillsNow(String id){
        ArrayList<MenuBill> list = new ArrayList<MenuBill>();
        ResultSet rs = null;
        try {
            String connectionURL = "jdbc:ucanaccess://QLKS.accdb";
            Connection connection = DriverManager.getConnection(connectionURL);
            Statement st = connection.createStatement();
//            String query = "select c.nameCustomer,b.idBill,r.idRoom, tr.Price, tos.nameTypeOfService, bf.number, bf.SumMoney  "
//                    + " from Bill as b inner join BillInfo as bf on b.idBill = bf.idBill"
//                    + " inner join TypeOfService as tos on bf.idTypeOfService = tos.idTypeOfService"
//                    + " inner join Customer as c on b.idCustomer = c.idCustomer inner join "
//                    + " Room as r on r.idRoom = b.idRoom inner join TypeRoom as tr on tr.idTypeRoom = r.idTypeRoom"
//                    + " where b.check = false and r.idRoom = " + id;
            String query = "Select c.nameCustomer,b.idBill,r.idRoom, tr.Price from Bill as b inner join Customer as c on b.idCustomer = c.idCustomer"
                    + " inner join Room as r on r.idRoom = b.idRoom inner join TypeRoom as tr on tr.idTypeRoom = r.idTypeRoom where b.check = false and r.idRoom = " + id;
            
            rs = st.executeQuery(query);
        } catch (Exception e) {
            System.out.println("Exception " + e);
        } 
        try {
            while(rs.next()){
                 list.add(new MenuBill(rs.getString("nameCustomer"),rs.getInt("idBill"), rs.getInt("idRoom"), rs.getInt("Price")));
            }
        } catch (Exception e) { 
        }
        return list;
    }
    public ArrayList<MenuBillInfo> getListMenuBillInfosNow(String id){
        ArrayList<MenuBillInfo> list = new ArrayList<MenuBillInfo>();
        ResultSet rs = null;
        try {
            String connectionURL = "jdbc:ucanaccess://QLKS.accdb";
            Connection connection = DriverManager.getConnection(connectionURL);
            Statement st = connection.createStatement();
//            String query = "select c.nameCustomer,b.idBill,r.idRoom, tr.Price, tos.nameTypeOfService, bf.number, bf.SumMoney  "
//                    + " from Bill as b inner join BillInfo as bf on b.idBill = bf.idBill"
//                    + " inner join TypeOfService as tos on bf.idTypeOfService = tos.idTypeOfService"
//                    + " inner join Customer as c on b.idCustomer = c.idCustomer inner join "
//                    + " Room as r on r.idRoom = b.idRoom inner join TypeRoom as tr on tr.idTypeRoom = r.idTypeRoom"
//                    + " where b.check = false and r.idRoom = " + id;
            String query = "Select tos.nameTypeOfService, bf.number, bf.SumMoney from Bill as b "
                    + "inner join BillInfo as bf on b.idBill = bf.idBill "
                    + "inner join TypeOfService as tos on bf.idTypeOfService = tos.idTypeOfService "
                    + "inner join Room as r on r.idRoom = b.idRoom "
                    + "where b.check = false and r.idRoom = " + id;
            rs = st.executeQuery(query);
        } catch (Exception e) {
            System.out.println("Exception " + e);
        } 
        try {
            while(rs.next()){
                 list.add(new MenuBillInfo(rs.getString("nameTypeOfService"),rs.getInt("number"),rs.getInt("SumMoney")));
            }
        } catch (Exception e) {
            
        }
        return list;
    }
    public int getPriceServiceByIdService(String idService){
        try {
            String connectionURL = "jdbc:ucanaccess://QLKS.accdb";
            Connection connection = DriverManager.getConnection(connectionURL);
            Statement st = connection.createStatement();
            String query = "select * from TypeOfService where idTypeOfService = " + idService;
            ResultSet rs = st.executeQuery(query);
            int result = -1;
            while(rs.next()){
                result = rs.getInt("priceTypeOfService");
            }
            return result;
        } catch (Exception e) {
            return -1;
        }
    }
    public int getIdBillInfoNow(){
        try {
            String connectionURL = "jdbc:ucanaccess://QLKS.accdb";
            Connection connection = DriverManager.getConnection(connectionURL);
            Statement st = connection.createStatement();
            String query = "select * from BillInfo";
            ResultSet rs = st.executeQuery(query);
            int result = -1;
            while(rs.next()){
                result = rs.getInt("idBillInfo");
            }
            return result;
        } catch (Exception e) {
            return -1;
        }
    }
    public int getIdBillNow(){
        try {
            String connectionURL = "jdbc:ucanaccess://QLKS.accdb";
            Connection connection = DriverManager.getConnection(connectionURL);
            Statement st = connection.createStatement();
            String query = "Select idBill from Bill";
            ResultSet rs = st.executeQuery(query);
            int result = -1;
            while(rs.next()){
                result = rs.getInt("idBill");
            }
            return result;
        } catch (Exception e) {
            return -1;
        }
    }
    public int getNumberNow(String idBill, String idService){
        try {
            String connectionURL = "jdbc:ucanaccess://QLKS.accdb";
            Connection connection = DriverManager.getConnection(connectionURL);
            Statement st = connection.createStatement();
            String query = "select * from BillInfo where idBill = "+idBill+" and idTypeOfService = "+idService+"";
            ResultSet rs = st.executeQuery(query);
            int result = -1;
            while(rs.next()){
                result = rs.getInt("number");
            }
            return result;
        } catch (Exception e) {
            System.out.println("ex" + e);
            return -1;
        }
    }
    public int getIdBillInfo(String idBill, String idService){
        try {
            String connectionURL = "jdbc:ucanaccess://QLKS.accdb";
            Connection connection = DriverManager.getConnection(connectionURL);
            Statement st = connection.createStatement();
            String query = "select * from BillInfo where idBill = "+idBill+" and idTypeOfService = "+idService+"";
            ResultSet rs = st.executeQuery(query);
            int result = -1;
            while(rs.next()){
                result = rs.getInt("idBillInfo");
            }
            return result;
        } catch (Exception e) {
            System.out.println("ex" + e);
            return -1;
        }
    }
}
