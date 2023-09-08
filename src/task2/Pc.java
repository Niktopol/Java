package task2;

public class Pc {
    private String processor;
    private String videocard;
    private int memory;
    private double price;
    public Pc(String processor, String videocard, int memory, double price){
        this.processor = processor;
        this.videocard = videocard;
        this.memory = memory;
        this.price = price;
    }
    public String getProcessor(){
        return processor;
    }
    public String getVideocard(){
        return videocard;
    }
    public int getMemory(){
        return memory;
    }
    public double getPrice(){
        return price;
    }
}
