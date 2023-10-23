package task19;

public class EmptyStringException extends Exception{
    public EmptyStringException(){
        super("Inputted string is empty");
    }
    public EmptyStringException(Throwable err){
        super("Inputted string is empty", err);
    }
}
