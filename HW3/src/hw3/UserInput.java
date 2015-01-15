/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

import java.util.*;
import hw3.UserInputMath;

/**
 * Takes in user input to either: create a list of numbers and return the min, 
 * max, and average, or create a shape(triangle, rectangle or ellipse) and 
 * return the area and perimeter.
 * @author Kat
 */
public class UserInput {
    
    /**
     * Reads in 10 integers inputted by user and calls min(), max() and average() functions.
     * Prints out results.
     * Exceptions used to catch non-integer inputs.
     */
    public static void getNum() {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        System.out.println("Please enter 10 integers: ");

        for (int i = 0; i < 10; i++) {
            try {
                System.out.print(i + 1 + ") ");
                Scanner input = new Scanner(System.in);
                int num = input.nextInt();
                intList.add(num);
            }
            catch(Exception e) {
                System.out.println("Please enter a valid integer.");
                i--;
            }

        }

        System.out.println("Min: " + UserInputMath.min(intList));
        System.out.println("Max: " + UserInputMath.max(intList));
        System.out.println("Average: " + UserInputMath.average(intList));

    }
    
    /**
     * Creates a triangle by taking in 3 integers inputted by the user and calls
     * the getArea() and getPerimeter() functions. 
     * Prints out results.
     * Exceptions used to catch non-integer inputs and incomplete triangle.
     */
    public static void getTriangle() {
        ArrayList<Integer> triList = new ArrayList<Integer>();
        boolean complete = false;
        
        while(!complete) {
            try {
                for(int i=0; i<3; i++) {
                    try {
                        System.out.printf("Enter Side #%d: ", i+1);
                        Scanner input = new Scanner(System.in);
                        int triNum = input.nextInt();
                        triList.add(triNum);
                    }
                    catch(Exception e) {
                        System.out.println("Please enter a valid integer.");
                        i--;
                    }
                }
                Triangle t = new Triangle(triList);
                complete = true;
                System.out.println("Area: " + t.getArea());
                System.out.println("Perimeter: " + t.getPerimeter());
            }           
            catch(Exception e) {
                triList.clear();
            }
        }
    }
    
    /**
     * Creates a rectangle by taking in 2 integers inputted by the user and calls
     * the getArea() and getPerimeter() functions. 
     * Prints out results.
     * Exceptions used to catch non-integer inputs and incomplete rectangle.
     */
     public static void getRectangle() {
        ArrayList<Integer> recList = new ArrayList<Integer>();
        boolean complete = false;
        
        while(!complete) {
            try {
                for(int i=0; i<2; i++) {
                    try {
                        if(i==0)
                            System.out.print("Enter Width: ");
                        else
                            System.out.print("Enter Height: ");
                        Scanner input = new Scanner(System.in);
                        int recNum = input.nextInt();
                        recList.add(recNum);
                    }
                    catch(Exception e) {
                        System.out.println("Please enter a valid integer.");
                        i--;
                    }
                }
                Rectangle r = new Rectangle(recList);
                complete = true;
                System.out.println("Area: " + r.getArea());
                System.out.println("Perimeter: " + r.getPerimeter());
            }           
            catch(Exception e) {
                recList.clear();
            }
        }
    }
     
     /**
     * Creates an ellipse by taking in 2 integers inputted by the user and calls
     * the getArea() and getPerimeter() functions. 
     * Prints out results.
     * Exceptions used to catch non-integer inputs and incomplete ellipse.
     */
     public static void getEllipse() {
        ArrayList<Integer> ellList = new ArrayList<Integer>();
        boolean complete = false;
        
        while(!complete) {
            try {
                for(int i=0; i<2; i++) {
                    try {
                        if(i==0)
                            System.out.print("Enter Radius(width): ");
                        else
                            System.out.print("Enter Radius(height): ");
                        Scanner input = new Scanner(System.in);
                        int ellNum = input.nextInt();
                        ellList.add(ellNum);
                    }
                    catch(Exception e) {
                        System.out.println("Please enter a valid integer.");
                        i--;
                    }
                }
                Ellipse e = new Ellipse(ellList);
                complete = true;
                System.out.println("Area: " + e.getArea());
                System.out.println("Perimeter: " + e.getPerimeter());
            }           
            catch(Exception e) {
                ellList.clear();
            }
        }
    }
}
