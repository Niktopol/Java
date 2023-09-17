package task4;

public class Pants extends Clothes implements MenClothing, WomenClothing{
    public Pants(Sizes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надел штаны:\n"+this);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надела штаны:\n"+this);
    }
}
