/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.nontestable;

import java.util.List;

/**
 *
 * @author lovro
 */
public class Nontestable {
    
    public static class Animal {
        public static int legs;
        public boolean hasFur;
        public static String species;
        public static List<String> offspring;
        
        public static void washAnimal() {
            System.out.println("washing");
        }
        
        private static void petAnimal(Animal animal) {
            System.out.println("GJ MATE, YOU'VE PET" + Animal.species);
        }
        
        public static void feedAnimal(Animal animal) {
            System.out.println("FEED THAT" + animal);
        }
        
        public static void printOffspring() {
            for (int i = 0; i < offspring.size(); i++) {
                System.out.println(offspring.get(i));
            }
        }
        
        private boolean willBeColdDuringWinter() {
           return this.hasFur;
        }
        
    }
    
    private class House {
        private String address;
        private int houseNumber;
        private int rooms;
    }
    
    public static void main(String[] args) {
    }
}
