/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author dophu
 */
public class ViewStaff {
    public Integer id;
    public String name;
    public Integer age;
    public String adress;
    public Integer phone;
    public Integer posstion;
    public String gender;
    
    public ViewStaff() {}

    public ViewStaff(int id, String name, int age, String adress, int phone, int type, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.phone = phone;
        this.posstion = type;
        this.gender = gender;
    }
    
}
