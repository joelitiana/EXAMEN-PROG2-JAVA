package EXAMEN;

import java.util.ArrayList;

public class User {
    String id;
    String name;
    ArrayList<Playlist> favoritePlaylists;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.favoritePlaylists = new ArrayList<>();
    }

    public void addFavoritePlaylist(Playlist playlist) {
        if (favoritePlaylists.contains(playlist)) {
            favoritePlaylists.remove(playlist);
        } else {
            favoritePlaylists.add(playlist);
        }
    }
}



