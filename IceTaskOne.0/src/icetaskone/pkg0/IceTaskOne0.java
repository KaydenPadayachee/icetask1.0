/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetaskone.pkg0;

/**
 *
 * @author kpada
 */
public class IceTaskOne0 {

    /**
     * @param args the command line arguments
     * 
     * 
     */
    Animal an = new Animal();
        Bird brd = new Bird();
        Reptile rept = new Reptile();
public class AnimalApp {
    public static void main(String[] args) {
        
        //classes
       Animal an = new Animal();
        Bird brd = new Bird();
        Reptile rept = new Reptile();
// displays info

        System.out.println("Input values for the bird:");
        brd.input();

        System.out.println("\nInput values for the reptile:");
        rept.input();

        System.out.println("\nBird details:");
        System.out.println("ID Tag: " + brd.getIDTag());
        System.out.println("Species: " + brd.getSpecies());
        brd.output();

        System.out.println("\nReptile details:");
        System.out.println("ID Tag: " + rept.getIDTag());
        System.out.println("Species: " + rept.getSpecies());
        rept.output();
    }
}}
       
    