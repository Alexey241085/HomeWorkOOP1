package ru.geekbrains;

public class BottleOfMilk extends Product {

    private int volume;
    private int fat;

    public int getFat() {
        return fat;
    }

    public int getVolume() {
        return volume;
    }
    

    public BottleOfMilk(String name, double price, int volume, int fat){
        super(name, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("%s - %s - %.2f рублей - объем: %d литров", brand, name, price, volume);

    }
}
