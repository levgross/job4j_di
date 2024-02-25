package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.job4j.di.annotation.Config;
import ru.job4j.di.annotation.Man;

public class Main {
    public static void main(String[] args) {
        /** AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.job4j.di.lifecycle");
        context.close(); */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Man man = context.getBean(Man.class);
        man.print();
    }
}
