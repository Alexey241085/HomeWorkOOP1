package ru.geekbrains;

import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine {

    private final List<Product> products;

    public BottleOfWaterVendingMachine(List<Product> products){
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, int volume){

        for (Product product : products){
            if (product instanceof BottleOfWater){
                if (product.getName() == name && ((BottleOfWater)product).getVolume() == volume){
                    return (BottleOfWater)product;
                }
            }
       }
        return null;
    }

    
    public Product getBottleOfMilk(String name, int volume, int fat){
        for (Product product : products) {
            if (product instanceof BottleOfMilk) {
                if (product.getName() == name && 
                ((BottleOfMilk) product).getVolume() == volume && 
                ((BottleOfMilk)product).getFat() == fat){
                    return product;

                }
            }
        }
        return null;
    }

    public  Product getChocolate(String name, double price, int calories, double weight){
        for (Product product : products){
            if (product instanceof  Chocolate){
                if (product.getName() == name &&
                ((Chocolate)product).getCalories() == calories &&
                ((Chocolate)product).getWeight() == weight){
                    return  product;

                }
            }
        }
        return null;
    }
}



//TODO: Разработать метод получения бутылки с молоком самостоятельно