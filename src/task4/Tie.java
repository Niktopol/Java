package task4;

public class Tie extends Clothes implements MenClothing{
    public Tie(Sizes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надел галстук:\n"+this);
    }
}
