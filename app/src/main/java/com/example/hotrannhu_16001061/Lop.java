package com.example.hotrannhu_16001061;

public class Lop {
    private int id;
    private String name;

    public Lop(String name) {
        this.name = name;
    }

    public Lop() {
    }

    public Lop(int id, String name) {
        this.id = id;
        this.name = name;
    }

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
}
