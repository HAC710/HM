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
public class Staff {
    public int id;
    public String name;
    public int age;
    public String adress;
    public int phone;
    public int posstion;
    public boolean gender; 
    
    public Staff() {}

    public Staff(int id, String name, int age, String adress, int phone, int posstion, boolean gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.phone = phone;
        this.posstion = posstion;
        this.gender = gender;
    }
    
    public static boolean Compare_ID(Staff a, Staff b ){
        return a.id > b.id;
    }
    public static boolean Compare_Name(Staff a, Staff b){
        return a.name.equals(b.name);
    }
    public static boolean Compare_Age(Staff a, Staff b ){
        return a.age > b.age;
    }
    public static boolean Compare_Adress(Staff a, Staff b){
        return a.adress.equals(b.adress);
    }
    public static boolean Compare_Phone(Staff a, Staff b ){
        return a.phone > b.phone;
    }
    public static boolean Compare_Posstion(Staff a, Staff b ){
        return a.posstion > b.posstion;
    }
    public static boolean Compare_Gender(Staff a, Staff b ){
        return true;
    }
    
}
