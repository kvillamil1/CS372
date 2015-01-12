/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;
import java.util.*;

/**
 * 
 * @author Kat
 */
public class CookieSales {
    
    //PT -- why make these static, instead of using three ArrayList
    //      member variables, and adding values to them?
    public static int samoas(ArrayList<Integer> cookies) {
        int total = 0;
        
        for(int i=0; i<cookies.size();i++) {
            total = total + cookies.get(i);
        }
        
        return total;
    }
    
    public static int thinMints(ArrayList<Integer> cookies) {
        int total = 0;
        
        for(int i=0; i<cookies.size();i++) {
            total = total + cookies.get(i);
        }
        
        return total;
    }
    
    public static int chocoChip(ArrayList<Integer> cookies) {
        int total = 0;
        
        for(int i=0; i<cookies.size();i++) {
            total = total + cookies.get(i);
        }
        
        return total;
    }
    
    public static double salesTotal(ArrayList<Integer> samoas, 
                ArrayList<Integer> thinmints, ArrayList<Integer> chocochip) {
        
        double finalTotal =0;
        double sPrice = 4.00;
        double tPrice = 3.00;
        double cPrice = 5.00;
        double sTotal = 0;
        double tTotal = 0;
        double cTotal = 0;
       
        for(int i=0; i<chocochip.size() && i<thinmints.size() && i<samoas.size(); i++) {
            cTotal = cPrice * chocochip.get(i);
            sTotal = sPrice * samoas.get(i);
            tTotal = tPrice * thinmints.get(i);
            finalTotal += cTotal + sTotal + tTotal;
        }
        
        return finalTotal;
    }
}
