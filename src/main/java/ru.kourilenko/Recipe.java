package ru.kourilenko;

public class Recipe {
    private String name;
    private int salt;

    public int getPepper() {
        return pepper;
    }

    public int getSalt() {
        return salt;
    }

    private int pepper;

    public Recipe(int pepper, int salt, String name) {
        this.pepper = pepper;
        this.salt = salt;
        this.name = name;
    }
}
