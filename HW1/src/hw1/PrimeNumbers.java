/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;

/**
 * Lists the prime numbers from 1-100.
 * @author Kat
 */
public class PrimeNumbers {
    /**
     * Finds and prints prime numbers from 1-100.
     */
    public static void listPrime() {
        System.out.println("PR1_6: Prime Numbers");
        System.out.println("List of prime numbers from 1-100:");
        for (int i=1; i<=100; i++) {
                for (int j=1; j <= i; j++) {
                    //PT: If your for loop starts at 2, and ends when j <= i/2, your
                    //    if statements will be much cleaner
                    if (i % j == 0 && i != j && j!= 1) {
                        break;
                    }
                    if (i == j && i!= 1)
                        System.out.print(i+"  ");
                }
            }
        System.out.print("\n");
    }
    
    
}
