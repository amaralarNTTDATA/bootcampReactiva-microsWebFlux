package com.example.tallerwebfluxservermicro.controller;

import com.example.tallerwebfluxservermicro.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class PersonController {

    @GetMapping("/person-list-1")
    public Flux<Person> personList() {

        Flux<Person> personFlux = Flux.just(new Person("Pedro", "Ramirez", 41),
                                            new Person("Juan", "Perez", 34))
                .delaySequence(Duration.ofSeconds(10));

        return personFlux;

    }

    @GetMapping("/person-list-2")
    public Flux<Person> personList2() {

        Flux<Person> personFlux = Flux.just(new Person("Ana", "Gonzalez", 38),
                        new Person("Maria", "Perez", 29))
                .delaySequence(Duration.ofSeconds(10));

        return personFlux;

    }

    @GetMapping("/person-list-3")
    public Flux<Person> personList3() {

        Flux<Person> personFlux = Flux.just(new Person("Antonio", "Carmona", 41),
                        new Person("Jose", "Lopez", 48))
                .delaySequence(Duration.ofSeconds(10));

        return personFlux;

    }

    @GetMapping("/person-list-4")
    public Flux<Person> personList4() {

        Flux<Person> personFlux = Flux.just(new Person("Laura", "Soto", 27),
                        new Person("Manuela", "Sanchez", 36))
                .delaySequence(Duration.ofSeconds(10));

        return personFlux;

    }

}
