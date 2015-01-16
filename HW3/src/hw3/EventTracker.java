/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;
import java.util.*;
import java.io.*;
/**
 *
 * @author Kat
 */
public class EventTracker {
    
    public static void saveEvent(ArrayList<String> events) {
         File file = new File("Events.txt");
        try {
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < events.size(); i++) {
                wrtr.write(events.get(i) + "\n");
            }

            wrtr.close();
        } catch (Exception ex) {
            System.out.println("Error with file!");
        }
    }
    
    public static Vector<String> loadEvent() throws FileNotFoundException {
        Vector<String> loaded_events = new Vector<String>();
        
        File f = new File("Events.txt");
        String line;
        String[] date;
        String[] name_loc;
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(f));

            while ((line = rdr.readLine()) != null) { //read to the end of the file
                name_loc = line.split("~ "); //split items based on "~ "
                date = name_loc[2].split("/"); //splits date based on "/"
                if (name_loc.length == 3) {
                    String new_event = name_loc[0] + name_loc[1] + date[0] + date[1] + date[2];
                    loaded_events.add(new_event);
                }

            }
            rdr.close();
        } catch (Exception ex) {
            System.out.println("Error!");
        }
        
        return loaded_events;
    }  
}
