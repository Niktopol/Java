package task4;

public class Skirt extends Clothes implements WomenClothing{
    public Skirt(Sizes size, double price, String color) {
        super(size, price, color);
    }
    @Override
    public void dressWoman() {
        System.out.println("Женщина надела юбку:\n"+this);
    }
}
