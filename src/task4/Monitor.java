package task4;

public class Monitor {
    String name;
    int size;
    public Monitor(String name, int size){
        this.name = name;
        this.size = size;
    }
    @Override
    public String toString(){
        return name + " с диаметром " + size;
    }
}
