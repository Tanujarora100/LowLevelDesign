package org.CreationalPatterns.FactoryPattern.MusicStreamingService.Factory;

public class PopMusic implements IMusic{
    private final String name;
    private final String description;
    private final String composer;


    public PopMusic(String name, String description, String composer) {
        this.name = name;
        this.description = description;
        this.composer = composer;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void play() {
        System.out.println("Playing " + composer + "'s " + "Genre is " + description);
        // Code to actually play the music here
    }
}
