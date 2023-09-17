package task4;

public enum Tablets implements Good{
    SMALL("Small tablet", 1985.6),
    MEDIUM("Medium tablet", 153256.6),
    LARGE("Large tablet", 198599.6);
    private String name;
    private double price;
    private Tablets(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return price;
    }
    public String getCatName() {
        return "Tablets";
    }

    @Override
    public String toString(){
        return name + " " + price;
    }
}
