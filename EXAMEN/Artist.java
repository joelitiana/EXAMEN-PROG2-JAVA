package EXAMEN;

public abstract class Artist {
    String id;
    String sceneName;
    int debut;
    String nationality;

    public Artist(String id, String sceneName, int debut, String nationality) {
        this.id = id;
        this.sceneName = sceneName;
        this.debut = debut;
        this.nationality = nationality;
    }
}

class SoloArtist extends Artist {
    String firstName;
    String lastName;
    String birthDate;

    public SoloArtist(String id, String stageName, int debutYear, String nationality,
                      String firstName, String lastName, String birthDate) {
        super(id, stageName, debutYear, nationality);
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
}

class Group extends Artist {
    SoloArtist[] members;

    public Group(String id, String stageName, int debutYear, String nationality, SoloArtist[] members) {
        super(id, stageName, debutYear, nationality);
        this.members = members;
    }
}


