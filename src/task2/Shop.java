package task2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Shop {
    private ArrayList<Pc> pcs = new ArrayList<Pc>();
    public void addPc(){
        Scanner scanner = new Scanner(System.in);
        String processor;
        int memory;
        double price;
        System.out.println("Введите модель процессора");
        processor = scanner.next();
        System.out.println("Введите количество оперативной памяти");
        memory = scanner.nextInt();
        System.out.println("Введите цену");
        price = scanner.nextDouble();
        pcs.add(new Pc(processor, memory, price));
    }
    public void deletePc(Pc pc){
        Iterator<Pc> comp = pcs.iterator();
        while (comp.hasNext()){
            if (comp.next().equals(pc)) {
                comp.remove();
            }
        }
    }
    public Pc findPc(String processor){
        for (Pc i:pcs) {
            if (i.getProcessor().equals(processor)) {
                return i;
            }
        }
        return null;
    }
    public Pc findPc(int memory){
        for (Pc i:pcs) {
            if (i.getMemory() == memory) {
                return i;
            }
        }
        return null;
    }
    public Pc findPc(double price){
        for (Pc i:pcs) {
            if (i.getPrice() >= price) {
                return i;
            }
        }
        return null;
    }
    @Override
    public String toString(){
        String s = "";
        for (int i = 0; i < pcs.size(); i++) {
            s += "["+(i+1)+"] "+pcs.get(i).toString() + (i+1 < pcs.size() ? '\n' : ' ');
        }
        return s;
    }
}
