/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;
import java.time.*;
import javax.swing.*;

/**
 * Validates event dates entered by user.
 * @author Kat
 */
public class EventValidate {

    /**
     * Uses the java.time library to check if user-entered dates are valid.
     * @param m month
     * @param d day
     * @param y year
     * @return dateIsValid (boolean value)
     */
    public static boolean validate(int m, int d, int y) {
        boolean dateIsValid = true;
        try {
            LocalDate.of(y, m, d);
        } catch (DateTimeException e) {
            dateIsValid = false;
        }
        return dateIsValid;
    }
    
    public static void popup(String pop) {
        JFrame frame = new JFrame("");
        JOptionPane.showMessageDialog(frame, pop);
    }

}
