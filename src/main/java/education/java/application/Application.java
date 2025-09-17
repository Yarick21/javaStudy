package education.java.application;

import education.java.service.Human;
import education.java.service.Person;

class Application {

    public static void main(String... args) {
        Person myself = new Person("Yarick", 25);
        myself.getNameWhenMorning();
//        System.out.println(myself.getAge() + myself.getName());
    }
}
