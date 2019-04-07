/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author lovro
 */
public class Testable {
    public static void main(String[] args) {
         House house = new House(1, "Henlo Street", 150);
         int rent = house.calculateRent();
         System.out.println("RENT --->" + rent);
    }
}
