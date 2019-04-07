/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import src.Animal;
import src.House;

/**
 *
 * @author lovro
 */
public class Test_Testable {
    
    public Test_Testable() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
     @Test
     public void HouseRentShouldBe4500() {
         House house = new House(1, "Henlo Street 1", 150);
         int rent = house.calculateRent();
         assertEquals(4500, rent, 0);
     }
     
     @Test
     public void HouseRentShouldBe11250() {
         House house = new House(1, "Henlo Street 2", 225);
         int rent = house.calculateRent();
         assertEquals(11250, rent, 0);
     }
     
     @Test
     public void HouseRentShouldBe900() {
         House house = new House(1, "Henlo Street 3", 90);
         int rent = house.calculateRent();
         assertEquals(900, rent, 0);
     }
     
     @Test
     public void shouldReturnTrue() {
         Animal animal = new Animal(2, true, "ape", null);
         assertTrue(animal.willBeColdDuringWinter());
     }
     
      @Test
     public void shouldReturnFalse() {
         Animal animal = new Animal(2, false, "gorilla", null);
         assertFalse(animal.willBeColdDuringWinter());
     }
}
