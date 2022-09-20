/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02photonmapola;
import java.util.Scanner;

/**
 *
 * @author Rebecca
 */
public class Ex02PhotonMapola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        int guess;
        int random = (int) Math.floor(Math.random()*10) + 1;
        
        do{System.out.println("Welcome to Higher or Lower! What will you do?\n" +
            "-Start game (S)\n" +
            "-Change settings (C)\n" +
            "-End application (E)\n");
            input = sc.nextLine();
            String randomS = String.valueOf(random);
            switch (input){
                case ("S"):
                    System.out.println("Start game!\n");
                    System.out.printf("insert number %n");
                    input = sc.nextLine();
                       do {
                           System.out.println("Keep guessing.L..")
                       }
                    break;
                case ("C"):
                    System.out.println("chhange \n");
                    break;
                default:
                    System.out.println("default... \n");
                    break;
            }
        }
        while(!input.equalsIgnoreCase("E"));
        // TODO code application logic here
    }   
}
