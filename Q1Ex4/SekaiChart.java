/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04photonmapola;

/**
 *
 * @author Rebecca
 */
public class SekaiChart {
    String name;
    boolean inSekai;
    int exNumNotes;

    public SekaiChart (String name, boolean inSekai, int exNumNotes) { //this is a field
        this.name = name;
        this.inSekai = inSekai;
        this.exNumNotes = exNumNotes;
    }

    public void findChart() { //this is a method
        if (inSekai == true){
        System.out.printf("Name: %s%nIs this in Sekai?: Yes%nNumber of Notes (Expert Mode): %d%n%n", name, exNumNotes);
        } else {
        System.out.printf("Name: %s%nIs this in Sekai?: No%nNumber of Notes (Expert Mode): %d%n%n", name, exNumNotes);
        }
    }
}
