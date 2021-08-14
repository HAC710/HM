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
public class MenuBillInfo {
    private String nameService;
    private int number;
    private int sumMonney;
    public MenuBillInfo(String nameServiceString, int number, int sumMoney){
        this.nameService = nameServiceString;
        this.number = number;
        this.sumMonney = sumMoney;
    }
    public void setNameService(String nameService){ this.nameService = this.nameService; }
    public String getNameService(){ return this.nameService; }
    
    public void setNumber(int number){ this.number = number; }
    public int getNumber(){ return this.number; }
    
    public void setMoney(int sumMoney){ this.sumMonney = sumMonney; }
    public int getSumNumber(){ return this.sumMonney; }
}
