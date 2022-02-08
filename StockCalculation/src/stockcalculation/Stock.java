/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockcalculation;

/**
 *
 * @author Chew Teng
 */
public class Stock {
    
    private String symbol;
    private String name;
    private double previousClosingPrice; // The stock price for the previous day
    private double currentPrice; // The stock price for the current time
    
    Stock(String symbol,String name,double previousClosingPrice,double currentPrice){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice=currentPrice;
    }
    
    /*public double previousClosingPrice(){
        return previousClosingPrice;
    }
    
    public double currentPrice(){
        return currentPrice;
    }
    */
    public double getChangePercent() {

       return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;

   }
}
