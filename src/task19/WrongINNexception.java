package task19;

public class WrongINNexception extends Exception{
    public WrongINNexception(String msg){
        super("INN "+msg+" not found");
    }
    public WrongINNexception(String msg, Throwable err){
        super("INN "+msg+" not found", err);
    }
}
