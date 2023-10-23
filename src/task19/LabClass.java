package task19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LabClass {
    private ArrayList<Student> students;
    public LabClass(){
        students = new ArrayList<>();
    }
    public Student findStudent(String name) throws EmptyStringException, StudentNotFoundException{
        if (name.isEmpty()){
            throw new EmptyStringException();
        }else {
            for (Student i: students){
                if (i.getName().equals(name)){
                    return i;
                }
            }
        }
        throw new StudentNotFoundException(name);
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void sortStudents(){
        Collections.sort(students);
    }
    public String getStudents(){
        StringBuilder res = new StringBuilder();
        for (Student i: students) {
            res.append(i.toString());
            res.append('\n');
        }
        return res.toString();
    }
}
