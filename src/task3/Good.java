package task3;

import java.util.Locale;

public class Good {
    private double price;
    private String name;
    public Good(double price, String name){
        this.price = price;
        this.name = name;
    }
    public double getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return name + " " + Converter.convert(price, Locale.US, Locale.US);
    }
}
