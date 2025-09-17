package education.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Person implements Human {
    private String name;
    private int age;
    @Autowired
    private PeopleSounds sound;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    public void getNameWhenMorning() {
        System.out.println(this.sound.goodMorning() + "my name is " + this.name);
    }
}
