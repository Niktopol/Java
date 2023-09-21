package task4n1;

public class Student {
    private String name;
    protected Student(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "My name is "+name;
    }
}
