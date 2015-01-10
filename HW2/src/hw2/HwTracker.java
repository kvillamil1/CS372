/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.util.ArrayList;


/**
 *
 * @author Kat
 */
public class HwTracker {
    private int scoreTotal = 0;
    private int scoreCount = 10;
    private int minimum=0;
    private int maximum=0;
    private double average=0;
    ArrayList homework = new ArrayList<HwTracker>();

    public int min() {
        for (int i = 0; i < homework.size(); i++) {
            ((HwTracker) homework.
        return minimum;
    }
    
    public int max() {
        return maximum;
    }
    
    public int total() {
        return scoreTotal;
    }
    
    public double average() {
        average = scoreTotal/scoreCount;
        return average;
    }
    
}
