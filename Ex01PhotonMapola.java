/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01photonmapola;

/**
 *
 * @author Rebecca
 */
public class Ex01PhotonMapola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Names
        String name1 = "Miku";
        String name2 = "Luka";
        String name3 = "Rin";
        // Release years
        int rlyr1 = 2007;
        int rlyr2 = 2009;
        int rlyr3 = 2008;
        // Hair colours
        String hc1 = "Blue";
        String hc2 = "Pink";
        String hc3 = "Yellow";
       // Operations
        boolean op1 = rlyr1 < rlyr2;
        boolean op2 = (hc2 == hc3);
        int op3 = rlyr1 + rlyr2 + rlyr3;
        
        System.out.printf("Vocal 1 %n Name: %s.%n Released: %d.%n Hair color: %s.%n%n", name1, rlyr1, hc1);
        System.out.printf("Vocal 2 %n Name: %s.%n Released: %d.%n Hair color: %s.%n%n", name2, rlyr2, hc2);
        System.out.printf("Vocal 3 %n Name: %s.%n Released: %d.%n Hair color: %s.%n%n", name3, rlyr3, hc3); 
        
        System.out.printf("Miku was released before Luka: %b.%n",  op1);
        System.out.printf("Luka and Rin have the same hair color: %b.%n",  op2);
        System.out.printf("Sum of their release years: %d.%n",  op3);
        // TODO code application logic here
    }
    
}
