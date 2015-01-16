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
         File file = new File("/Users/Kat/Documents/GitHub/CS372/HW3/Events.txt");
        try {
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(file, true));
            for (int i = 0; i < events.size(); i++) {
                wrtr.write(events.get(i));
                wrtr.newLine();
            }

            wrtr.close();
        } catch (Exception ex) {
            System.out.println("Error with file!");
        }
    }
    
    /**
     * Reads in an existing text file of events and places them into a vector for loading.
     * @return loaded_events (vector)
     * @throws FileNotFoundException 
     */
    public static Vector<Vector<String>> loadEvent() {
        Vector<Vector<String>> loaded_events = new Vector<Vector<String>>();
        
        File f = new File("/Users/Kat/Documents/GitHub/CS372/HW3/Events.txt");
        String line;
        String[] event;
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            
            while ((line = rdr.readLine()) != null) {
                event = line.split(",");
                Vector<String> tmp = new Vector<String>();
                for(int i=0; i<event.length; i++) {
                    tmp.add(event[i]);
                }
                loaded_events.add(tmp);

            }
            rdr.close();
        } catch (Exception ex) {
            System.out.println("Error!");
        }
        
        return loaded_events;
    }  
}
