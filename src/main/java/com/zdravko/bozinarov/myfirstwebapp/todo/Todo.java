package com.zdravko.bozinarov.myfirstwebapp.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;


@Entity
public class Todo {

    public Todo() {

    }

    public Todo(int id, String username, String description, LocalDate targetDate, boolean done) {
        super();
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }

    @Id
    @GeneratedValue
    private int id;

    private String username;

    @Size(min = 10, message = "Enter at least 10 characters!")
    private String description;
    private LocalDate targetDate;
    private boolean done;


    public int getId() { return id; }
    public String getUsername() { return username; }
    public String getDescription() { return description; }
    public LocalDate getTargetDate() { return targetDate; }
    public boolean isDone() { return done; }

    public void setId(int id) {
        this.id = id;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setDescription(@Size(min = 10, message = "Enter at least 10 characters!") String description) {
        this.description = description;
    }
    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }
    public void setDone(boolean done) {
        this.done = done;
    }
}
