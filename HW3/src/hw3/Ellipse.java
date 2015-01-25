/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;
import java.lang.Math;
import java.util.*;

/**
 * 
 * @author Kat
 */
public class Ellipse extends Shape {
    
    private int rWidth;
    private int rHeight;
    
    public Ellipse(ArrayList<Integer> ellList) {
        //PT -- <= 0
        if(ellList.get(0) == 0 || ellList.get(1) == 0){
            System.out.println("This is not a valid Ellipse.\n");
            throw new IllegalArgumentException();
        }
        
        rWidth =  ellList.get(0);
        rHeight = ellList.get(1);
    }
    
    public double getArea() {
        double area = (Math.PI)*rWidth*rHeight;
        return area;
    }

    public double getPerimeter() {
        double perimeter = (2.0*Math.PI)*Math.sqrt(((rWidth*rWidth)+(rHeight*rHeight))/2.0);
        return perimeter;
    }
}
