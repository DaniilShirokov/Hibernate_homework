package ru.netology.org.Hibernate_demo.dto;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "PERSONS")
@IdClass(PersonId.class)
public class Person {
    @Id
    private String name;

    @Id
    private String surname;

    @Id
    private int age;

    private String phoneNumber;
    private String cityOfLiving;


}