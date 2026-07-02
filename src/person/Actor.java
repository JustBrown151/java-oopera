package person;

import util.Gender;

import java.util.Objects;

public class Actor extends Person {
    private final Integer height;

    public Actor(String name, String surname, Gender gender, Integer height) {
        super(name, surname, gender);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), height);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Actor otherActor = (Actor) obj;
        return Objects.equals(this.getName(), otherActor.getName())
                && Objects.equals(this.getSurname(), otherActor.getSurname())
                && Objects.equals(height, otherActor.height);
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " (" + height + ")";
    }

}