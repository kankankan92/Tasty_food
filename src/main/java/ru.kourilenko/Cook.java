package ru.kourilenko;

public class Cook {
    public Food cook(Recipe recipe){
        Food food = new Food();
        while (food.getPepper()<recipe.getPepper()){
            food.addPepper(1);
        }
        food.setSalt(recipe.getSalt());
        return food;
    }
    public boolean tasty(Food food, Recipe recipe){
        if(food.getPepper()==recipe.getPepper()&&food.getSalt()==recipe.getSalt()){
            System.out.println("Вкусно!");
            return true;
        }else {
            System.out.println("Невкусно =/");
            return false;
        }
    }
}
