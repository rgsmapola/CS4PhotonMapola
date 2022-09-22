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
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String yesno = " ";
        int input, answer;
        int guess = 3;
        int max = 10;
        
        do{System.out.println("""
                              Welcome to Higher or Lower! What will you do?
                              -Start game (1)
                              -Change settings (2)
                              -End application (3)
                              """);
            input = sc.nextInt();
            switch (input){
                case (1) -> {
                    do {
                    int random = (int) Math.floor(Math.random()*max) + 1;
                    for (int i = guess; 0 < i; i--){
                        // you have ... numbr of guesses, input answer3
                        System.out.printf("You have %d of guesses left. What is your guess? ", i);
                        answer = sc.nextInt();
                            if (answer == random){
                                    // right guess yay do you wanna continue the game y/n
                                    System.out.print("You got it! \n");
                                    System.out.println("Play again? (y/n)");
                                    yesno = sc.nextLine();
                                        if (((yesno.equals("y"))||(yesno.equals("n"))) == false) {
                                            System.out.println("You entered something not on the menu.");
                                            System.out.println("Play again? (y/n)");
                                            yesno = sc.nextLine();
                                        }
                            }else if (answer > random){
                                    if (i == 1){
                                        System.out.println("You lost...\n");
                                        System.out.println("Play again? (y/n)");
                                        yesno = sc.nextLine();
                                            if (((yesno.equals("y"))||(yesno.equals("n"))) == false) {
                                                System.out.println("You entered something not on the menu.");
                                                System.out.println("Play again? (y/n)");
                                                yesno = sc.nextLine();
                                            }
                                    }else{
                                        // wrong guess keep guessing
                                        System.out.print("Guess lower! ");
                                    }
                            }else{
                                    if (i == 1){
                                        System.out.println("You lost...\n");
                                        System.out.println("Play again? (y/n)");
                                        yesno = sc.nextLine();
                                            if (((yesno.equals("y"))||(yesno.equals("n"))) == false) {
                                                System.out.println("You entered something not on the menu.");
                                                System.out.println("Play again? (y/n)");
                                                yesno = sc.nextLine();
                                            }
                                    }else{
                                        // wrong guess keep guessing
                                        System.out.print("Guess higher! ");
                                    }
                            }
                    }
                    }while(yesno.equalsIgnoreCase("y"));
                    break;
                }
                        // you have 0 more gueesses, you lose
                        // do you wanna continue the game y/n
                        // y = new number
                        // n = back to menu
                case (2) -> {
                        System.out.println("What would you like to change?\n" +
                            "Upper limit (1)\n" +
                            "Number of guesses (2)");
                            input = sc.nextInt();
                                    if (input == 1){
                                        //What is the upper limit of the random number?
                                        System.out.println("What is the upper limit of the random number?");
                                        max = sc.nextInt();
                                    } else if (input == 2) {
                                        //How many guesses are allowed?                                            
                                        System.out.println("How many guesses are allowed?");
                                        guess = sc.nextInt();
                                    } else {
                                        System.out.println("You entered something not on the menu.\n");
                                    }
                        break;
                }
                case (3) -> {
                    break;
                }
                default -> {
                        System.out.println("You entered something not on the menu. \n");
                        break;
                        }
                    }   
        }while(!(input == 3));
    } 
}
        
