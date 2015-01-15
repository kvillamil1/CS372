/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;
import java.util.*;

/**
 *
 * @author Kat
 */
public class UnderOver {
    private static int dice1;
    private static int dice2;
    private static int diceSum;
    private static int money;
    private static int total;
    
    
    public static int rollDice() {
        Random rand = new Random();
        dice1 = rand.nextInt(5)+1;
        dice2 = rand.nextInt(5)+1;
        diceSum = dice1 + dice2;
        return diceSum;
    }
    
    public static int setNewMoney() {
        money = 500;
        return money;
    }
    
    public static int underSeven(int bet) {
        if(diceSum < 7)
            money = money + bet;
        else 
            money = money - bet;
        
        return money;
    }
    
    public static int overSeven(int bet) {
        if(diceSum > 7)
            money = money + bet;
        else 
            money = money - bet;
        
        return money;
    }
    
    public static int seven(int bet) {
        if(diceSum == 7)
            money = money + (bet*4);
        else 
            money = money - (bet*4);
        
        return money;
    }
    
    
}
