package com.example.bio.data;

public class Bio {
    private String name;
    private String hobbies;

    public Bio() {
    }

    public Bio(String hobbies,String name) {
        this.hobbies = hobbies;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
}
