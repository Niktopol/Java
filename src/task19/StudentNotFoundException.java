package task19;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String msg){
        super("Student "+msg+" not found");
    }
    public StudentNotFoundException(String msg, Throwable err){
        super("Student "+msg+" not found", err);
    }
}
