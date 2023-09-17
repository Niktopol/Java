package task4;

public enum Wires implements Good{
    TIN("Tin wire", 15.6),
    COPPER("Copper wire", 156.6),
    SILVER("Silver wire", 1599.6);
    private String name;
    private double price;
    private Wires(String name, double price){
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
        return "Wires";
    }

    @Override
    public String toString(){
        return name + " " + price;
    }
}
