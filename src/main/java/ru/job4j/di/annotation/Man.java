package ru.job4j.di.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Man {
    @Autowired
    private Dog dog;

    @Autowired
    @Qualifier("SecondDog")
    private Dog dog1;
    private Cat cat;
    private Bird bird;

    @Autowired
    public Man(Cat cat) {
        this.cat = cat;
    }

    @Autowired
    public void setBird(Bird bird) {
        this.bird = bird;
    }

    public void print() {
        System.out.printf("My Dog: %s%n", dog.print());
        System.out.printf("My SecondDog: %s%n", dog1.print());
        System.out.printf("My Cat: %s%n", cat.print());
        System.out.printf("My Bird: %s%n", bird.print());
    }
}
