package task19;

public class StudentNotFoundException extends Exception{
    private String msg;
    public StudentNotFoundException(String msg){
        this.msg = msg;
    }
    @Override
    public String toString() {
        return "StudentNotFoundException: student "+msg+" not found";
    }
}
