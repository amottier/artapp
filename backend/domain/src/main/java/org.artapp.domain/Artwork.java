package org.artapp.domain;

public class Artwork {

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int anInt) {
        id = anInt;
    }
}
