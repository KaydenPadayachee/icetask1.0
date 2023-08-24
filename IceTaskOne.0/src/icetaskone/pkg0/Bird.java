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
class Bird extends Animal {
    private int featherColour;

    @Override
    public void input() {
        super.input();
        Scanner kb = new Scanner(System.in);
        System.out.println("Select feather colour:");
        System.out.println("1: Grey");
        System.out.println("2: White");
        System.out.println("3: Black");
        setFeatherColour(kb.nextInt());
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Feather Colour: " + getFeatherColourString());
    }
    // getters and setters of the bird class

    public int getFeatherColour() {
        return featherColour;
    }

    public void setFeatherColour(int featherColour) {
        this.featherColour = featherColour;
    }
//shows the choices in a switch case
    private String getFeatherColourString() {
        switch (featherColour) {
            case 1:
                return "Grey";
            case 2:
                return "White";
            case 3:
                return "Black";
            default:
                return "Unknown";
        }
        
        
            
        }
    }
