/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03photonmapola;

/**
 *
 * @author Rebecca
 */
public class Singer {
    String name = " ";
    int noOfPerformances = 0;
    double earnings = 0;
    Song favoriteSong;
    
    public Singer(String name, int noOfPerformances, double earnings, Song favoriteSong){
        this.name = name;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
        this.favoriteSong = favoriteSong;
    }
    
    public void performForAudience(int audienceNum) {
        int x = audienceNum;
        System.out.printf("%s just performed for an audience of %d!%n", name, x);
        noOfPerformances += 1;
        System.out.printf("%s's number of performances: %d%n", name, noOfPerformances);
        earnings += (x * 100);
        System.out.printf("%s's earnings: %.2f%n%n", name, earnings);
    }
    
    public void changeFavSong(Song newFav){
        favoriteSong = newFav;
        System.out.printf("%s's new favorite song is now %s%n%n", name, newFav.title);
    }
}
