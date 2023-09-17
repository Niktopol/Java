package task4;

public abstract class Clothes {
    Sizes size;
    double price;
    String color;
    public Clothes(Sizes size, double price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
    }
    public Sizes getSize() {
        return size;
    }
    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
    @Override
    public String toString(){
        return size.getDescription() + " " + price + " " + color;
    }
}
