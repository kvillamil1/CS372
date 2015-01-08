/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;
import java.util.Scanner;

/**
 * Calculates the area of circle given a radius inputted by the user.
 * @author Kat
 */
public class CircleArea {
    
    /**
     * User inputs a radius and function calculates the area for the circle.
     */
    public static void getArea() {
        System.out.println("PR1_4: Area of a Circle");
        System.out.print("Enter the size of the circle's radius: ");
            Scanner input = new Scanner(System.in);
            int radius = input.nextInt();
            final double PI = 3.14;
            double area = radius*radius*PI;
            System.out.println("The area of the circle is: " + area + "\n");
    }
}
