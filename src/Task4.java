import task4.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public void doThing(){
        //Задание 1
        Season season = Season.SUMMER;
        season.theLover(season);
        for(Season i: Season.values()){
            System.out.println(i + " " + i.getDescription());
        }
        //Задание 2
        Clothes[] wardrobe = new Clothes[4];
        wardrobe[0] = new Pants(Sizes.M, 641.564, "Red");
        wardrobe[1] = new TShirt(Sizes.XXS, 6066656.4, "White");
        wardrobe[2] = new Skirt(Sizes.L, 6.4, "Black");
        wardrobe[3] = new Tie(Sizes.S, 0.4, "Rainbow");
        Atelier atelier = new Atelier();
        atelier.dressMan(wardrobe);
        atelier.dressWoman(wardrobe);
        //Задание 3
        Scanner scanner = new Scanner(System.in);
        String login = "admin";
        String pass = "123";
        Wires wires = Wires.COPPER;
        Tablets tablets = Tablets.SMALL;
        ArrayList<Good> cart = new ArrayList<>();
        boolean f = scanner.nextLine().equals(login) && scanner.nextLine().equals(pass);
        while (f){
            System.out.println("Выберите каталог:");
            String n = scanner.nextLine();
            switch (n){
                case "Wires":
                    System.out.println("Каталог: "+wires.getCatName());
                    System.out.println("Выберите товар:");
                    for(Wires i: Wires.values()){
                        System.out.println(i);
                    }
                    n = scanner.nextLine();
                    for(Wires i: Wires.values()){
                        if (i.getName().equals(n)){
                            cart.add(i);
                        }
                    }
                    break;
                case "Tablets":
                    System.out.println("Каталог: "+wires.getCatName());
                    System.out.println("Выберите товар:");
                    for(Tablets i: Tablets.values()){
                        System.out.println(i);
                    }
                    n = scanner.nextLine();
                    for(Tablets i: Tablets.values()){
                        if (i.getName().equals(n)){
                            cart.add(i);
                        }
                    }
                    break;
                case "Buy":
                    double price = 0;
                    for(Good i: cart){
                        price += i.getPrice();
                    }
                    System.out.println("Куплено "+cart.size() + " товаров на сумму "+price);
                    break;
                default:
                    f = false;
                    break;
            }
        }
        //Задание 4
        Pc pcs;
        for(Pc i: Pc.values()){
            System.out.println(i);
        }
    }
}
