/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.List;

/**
 *
 * @author lovro
 */
public class Animal {
        private int legs;
        private boolean hasFur;
        private String species;
        private List<String> offspring;

        public Animal(int legs, boolean hasFur, String species, List<String> offspring) {
            this.legs = legs;
            this.hasFur = hasFur;
            this.species = species;
            this.offspring = offspring;
        }
        
        private void washAnimal() {
            System.out.println("washing");
        }
        
        private void petAnimal(Animal animal) {
            System.out.println("GJ MATE, YOU'VE PET" + animal.species);
        }
        
        public boolean willBeColdDuringWinter() {
           return this.hasFur;
        }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<String> getOffspring() {
        return offspring;
    }

    public void setOffspring(List<String> offspring) {
        this.offspring = offspring;
    }
        
        private void feedAnimal(Animal animal) {
            System.out.println("FEED THAT" + animal);
        }
        
        private void printOffspring() {
            for (int i = 0; i < offspring.size(); i++) {
                System.out.println(offspring.get(i));
            }
        }
        
    }

