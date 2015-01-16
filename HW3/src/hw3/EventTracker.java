/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;
import java.util.*;
import java.io.*;
/**
 * Handles the File I/O (save event or load event) for the Event Tracker. 
 * @author Kat
 */
public class EventTracker {
    
    /**
     * Creates a text file that events (submitted by user) are written and saved to.
     * @param events 
     */
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
    
    /**
     * Reads in an existing text file of events and places them into a vector for loading.
     * **NOT WORKING (FILE CAN'T BE FOUND)
     * @return loaded_events (vector)
     * @throws FileNotFoundException 
     */
    public static Vector<String> loadEvent() {
        Vector<String> loaded_events = new Vector<String>();
        
        File f = new File("Events.txt");
        String line;
        String[] date;
        String[] name_loc;
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(f));

            while ((line = rdr.readLine()) != null) {
                name_loc = line.split(" ");
                date = name_loc[2].split("/");
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
