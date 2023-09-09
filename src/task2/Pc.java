package task2;

public class Pc {
    private String processor;
    private String videocard;
    private int memory;
    private double price;
    public Pc(String processor, int memory, double price){
        this.processor = processor;
        this.memory = memory;
        this.price = price;
    }
    public String getProcessor(){
        return processor;
    }
    public int getMemory(){
        return memory;
    }
    public double getPrice(){
        return price;
    }
    @Override
    public String toString(){
        return "Процессор: "+processor+" Оперативная память: "+memory+"ГБ Цена: "+price+" руб.";
    }
}
