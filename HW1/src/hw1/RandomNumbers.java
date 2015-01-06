/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;
import java.util.Random;

/**
 * Compares two random numbers from 1-25.
 * @author Kat
 */
public class RandomNumbers {
    /**
     * Compares two numbers between 1 and 25 and determines if the first is 
     * greater than, less than, or equal to, the second number.
     */
    public static void generateRandomNumbers() {
        System.out.println("PR1_5: Random Numbers");
        Random rand = new Random();
            for(int i=0; i<25; i++) {
                int j = rand.nextInt(10)+1;
                int k = rand.nextInt(25)+1;
                if(j<k)
                    System.out.println(j+" is less than "+k);
                else if(j>k)
                    System.out.println(j+ " is greater than "+k);
                else 
                    System.out.println(j+ " is equal to "+k);
                
            }
        System.out.print("\n");
    }
}
