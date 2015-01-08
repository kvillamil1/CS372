/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.tutorial;

/**
 *
 * @author Kat
 */
public class converter {
    private double currentCelcius;
    
    public converter(double c) {
        setCelcius(c);
    }
    
    public double getCelcius() {
        return currentCelcius;
    }
    
    public void setCelcius(double c) {
        currentCelcius = c;
    }
    
    public double toFahrenheit() {
        return currentCelcius * (9/5.0) + 32;
    }
}