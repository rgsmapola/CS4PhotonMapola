/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04photonmapola;

/**
 *
 * @author Rebecca
 */
public class Singer {
    String name = " ";
    int noOfPerformances = 0;
    private double earnings = 0;
    private Song favoriteSong;
    static int totalPerformances = 0;
    
    public Singer(String name, int noOfPerformances, double earnings, Song favoriteSong){
        this.name = name;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
        this.favoriteSong = favoriteSong;
    }
    
    public void performForAudience(int audienceNum) {
        int x = audienceNum;
        double y = (x * 100);
        
        System.out.printf("%s just performed %s for an audience of %d!%n", name, favoriteSong.title ,x);
        noOfPerformances ++;
        System.out.printf("%s's number of performances: %d%n", name, noOfPerformances);
        earnings += y;
        System.out.printf("%s earned %.2f! %s's earnings: %.2f%n%n", name, y, name, earnings);
        
        totalPerformances ++;
        System.out.printf("Total performances: %s%n%n", totalPerformances);
    }
    
    public void performForAudience(int audienceNum, Singer collabSinger) {
        int x = audienceNum;
        double y = (x * 100)/2;
        
        System.out.printf("%s and %s just performed %s for an audience of %d!%n%n", name, collabSinger.name, favoriteSong.title, x);
        
        noOfPerformances ++;
        System.out.printf("%s's number of performances: %d%n", name, noOfPerformances);
        earnings += y;
        System.out.printf("%s earned %.2f! %s's earnings: %.2f%n%n", name, y, name, earnings);
    
        collabSinger.noOfPerformances ++;
        System.out.printf("%s's number of performances: %d%n", collabSinger.name, collabSinger.noOfPerformances);
        collabSinger.earnings += y;
        System.out.printf("%s earned %.2f! %s's earnings: %.2f%n%n", collabSinger.name, y, collabSinger.name, collabSinger.earnings);
    
        totalPerformances ++;
        System.out.printf("Total performances: %s%n%n", totalPerformances);
    }
    
    public void changeFavSong(Song newFav){
        favoriteSong = newFav;
        System.out.printf("%s's new favorite song is now %s%n%n", name, newFav.title);
    }
        
    public Song getFavSong(){
        return favoriteSong;
    }
}
