package EXAMEN;

import java.util.ArrayList;

import java.util.ArrayList;

public class Playlist {
    String id;
    String name;
    ArrayList<Song> songs;
    ArrayList<User> likedBy;

    public Playlist(String id, String name) {
        this.id = id;
        this.name = name;
        this.songs = new ArrayList<>();
        this.likedBy = new ArrayList<>();
    }

    public void addToPlaylist(Song song) {
        songs.add(song);
    }

    public void addToPlaylist(Album album) {
        for (Song song : album.songs) {
            songs.add(song);
        }
    }

    public void removeById(String songId) {
        songs.removeIf(song -> song.id.equals(songId));
    }

    public void like(User user) {
        if (likedBy.contains(user)) {
            likedBy.remove(user);
        } else {
            likedBy.add(user);
        }
    }

    public Playlist exclude(String[] genres) {
        Playlist newPlaylist = new Playlist(this.id + "_excluded", this.name + " (Excluding Genres)");
        for (Song song : songs) {
            boolean exclude = false;
            for (String genre : genres) {
                if (containsGenre(song.genres, genre)) {
                    exclude = true;
                    break;
                }
            }
            if (!exclude) {
                newPlaylist.addToPlaylist(song);
            }
        }
        return newPlaylist;
    }

    private boolean containsGenre(String[] songGenres, String genre) {
        for (String songGenre : songGenres) {
            if (songGenre.equals(genre)) {
                return true;
            }
        }
        return false;
    }

    public int countPlaylist(Song song) {
        int count = 0;
        for (Song s : songs) {
            if (s.id.equals(song.id)) {
                count++;
            }
        }
        return count;
    }

    public int getTotalLikes() {
        return likedBy.size();
    }
}

