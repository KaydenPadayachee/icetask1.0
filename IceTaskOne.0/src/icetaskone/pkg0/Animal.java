/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetaskone.pkg0;

import java.util.Scanner;

/**
 *
 * @author kpada
 */

public class Animal{
    //variables
private int IDtag;
    private String species;

    public void input() {
        // uses scanner class
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter ID Tag: ");
        setIDTag(kb.nextInt());
        kb.nextLine();
        System.out.print("Enter species: ");
        setSpecies(kb.nextLine());
    }

    public void output() {
        System.out.println("ID Tag: " + getIDTag());
        System.out.println("Species: " + getSpecies());
    }
// getters and setters
    public int getIDTag() {
        return IDtag;
    }

    public void setIDTag(int IDtag) {
        this.IDtag = IDtag;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
