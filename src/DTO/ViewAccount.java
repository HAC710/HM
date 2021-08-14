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
public class ViewAccount {
    
    public int id;
    public String username;
    public String displayname;
    public String password;
    public int type;
    
    public ViewAccount() {}

    public ViewAccount(int id, String username, String displayname, String password, int type) {
        this.id = id;
        this.username = username;
        this.displayname = displayname;
        this.password = password;
        this.type = type;
    }
    
}