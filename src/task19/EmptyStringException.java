package task19;

public class EmptyStringException extends Exception{
    @Override
    public String toString() {
        return "EmptyStringException: inputted string is empty";
    }
}
