/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;
import java.util.*;
import java.io.*;

/**
 *
 * @author Kat
 */
public class RestaurantReview {
    public static void saveReview(ArrayList<String> reviews) {
         File file = new File("/Users/Kat/Documents/GitHub/CS372/HW3/Ratings.txt");
        try {
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(file, true));
            for (int i = 0; i < reviews.size(); i++) {
                wrtr.write(reviews.get(i));
                wrtr.newLine();
            }

            wrtr.close();
        } catch (Exception ex) {
            System.out.println("Error with file!");
        }
    }
    
    public static Vector<Vector<String>> loadReview() {
        Vector<Vector<String>> loaded_reviews = new Vector<Vector<String>>();
        
        File f = new File("/Users/Kat/Documents/GitHub/CS372/HW3/Ratings.txt");
        String line;
        String[] review;
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            
            while ((line = rdr.readLine()) != null) {
                review = line.split(",");
                Vector<String> tmp = new Vector<String>();
                for(int i=0; i<review.length; i++) {
                    tmp.add(review[i]);
                }
                loaded_reviews.add(tmp);

            }
            rdr.close();
        } catch (Exception ex) {
            System.out.println("Error!");
        }
        
        return loaded_reviews;
    }  
}
