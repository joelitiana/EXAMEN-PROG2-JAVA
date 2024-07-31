package EXAMEN;

public class Album {
    String id;
    String name;
    String releaseDate;
    Song[] songs;

    public Album(String id, String name, String releaseDate, Song[] songs) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.songs = songs;
    }
}


