/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;
import java.util.*;

/**
 * Assigns gerbil objects a number and allows them to hop.
 * @author Kat
 */
public class Gerbil {

    private int gerbilNumber;
    
    /**
     * Assigns number to gerbils
     * @param i 
     */
    public Gerbil(int i) {
        gerbilNumber = i+1;
    }

    /**
     * Overload <code>toString()</code> to print out Gerbil numbers
     * @return <code>gerbilNumber</code>
     */
    public String toString() {
        return "Gerbil #" + gerbilNumber;
    }
    
    /**
     * Allows gerbils to "hop" (Prints out gerbil number and " is hopping").
     */
    public void hop() {
        System.out.println(toString() + " is hopping");
    }
    
    public static void makeList() {
        //PR2_1
        System.out.println("PR2_1: Gerbil ArrayList");
        ArrayList gerbils = new ArrayList<Gerbil>();
        for (int i = 0; i < 10; i++) {
            gerbils.add(new Gerbil(i));
        }
        for (int i = 0; i < gerbils.size(); i++) {
            ((Gerbil) gerbils.get(i)).hop();
        }
        System.out.print("\n");
        
        //PR2_2
        System.out.println("PR2_2: Gerbil Iterator");
        Iterator g = gerbils.iterator();
        while(g.hasNext()) //While there is still another gerbil in the list
            ((Gerbil)g.next()).hop();
        System.out.print("\n");
    }
    
    public static void makeMap() {
        System.out.println("PR2_3: Gerbil Map");
        Map<String, Gerbil> gerbilsmap = new HashMap<String, Gerbil>();
		gerbilsmap.put("Oliver", new Gerbil(0));
		gerbilsmap.put("Dodge", new Gerbil(1));
		gerbilsmap.put("Bill", new Gerbil(2));
		gerbilsmap.put("Lyle", new Gerbil(3));
		gerbilsmap.put("Thoen", new Gerbil(4));
		gerbilsmap.put("Samson", new Gerbil(5));
		Iterator<String> it = gerbilsmap.keySet().iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.print(s + ": ");
			gerbilsmap.get(s).hop();
		}
    }
}

