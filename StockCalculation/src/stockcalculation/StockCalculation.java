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
public class StockCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stock stock = new Stock("1122","Ali",34.5,25);
        
       // stock.getPreviousClosingPrice = 34.5;
       // stock.getCurrentPrice = 40;
        System.out.println("Price change percentage : " + stock.getChangePercent());
        
        
    }
    
}
