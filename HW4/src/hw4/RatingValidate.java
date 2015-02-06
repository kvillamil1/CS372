/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;
import javax.swing.*;

/**
 *
 * @author Kat
 */
public class RatingValidate {
    public static boolean validate(int r) {
        boolean rateIsValid;
        
        if( r>=1 && r<=5)//PT -- very good
            rateIsValid = true;
        else
            rateIsValid = false;
        
        return rateIsValid;
    }
    //PT -- javadoc? -4
    public static void popup(String pop) {
        JFrame frame = new JFrame("");
        JOptionPane.showMessageDialog(frame, pop);
    }
}
