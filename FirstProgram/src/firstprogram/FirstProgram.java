/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprogram;
import java.util.Scanner; //input a new library

/**
 *
 * @author Kat
 */
public class FirstProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = "Kat";
        //double score = 95.7;
        //System.out.printf("Hello %s your score is %-4.2f.\n", name, (float)score); 
            //(int) static casts the double into an int; (float) for formatting
            // %s = string, %d = digit, %c = character...
            // %4d makes digit fit within four spaces, %-4.2f (float)score is left justify (formatting)
        
        System.out.printf("Hello %s, what is your score? ", name);
        Scanner input = new Scanner(System.in); //**NOTICE when you create a new obj, no need to delete in Java
        int score = input.nextInt();
        System.out.printf("Your score is %d\n", score);
        
    }
    
}
