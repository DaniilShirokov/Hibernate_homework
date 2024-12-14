package ru.netology.org.Hibernate_demo.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import ru.netology.org.Hibernate_demo.dto.Person;
import ru.netology.org.Hibernate_demo.repository.PersonRepositoryJPA;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private PersonRepositoryJPA personRepository;

    public List<Person> getPersonsByCity(String city) {
        return personRepository.findByCityOfLiving(city);
    }
}
