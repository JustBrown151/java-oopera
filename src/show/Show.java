package show;

import person.Actor;
import person.Director;

import java.util.ArrayList;

public class Show {
    private final String title;
    private final Integer duration;
    private final Director director;
    private final ArrayList<Actor> listOfActors;

    public Show(String title, Integer duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public Integer getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void printDirectorInfo() {
        if (director == null) {
            System.out.println("Нет информации о режиссере.");
            return;
        }
        System.out.println(this);
        System.out.println("Режиссер: " + director);
    }

    public void printActorsInfo() {
        if (listOfActors.isEmpty()) {
            System.out.println("Нет информации об актерах.");
            return;
        }
        printDirectorInfo();
        System.out.println("Актеры:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
        System.out.println();
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println(actor + " уже участвует в представлении");
            return;
        }
        listOfActors.add(actor);
    }

    public void replaceActor(Actor actor, Actor otherActor) {
        if (!listOfActors.contains(actor)) {
            System.out.println(actor + " не участвует в представлении.\n");
            return;
        }
        int index = findActor(actor);
        listOfActors.set(index, otherActor);
    }

    private int findActor(Actor actor) {
        int index = 0;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).equals(actor)) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public String toString() {
        return "Представление: " + title;
    }
}
