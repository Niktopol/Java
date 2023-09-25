package task7;

public class Magazine implements Printable{
    String name;
    public Magazine(String name){
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println(name);
    }
}
