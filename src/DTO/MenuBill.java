/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Xuan Hoang
 */
public class MenuBill {
    private int numberRoom;
    private int priceRoom;
    private int idBill;
    private String nameCustomer;
    
    
    public MenuBill(String nameCustomer,int idBill, int numberRoom, int priceRoom){
        this.nameCustomer = nameCustomer;
        this.idBill = idBill;
        this.numberRoom = numberRoom;
        this.priceRoom = priceRoom;
    }
    public void setNumberRoom(int numberRoom){ this.numberRoom = numberRoom; }
    public int getNumberRoom(){ return this.numberRoom; }
    
    public void setIdBill(int idBill){ this.idBill = idBill; }
    public int getIdBill(){ return this.idBill; }
    
    public void setPriceRoom(int priceRoom){ this.priceRoom = priceRoom; }
    public int getPriceRoom(){ return this.priceRoom; }
    
    public void setNameCustomer(String nameCustomer){ this.nameCustomer = nameCustomer; }
    public String getNameCustomer(){ return this.nameCustomer; }
}
