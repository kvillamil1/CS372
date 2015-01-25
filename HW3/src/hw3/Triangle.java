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
public class Triangle extends Shape {
    private int s1 = 0;
    private int s2 = 0;
    private int s3 = 0;
    
    public Triangle(ArrayList<Integer> triList) {
        //PT -- check for args <= 0 -3
        if(triList.get(0)+triList.get(1)<= triList.get(2) || triList.get(1)+triList.get(2)<= triList.get(0) || triList.get(0)+triList.get(2)<=triList.get(1)) {
            System.out.println("This is not a valid triangle.\n");
            throw new IllegalArgumentException();
        }
        
        s1 = triList.get(0);
        s2 = triList.get(1);
        s3 = triList.get(2);
    }
        
    
    public double getArea() {
     double semiPerim = (s1 + s2 + s3)/2.0;
     double area = Math.sqrt(semiPerim*(semiPerim - s1)*(semiPerim - s2)*(semiPerim - s3));
     return area;
    }

    public double getPerimeter() {
        double perimeter = s1 + s2 + s3;
        return perimeter;
    }
}
