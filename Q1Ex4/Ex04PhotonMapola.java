/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04photonmapola;

/**
 *
 * @author Rebecca
 */
public class Ex04PhotonMapola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int audienceNum = 12;
        
        Song Ikanaide = new Song("Ikanaide", 3.15);        
        SekaiChart SCIkanaide = new SekaiChart("Ikanaide", true, 977);
        Song Lagtrain = new Song("Lagtrain", 4.12);
        SekaiChart SCLagtrain = new SekaiChart("Lagtrain", false, 0);
        Song DPC = new Song("Drop Pop Candy", 0);
        Singer Yuki = new Singer("Yuki", 0, 0, Ikanaide);
        Singer Miki = new Singer("Miki", 0, 0, DPC);
        
        Yuki.performForAudience(12);
        
        SCIkanaide.findChart();
        
        Yuki.changeFavSong(Lagtrain);
        
        SCLagtrain.findChart();
        
        Miki.performForAudience(2);
        
        Yuki.performForAudience(5);
        
        Yuki.performForAudience(audienceNum, Miki);
    }
}
