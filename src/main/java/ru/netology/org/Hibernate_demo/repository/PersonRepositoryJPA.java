package ru.netology.org.Hibernate_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.netology.org.Hibernate_demo.dto.Person;
import ru.netology.org.Hibernate_demo.dto.PersonId;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepositoryJPA extends JpaRepository<Person, Long> {

    List<Person> findByCityOfLiving(String city);
}
