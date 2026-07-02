package show;

import person.Actor;
import person.Director;
import person.Person;

import java.util.ArrayList;

public class MusicalShow extends Show {

    private final Person musicAuthor;
    private final String librettoText;

    public MusicalShow(String title, Integer duration, Director director, ArrayList<Actor> listOfActors,
                       Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void printLibretto() {
        printDirectorInfo();
        System.out.println("Либретто:\n" + librettoText);
        System.out.println();
    }
}
