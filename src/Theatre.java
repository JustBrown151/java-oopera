import person.Actor;
import person.Director;
import person.Person;
import show.Ballet;
import show.Opera;
import show.Show;
import util.Gender;

import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Максим", "Аверин", Gender.MALE, 192);
        Actor actor2 = new Actor("Юрий", "Борисов", Gender.MALE, 177);
        Actor actor3 = new Actor("Мария", "Аронова", Gender.FEMALE, 165);

        Director director1 = new Director("Дмитрий", "Крымов", Gender.MALE, 50);
        Director director2 = new Director("Римас", "Туминас", Gender.MALE, 25);

        Person musician = new Person("Людовико", "Эйнауди", Gender.MALE);
        Person choreographer = new Person("Татьяна", "Баганова", Gender.FEMALE);

        Show show = new Show("Братаны", 90, director1, new ArrayList<>());
        Opera opera = new Opera("Сердце сжато в бронзе", 30, director2, new ArrayList<>(),
                musician, "Текст", 2);
        Ballet ballet = new Ballet("Танец забытых зеркал", 40, director1, new ArrayList<>(),
                musician, "Текст", choreographer);

        // Добавляем актеров в представления
        show.addActor(actor1);
        show.addActor(actor2);
        show.addActor(actor3);

        opera.addActor(actor1);
        opera.addActor(actor3);

        ballet.addActor(actor2);

        // Выводим инфо об актерах для каждого представления
        show.printActorsInfo();
        opera.printActorsInfo();
        ballet.printActorsInfo();

        // Замена актера
        opera.replaceActor(actor1, actor2);
        opera.printActorsInfo();

        // Замена несуществующего актера
        ballet.replaceActor(actor3, actor1);

        // Вывод либретто
        opera.printLibretto();
        ballet.printLibretto();
    }
}
