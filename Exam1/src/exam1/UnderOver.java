/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;
import java.util.*;

/**
 *  Controls gameplay of the Under Over game.
 * @author Kat
 */
public class UnderOver {
    private static int dice1;
    private static int dice2;
    private static int diceSum;
    private static int money;
    private static int total;
    
    /**
     * Assigns each die a random number between 1 and 6 and adds the two numbers
     * together to create a sum.
     * @return 
     */
    public static int rollDice() {
        Random rand = new Random();
        dice1 = rand.nextInt(5)+1;
        dice2 = rand.nextInt(5)+1;
        diceSum = dice1 + dice2;
        return diceSum;
    }
    
    /**
     * Sets money for a new user.
     * @return 
     */
    public static int setNewMoney() {
        money = 500;
        return money;
    }
    
    /**
     * Adjusts money if user bets that diceSum will be under 7.
     * @param bet
     * @return money
     */
    public static int underSeven(int bet) {
        if(diceSum < 7)
            money = money + bet;
        else 
            money = money - bet;
        
        return money;
    }
    
    /**
     * Adjusts money if user bets that diceSum will be over 7.
     * @param bet
     * @return money
     */
    public static int overSeven(int bet) {
        if(diceSum > 7)
            money = money + bet;
        else 
            money = money - bet;
        
        return money;
    }
    
    /**
     * Adjusts money if user bets that diceSum will equal 7.
     * @param bet
     * @return money
     */
    public static int seven(int bet) {
        if(diceSum == 7)
            money = money + (bet*4);
        else 
            money = money - (bet*4);
        
        return money;
    }
    
    
}
