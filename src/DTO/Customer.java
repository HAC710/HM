
package DTO;

public class Customer {
    
    public Integer id;
    public String name;
    public Integer age;
    public String adress;
    public Integer phone;
    public boolean type;
    public boolean gender; 
    
    public Customer() {}

    public Customer(int id, String name, int age, String adress, int phone, boolean type, boolean gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.phone = phone;
        this.type = type;
        this.gender = gender;
    }
    

    public static boolean Compare_Name(Customer a, Customer b){
        return a.name.equals(b.name);
    }
    public static boolean Compare_Age(Customer a, Customer b ){
        return a.age > b.age;
    }
    public static boolean Compare_Adress(Customer a, Customer b){
        return a.adress.equals(b.adress);
    }
    public static boolean Compare_Phone(Customer a, Customer b ){
        return a.phone > b.phone;
    }
    public static boolean Compare_Type(Customer a, Customer b ){
        return true;
    }
    public static boolean Compare_Gender(Customer a, Customer b ){
        return true;
    }
}

