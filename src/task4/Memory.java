package task4;

public class Memory {
    String name;
    int cap;
    public Memory(String name, int cap){
        this.name = name;
        this.cap = cap;
    }
    @Override
    public String toString(){
        return name + " с " + cap + " ГБ памяти";
    }
}
