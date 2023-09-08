package task2;
import java.util.ArrayList;
public class Shop {
    private ArrayList<Pc> pcs = new ArrayList<Pc>();
    public void addPc(String processor, String videocard, int memory, double price){
        pcs.add(new Pc(processor, videocard, memory, price));
    }
    public Pc findPc(String processor, String videocard, int memory, double price){
        return null;
    }
}
