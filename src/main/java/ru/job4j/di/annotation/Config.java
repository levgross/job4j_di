package ru.job4j.di.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "ru.job4j.di.annotation")
public class Config {

    @Bean
    @Primary
    public Dog getAlfaDog() {
        return new Dog("AlfaDog");
    }

    @Bean(name = "SecondDog")
    public Dog getDog() {
        return new Dog("Dog 2");
    }

    @Bean
    public Dog someDog() {
        return new Dog("Dog");
    }
}
