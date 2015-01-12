/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

/**
 * Calculates PI given a user input for iterations of the series
 * @author Kat
 */
public class PI {
    
    /**
     * Calculates pi given a number of iterations specified in command line.
     * @param place
     * @return pi
     */
    public static double calculatePI(int place) {
        double pi = 4;
        int positive = -1;
        for (int i = 3; i < place; i += 2) {
            //PT -- since the if and else case are almost the same, could you
            //      get rid of them? Hint: -1^n is 1 if n is even, -1 if n is odd
            if (positive == 1) {
                pi += 4.0 / i;
            } 
            else {
                pi -= 4.0 / i;
            }
            positive *= -1;
        }
        System.out.print(pi);
        return pi;
    }
}
