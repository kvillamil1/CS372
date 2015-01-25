/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;
import java.util.*;
/**
 * Calculates the min, max and average for a list of integers.
 * @author Kat
 */
public class UserInputMath {
    
    /**
     * Finds and returns the smallest integer within the list.
     * @param intList
     * @return Collections.min(intList)
     */
    public static int min(ArrayList<Integer> intList) {
        //PT -- You've take data structures. Sort is O()? Is there a
        // more efficient way?
        Collections.sort(intList);
        return Collections.min(intList);
    }
    
    /**
     * Finds and returns the largest integer within the list.
     * @param intList
     * @return Collections.max(intList)
     */
    public static int max(ArrayList<Integer> intList) {
        Collections.sort(intList);
        return Collections.max(intList);
    }
    
    /**
     * Calculates and returns the average of the list.
     * @param intList
     * @return average
     */
    public static double average(ArrayList<Integer> intList) {
        double total = 0;
        
        for(int i =0; i<intList.size();i++) {
            total = total + intList.get(i);
        }
        
        double average = total/intList.size();
        return average;
    }
}
