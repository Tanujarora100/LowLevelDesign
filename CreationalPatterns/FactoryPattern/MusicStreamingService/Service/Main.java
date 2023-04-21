package org.CreationalPatterns.FactoryPattern.MusicStreamingService.Service;

import org.CreationalPatterns.FactoryPattern.MusicStreamingService.Factory.IMusic;
import org.CreationalPatterns.FactoryPattern.MusicStreamingService.Factory.MusicPlayerFactory;

public class Main {
    public static void main(String[] args) {
        MusicPlayerFactory factory = new MusicPlayerFactory();
        IMusic rockMusic = factory.createRockMusic("Stairway to Heaven", "Rock", "Led Zeppelin IV");
        rockMusic.play();

        // Create a pop music object and play it
        IMusic popMusic = factory.createPopMusic("Shape of You", "Pop", "2017");
        popMusic.play();

        // Create a classical music object and play it
        IMusic classicalMusic = factory.createClassicalMusic("Für Elise", "Classical", "Beethoven");
        classicalMusic.play();
    }
}
