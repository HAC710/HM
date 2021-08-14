/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author PHONG VU
 */
public class ViewCustomer {
    public Integer id;
    public String name;
    public Integer age;
    public String adress;
    public Integer phone;
    public String type;
    public String gender;
    
    public ViewCustomer() {}

    public ViewCustomer(int id, String name, int age, String adress, int phone, String type, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.phone = phone;
        this.type = type;
        this.gender = gender;
    }
    
    
}
