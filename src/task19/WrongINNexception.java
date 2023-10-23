package task19;

public class WrongINNexception extends Exception{
    private String msg;
    public WrongINNexception(String msg){
        this.msg = msg;
    }
    @Override
    public String toString() {
        return "WrongINNexception: INN "+msg+" not found";
    }
}
