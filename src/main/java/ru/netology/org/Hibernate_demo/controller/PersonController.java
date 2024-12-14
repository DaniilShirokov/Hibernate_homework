package ru.netology.org.Hibernate_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.netology.org.Hibernate_demo.dto.Person;
import ru.netology.org.Hibernate_demo.repository.PersonRepository;
import ru.netology.org.Hibernate_demo.service.PersonService;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/persons")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;
    private PersonService personService;

    @GetMapping("/city/{city}")
    public List<Person> getPersonsByCity(@PathVariable String city) {
        return personService.getPersonsByCity(city);
    }
}