package task4;

public class Processor {
    String name;
    int cores;
    public Processor(String name, int cores){
        this.name = name;
        this.cores = cores;
    }
    @Override
    public String toString(){
        return name + " с " + cores + " ядрами";
    }
}
