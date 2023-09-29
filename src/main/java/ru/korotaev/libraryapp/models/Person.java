package ru.korotaev.libraryapp.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Person {
    private int id;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "Enter correct name")
    private String name;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "Enter correct name")
    private String surname;
    private String patronymic;
    private String year_of_birth;

    public Person(int id, String name, String surname, String patronymic, String year_of_birth) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.year_of_birth = year_of_birth;
    }

    public Person() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(String year_of_birth) {
        this.year_of_birth = year_of_birth;
    }
}
