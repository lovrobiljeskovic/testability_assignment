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
public class House {
    private int houseNumber;
    private String address;
    private int squaremeters;
    
    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public House(int houseNumber, String address, int squaremeters) {
        this.houseNumber = houseNumber;
        this.address = address;
        this.squaremeters = squaremeters;
    }
    
    public int calculateRent() {
        if(this.squaremeters < 100) {
            return this.squaremeters * 10;
        } else if(this.squaremeters > 100 && this.squaremeters < 200) {
            return this.squaremeters * 30;
        } else if (this.squaremeters > 200) {
            return this.squaremeters * 50;
        }
        return 0; 
    }
}
