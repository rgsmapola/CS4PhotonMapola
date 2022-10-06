/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03photonmapola;

/**
 *
 * @author Rebecca
 */
public class Ex03PhotonMapola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int audienceNum = 12;
        
        Song Ikanaide = new Song("Ikanaide", 3.15);
        Song Lagtrain = new Song("Lagtrain", 4.12);
        SekaiChart SCIkanaide = new SekaiChart("Ikanaide", true, 977);
        SekaiChart SCLagtrain = new SekaiChart("Lagtrain", false, 0);
        Singer Yuki = new Singer("Yuki", 0, 0, Ikanaide);
        
        Yuki.performForAudience(12);
        
        SCIkanaide.findChart();
        
        Yuki.changeFavSong(Lagtrain);
        
        SCLagtrain.findChart();
    }
}
