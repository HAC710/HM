/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;
import javax.xml.crypto.Data;

/**
 *
 * @author Xuan Hoang
 */
public class Bill {
    int idBill, idCustomer, idRoom, sumMoney;
    Date dateCheckIn, dateCheckOut;
    boolean check;
    
    
    public Bill(int idBill, int idCustomer, int idRoom, int sumMoney,
            Date dateCheckIn, Date dateCheckOut, boolean check){
        this.idBill = idBill;
        this.idCustomer = idCustomer;
        this.idRoom = idRoom;
        this.sumMoney = sumMoney;
        this.dateCheckIn = dateCheckIn;
        this.dateCheckOut = dateCheckOut;
        this.check = check;
    }
    public void setIdBill(int idBill){ this.idBill = idBill; }
    public int getIdBill(){ return this.idBill; }
    
    public void setIdCustomer(int idCustomer){ this.idCustomer = idCustomer; }
    public int getIdCustomer(){ return this.idCustomer; }
    
    public void setIdRoom(int idRoom){ this.idRoom = idRoom; }
    public int getIdRoom(){ return this.idRoom; }
    
    public void setSumMoney(int sumMoney){ this.sumMoney = sumMoney; }
    public int getSumMoney(){ return this.sumMoney; }
    
    public void setDateCheckIn(Date dateCheckIn){ this.dateCheckIn = dateCheckIn; }
    public Date getDateCheckIn(){ return this.dateCheckIn; }
    
    public void setDateCheckOut(Date dateCheckOut){ this.dateCheckOut = dateCheckOut; }
    public Date getDateCheckOut(){ return this.dateCheckOut; }
    
    public void setCheck(boolean check){ this.check = check; }
    public boolean getCheck(){ return this.check; }
}
