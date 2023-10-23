package task19;

public class Student implements Comparable<Student> {
    private int iDNumber;
    private String name;
    public Student(int iDNumber, String name){
        this.iDNumber = iDNumber;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public int compareTo(Student stud) {
        return iDNumber-stud.iDNumber;
    }
    @Override
    public String toString(){
        return "ID: "+iDNumber+" Name: "+name;
    }
}
