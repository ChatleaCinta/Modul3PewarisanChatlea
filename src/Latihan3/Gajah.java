/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author PC
 */
public class Gajah {
    public static void testClassMethod()
    {
        System.out.println("The Class Method in Hewan...");
    }
    //meng-override method pada class Animal
    public void testInstanceMethod()
    {
        System.out.println("The Instance Method in Gajah...");
    }
    public static void main(String[] args)
    {
        Gajah myGajah = new Gajah();
        Hewan myHewan = new Hewan();
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
