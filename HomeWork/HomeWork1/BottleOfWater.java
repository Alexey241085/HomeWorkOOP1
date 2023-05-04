package ru.geekbrains;

public class BottleOfWater extends Product {

    private int volume;

    public int getVolume() {
        return volume;
    }

    public BottleOfWater(String name, double price, int volume){
        super(name, price);
        this.volume = volume;
    }

    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("%s - %s - %f рублей - объем: %d литров", brand, name, price, volume);

    }
}
