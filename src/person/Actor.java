package person;

import util.Gender;

import java.util.Objects;

public class Actor extends Person {
    private final Integer height;

    public Actor(String name, String surname, Gender gender, Integer height) {
        super(name, surname, gender);
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Actor otherActor = (Actor) obj;
        return Objects.equals(name, otherActor.name)
                && Objects.equals(surname, otherActor.surname)
                && Objects.equals(height, otherActor.height);
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + height + ")";
    }
}