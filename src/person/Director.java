package person;

import util.Gender;

public class Director extends Person {
    private final Integer numberOfShows;

    public Director(String name, String surname, Gender gender, Integer numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public Integer getNumberOfShows() {
        return numberOfShows;
    }


    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }
}
