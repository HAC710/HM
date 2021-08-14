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
public class LoginHistory {
    public int id;
    public String username;
    public int type;
    public String date;
    
    public LoginHistory() {}

    public LoginHistory(int id, String username, int type, String date) {
        this.id = id;
        this.username = username;
        this.type = type;
        this.date = date;
    }

    

    public static boolean Compare_ID(LoginHistory a, LoginHistory b ){
        return a.id > b.id;
    }
    public static boolean Compare_Username(LoginHistory a, LoginHistory b ){
        return a.username.equals(b.username);
    }
    
    public static boolean Compare_Type(LoginHistory a, LoginHistory b ){
        return a.type > b.type;
    }
    
    public static boolean Compare_date(LoginHistory a, LoginHistory b ){
        return a.date.equals(b.date);
    }
    
}
