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
public class MountainTruck extends Truck {
    //the mountain truck subclass adds one field
    public int seatHeight;
    //the mountain truck subclass has one constructor
    public MountainTruck(int startHeight, int startCadence, int startSpeed, int startGear)
    {
     super(startCadence, startGear, startSpeed);
     seatHeight = startHeight;
    }
   //the mountain truck subclass adds one method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }
    public static void main(String[] aku)
    {
     System.out.println("Mulai berjalan");
     MountainTruck MB = new MountainTruck(0,0,0,0);
     System.out.println("gear = "+ MB.gear);
     System.out.println("speed = "+ MB.speed);
     MB.setGear(2);
     MB.speedUp(2);
     System.out.println("gear = "+ MB.gear);
     System.out.println("speed = "+ MB.speed);
     MB.speedUp(2);
     System.out.println("gear = "+ MB.gear);
     System.out.println("speed = "+ MB.speed);
    }
}
