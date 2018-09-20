/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author PC
 */
public class Truck {
    //the truck class has three fields
    public int cadence;
    public int gear;
    public int speed;
    //the truck class has one constructor
    public Truck(int startcadence, int startgear, int startspeed)
    {
        gear = startgear;
        cadence = startcadence;
        speed = startspeed;
    }
    //the truck class has four method
    public void setCadence(int newValue){
        cadence = newValue;
    }
     public void setGear(int newValue){
        gear = newValue;
     }
      public void applybrake(int decrement){
        speed = decrement;
      }
       public void speedUp(int increment){
        speed = increment;
       }
}
