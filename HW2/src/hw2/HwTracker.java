/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.util.*;


/**
 * Creates a list to hold homework scores and calculates the lowest, highest
 * and average scores.
 * @author Kat
 */
public class HwTracker {
    
    /**
     * Searches through the homework list and returns the lowest score.
     * @param homework
     * @return the lowest score in the homework list
     */
    public static double min(ArrayList<Double> homework) {
        Collections.sort(homework);
        return Collections.min(homework);
    }
    
    /**
     * Searches through the homework list and returns the highest score.
     * @param homework
     * @return the highest score in the homework list
     */
    public static double max(ArrayList<Double> homework) {
        Collections.sort(homework);
        return Collections.max(homework);
    }
    
    /**
     * Calculates the average score in the homework list.
     * @param homework
     * @return the average score in the homework list
     */
    public static double average(ArrayList<Double> homework) {
        double scoreTotal = 0;
        
        for(int i =0; i<homework.size();i++) {
            scoreTotal = scoreTotal + homework.get(i);
        }
        
        double average = scoreTotal/homework.size();
        return average;
    }
    
}
