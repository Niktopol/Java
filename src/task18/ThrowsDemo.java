package task18;

public class ThrowsDemo {
    public void printMessage(String key) {
        String message;
        try {
            message = getDetails(key);
            System.out.println( message );
        }catch (NullPointerException e){
            System.out.println(e);
        }
    }
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails");
        }
        return "data for " + key; }
}