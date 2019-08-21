package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    ToDoRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        ToDo toDo;
        toDo = new ToDo("fix door locks", "fix door locks and get new keys");
        repository.save(toDo);

        toDo = new ToDo("buy cat food", "buy the same brand as last time");
        repository.save(toDo);

        toDo = new ToDo("java bootcamp", "apply for the 8 week java bootcamp");
        repository.save(toDo);

        toDo = new ToDo("AWS application", "terminate AWS app after bootcamp is over");
        repository.save(toDo);
    }
}