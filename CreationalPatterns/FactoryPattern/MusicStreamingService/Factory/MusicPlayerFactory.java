package org.CreationalPatterns.FactoryPattern.MusicStreamingService.Factory;

public class MusicPlayerFactory {
    public IMusic createRockMusic(String name, String description, String composer) {
        return new RockMusic(name, description, composer);
    }

    public IMusic createPopMusic(String name, String description, String composer) {
        return new PopMusic(name, description, composer);
    }

    public IMusic createClassicalMusic(String name, String description, String composer)  {
        return new ClassicalMusic(name, description, composer);
    }
}
