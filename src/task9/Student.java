package task9;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private int iDNumber = 0;
    private int points = 0;
    public Student(int iDNumber, int points){
        this.iDNumber = iDNumber;
        this.points = points;
    }
    public int getPoints(){
        return points;
    }
    @Override
    public int compareTo(Student stud) {
        return iDNumber-stud.iDNumber;
    }
    @Override
    public String toString(){
        return "ID: "+iDNumber+" Points: "+points;
    }
}
