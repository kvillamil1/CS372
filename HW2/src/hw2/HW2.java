/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;
import java.util.*;

/**
 *  Main class for HW2
 * @author Kat
 */
public class HW2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //PR2_1: Gerbil ArrayList && PR2_2: Gerbil Iterator
        Gerbil.makeList();
        
        //PR2_3: Gerbil Map
        Gerbil.makeMap();
       
        //PR2_4: Calculating PI
        int i = Integer.parseInt(args[0]);
        PI.calculatePI(i);
        
        //PR2_5: GUI PI
            //Work done in GUIpi.java
        
        //PR2_6: Homework Tracker
            //Work done in GUItracker.java & HwTracker.java
    }
    
}
