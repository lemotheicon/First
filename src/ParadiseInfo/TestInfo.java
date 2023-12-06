/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParadiseInfo;

/**
 *
 * @author Omolemo
 */
import java.util.Scanner;
public class TestInfo {
public static void main(String[]args)
 {
     double price;
     double discount;
     double savings;
     Scanner keyboard =new Scanner(System.in);
     System.out.println("Enter cutoff price for discount >> ");
     price = keyboard.nextDouble();
     System.out.println("Enter discount rateas a whole number >> ");
     discount = keyboard.nextDouble();
     ParadiseInfo.displayInfo();
     savings = computeDiscountInfo(price,discount);
     System.out.println("Special this week on any service over " + price);
     System.out.println("Discount of " + discount + "percent");
     System.out.println("That's a savings of atleast $ " +  savings);
 }       
  public static double computeDiscountInfo(double price,double discountRate)
          {
              double savings;
              savings = price*discountRate/100;
              return savings;
          }
}
