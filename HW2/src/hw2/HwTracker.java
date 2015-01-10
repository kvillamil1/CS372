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
public class HwTracker {

    public static double min(ArrayList<Double> homework) {
        Collections.sort(homework);
        return Collections.min(homework);
    }
    
    public static double max(ArrayList<Double> homework) {
        Collections.sort(homework);
        return Collections.max(homework);
    }
    
    public static double average(ArrayList<Double> homework) {
        double scoreTotal = 0;
        
        for(int i =0; i<homework.size();i++) {
            scoreTotal = scoreTotal + homework.get(i);
        }
        
        double average = scoreTotal/homework.size();
        return average;
    }
    
}
