/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;

/**
 * Contains the main function for HW1
 * @author Kat
 */
public class HW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //PR1_1: Data Only
            DataOnly d = new DataOnly();
            d.i = 47;
            d.f = 1.1f;
            d.b = false;
            
            System.out.println("PR1_1: Data Only");
            System.out.printf("The value for 'i' is: %d\n", d.i);
            System.out.printf("The value of 'f' is: %-1.1f\n", d.f);
            System.out.printf("The value of 'b' is: %b\n\n", d.b);
         
        //PR1_2: Iterating Arguments
            System.out.println("PR1_2: Iterating Arguments");
            String greeting = "Hello world\n";
            
            //Different languages for the greeting can be specified in the command line
            if (args.length > 0 && args[0].equalsIgnoreCase("spanish"))
                greeting = "hola mundo\n";
            if (args.length > 0 && args[0].equalsIgnoreCase("fillipino"))
            //PT: Well done, I like this. I'll need to learn how to pronounce it, though!
                greeting = "Kamusta mundo\n";
            if (args.length > 0 && args[0].equalsIgnoreCase("swahili"))
            //PT: And I'd like to hear how this is pronounced, too.
                greeting = "Wapendwa dunia\n";
            System.out.println(greeting);
        
        //PR1_3: JavaDoc
            //Documentation is above in PR1_2
        
        //PR1_4: Area of a Circle
            CircleArea.getArea();
        
        //PR1_5: Random Numbers
            RandomNumbers.generateRandomNumbers();
            
        //PR1_6: Prime Numbers
            PrimeNumbers.listPrime();
    }
}
