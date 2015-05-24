package ru.kourilenko;

public class Food {
    private int salt;
    private int pepper;

    public int getSalt() {
        return salt;
    }

    public void setSalt(int salt) {
        this.salt = salt;
    }

    public int getPepper() {
        return pepper;
    }

    public void addPepper(int pepper) {
        this.pepper += pepper;
    }

}
