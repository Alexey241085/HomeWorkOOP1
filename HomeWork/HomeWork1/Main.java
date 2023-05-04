package ru.geekbrains;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Product product1 = new Product();
        System.out.println(product1.displayInfo());

        Product product2 = new Product("Бутылка с молоком", 200);
        System.out.println(product2.displayInfo());

        Product product3 = new Product("Ок", "11", -100);
        System.out.println(product3.displayInfo());

        //product3.setPrice(-50.5);
       //product3.name = "____";
       // product3.price = -50.5;

        System.out.println(product3.displayInfo());

        BottleOfWater bottleOfWater1 = new BottleOfWater("Вода", 100, 2);
        System.out.println(bottleOfWater1.displayInfo());

        BottleOfWater bottleOfWater2 = new BottleOfWater("Вода1", 100, 2);
        BottleOfWater bottleOfWater3 = new BottleOfWater("Вода2", 110, 1);
        BottleOfWater bottleOfWater4 = new BottleOfWater("Вода3", 130, 3);
        BottleOfWater bottleOfWater5 = new BottleOfWater("Вода4", 100, 1);

        Product bottleOfMilk1 = new BottleOfMilk("Молоко", 100, 2, 10);
        BottleOfMilk bottleOfMilk2 = new BottleOfMilk("Молоко", 120, 1, 3);
        Product bottleOfMilk3 = new BottleOfMilk("Немолоко", 300, 1, 3);
        BottleOfMilk bottleOfMilk4 = new BottleOfMilk("Молоко", 90, 2, 1);

        Chocolate chocolate1 = new Chocolate("Шоколод", 100, 350, 200);
        Chocolate chocolate2 = new Chocolate("Горький Шоколод", 300, 200, 150);
        Product chocolate3 = new Chocolate("Белый Шоколод", 220, 550, 250);
        Product chocolate4 = new Chocolate("Шоколод", 190, 300, 100);
        Chocolate chocolate5 = new Chocolate("Шоколод", 140, 350, 200);



        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);
        products.add(bottleOfWater5);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(bottleOfMilk3);
        products.add(bottleOfMilk4);
        products.add(chocolate1);
        products.add(chocolate2);
        products.add(chocolate3);
        products.add(chocolate4);
        products.add(chocolate5);


        BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine(products);

        BottleOfWater bottleOfWaterRes =  machine.getBottleOfWater("Вода3", 3);
        if (bottleOfWaterRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }


        Product bottleOfMilkRes = machine.getBottleOfMilk("Молоко", 1, 3);
        if (bottleOfMilkRes != null){
            System.out.print("Вы купили: ");
            System.out.println(bottleOfMilkRes.displayInfo());
        }

        Product chocolateRes = machine.getChocolate("Горький Шоколод", 300, 200, 150);
        if(chocolateRes != null){
            System.out.print("You buy: ");
            System.out.println(chocolateRes.displayInfo());
        }

    }

}