package ru.kourilenko;

public class Main {
    public static void main(String[] args) {
        Recipe soup = new Recipe(6, 12, "chicken soup");
        Cook Nastia = new Cook();
        Food nyami = Nastia.cook(soup);
        Nastia.tasty(nyami, soup);
    }
}
