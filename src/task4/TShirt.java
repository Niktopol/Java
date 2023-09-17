package task4;

public class TShirt extends Clothes implements MenClothing, WomenClothing{
    public TShirt(Sizes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надел футболку:\n"+this);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надела футболку:\n"+this);
    }
}
