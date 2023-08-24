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
class Reptile extends Animal {
    private double bloodTemp;
// input the information
    @Override
    public void input() {
        super.input();
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter blood temperature: ");
        while (!kb.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            kb.next(); // Clear the invalid input
        }
        bloodTemp = kb.nextDouble();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Blood Temperature: " + getBloodTemp());
    }
  // getters and setters of the reptile class
    public double getBloodTemp() {
        return bloodTemp;
    }

    public void setBloodTemp(double bloodTemp) {
        this.bloodTemp = bloodTemp;
    }
}