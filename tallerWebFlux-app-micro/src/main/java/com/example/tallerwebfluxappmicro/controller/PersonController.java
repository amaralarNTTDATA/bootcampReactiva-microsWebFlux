package com.example.tallerwebfluxappmicro.controller;

import com.example.tallerwebfluxappmicro.model.Person;
import com.example.tallerwebfluxappmicro.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;

@Controller
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/person-list")
    public String personList(Model model) {

        Flux<Person> personFlux = personService.listAll();

        model.addAttribute("personFlux", personFlux);

        return "personFlux";

    }

}
