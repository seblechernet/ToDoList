package com.company;

public class ToDoItem {
    private String name;
    private String category;
    private String priority;
    private boolean isDone;

    public ToDoItem(String name, String category, String priority, boolean isDone) {
        this.name = name;
        this.category = category;
        this.priority = priority;
        this.isDone = isDone;
    }

    public ToDoItem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
