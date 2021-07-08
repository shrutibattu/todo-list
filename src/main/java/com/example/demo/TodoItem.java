package com.example.demo;

public class TodoItem {
    private int id;
    private String description;
    private Boolean isDone;

    public TodoItem(int id, String description, Boolean isDone) {
        this.id = id;
        this.description = description;
        this.isDone = isDone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }
}

