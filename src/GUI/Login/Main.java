/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI.Login;

/**
 *
 * @author RoXen
 */
public class Main {
    public static void main(String[] args) {
        
        try {
            SpalshScreenJFrame screen = new SpalshScreenJFrame();
            LoginJFrame sign = new LoginJFrame();
            screen.setVisible(true);
            for (int row = 0; row <=100; row+=2) {
                Thread.sleep(50);
                screen.loadingnumber.setText(Integer.toString(row)+"%");
                screen.loadingprogress.setValue(row);
                if (row == 100) {
                    screen.setVisible(false);
                    sign.setVisible(true);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
