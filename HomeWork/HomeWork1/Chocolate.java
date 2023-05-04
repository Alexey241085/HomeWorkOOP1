package ru.geekbrains;

public class Chocolate extends Product {

    private int calories;
    private double weight;

    public int getCalories() {
        return calories;
    }

    public double getWeight() {
        return weight;
    }

    public Chocolate(String name, double price, int calories, double weight){
        super(name, price);
        this.calories = calories;
        this.weight = weight;
    }

    @Override
    String displayInfo() {
        return String.format("%s - %s - %f RUB - калории: %d, - вес: %f " , brand, name, price, calories, weight);
    }
}
