package ru.korotaev.libraryapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.korotaev.libraryapp.models.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class PersonDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Optional<Person> getPersonByName(String name){
        return jdbcTemplate.query("SELECT * FROM Person WHERE name=?", new Object[] {name}, new BeanPropertyRowMapper<>(Person.class)).stream().findAny();
    }

    public Optional<Person> getPersonBySurname(String surname){
        return jdbcTemplate.query("SELECT * FROM Person WHERE surname=?", new Object[] {surname}, new BeanPropertyRowMapper<>(Person.class)).stream().findAny();
    }

    public Optional<Person> getPersonByPatronymic(String patronymic){
        return jdbcTemplate.query("SELECT * FROM Person WHERE patronymic=?", new Object[] {patronymic}, new BeanPropertyRowMapper<>(Person.class)).stream().findAny();
    }

    public Person show(final int id){
        return jdbcTemplate.query("SELECT * FROM Person WHERE id=?", new Object[]{id}, new BeanPropertyRowMapper<>(Person.class))
                .stream().findAny().orElse(null);
    }
}
