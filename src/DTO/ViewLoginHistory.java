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
public class ViewLoginHistory {
    public int id;
    public String username;
    public int type;
    public String date;;
    
    public ViewLoginHistory() {}

    public ViewLoginHistory(int id, String username, int type, String date) {
        this.id = id;
        this.username = username;
        this.type = type;
        this.date = date;
    }
}
