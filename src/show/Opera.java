package show;

import person.Actor;
import person.Director;
import person.Person;

import java.util.ArrayList;

public class Opera extends MusicalShow {
    private final Integer choirSize;

    public Opera(String title, Integer duration, Director director, ArrayList<Actor> listOfActors,
                 Person musicAuthor, String librettoText, Integer choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public Integer getChoirSize() {
        return choirSize;
    }

    @Override
    public void addActor(Actor actor) {
        if (getListOfActors().size() >= choirSize) {
            System.out.println("Количество человек в хоре превышено.");
            return;
        }
        super.addActor(actor);
    }
}
