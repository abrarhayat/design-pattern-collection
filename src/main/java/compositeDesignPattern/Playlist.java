package compositeDesignPattern;

import java.util.ArrayList;

public class Playlist implements IComponent {
    public String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    @Override
    public void play() {
        for (IComponent song : playlist) {
            song.play();
        }
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        for (IComponent song : playlist) {
            song.setPlaybackSpeed(speed);
        }
    }

    @Override
    public String getName() {
        return playlistName;
    }

    public void add(IComponent component) {
        System.out.println("Added!");
        playlist.add(component);
    }

    public void remove(IComponent component) {
        System.out.println("Removed!");
        playlist.remove(component);
    }
}
