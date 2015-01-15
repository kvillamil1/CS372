/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;
import java.util.*;
/**
 *
 * @author Kat
 */
public class Rectangle extends Shape {
    
    private int width;
    private int height;
    
    public Rectangle(ArrayList<Integer> recList) {
        if(recList.get(0) == 0 || recList.get(1) == 0){
            System.out.println("This is not a valid Rectangle.\n");
            throw new IllegalArgumentException();
        }
        
        width = recList.get(0);
        height = recList.get(1);
        
    }
    
    public double getArea() {
        double area = width*height;
        return area;
    }

    public double getPerimeter() {
        double perimeter = (width*2)+(height*2);
        return perimeter;
    }
}
