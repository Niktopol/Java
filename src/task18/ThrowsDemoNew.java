package task18;

import java.util.Scanner;

public class ThrowsDemoNew {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        try{
            printDetails( key );
        }catch (Exception e){
            try {
                printDetails(key);
            }catch (Exception ex){
                System.out.println(ex);
            }
        }

    }
    public void printDetails(String key) throws Exception{
        try {
            String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private String getDetails(String key) throws Exception{
        if(key == "") {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}