package task18;

import java.util.Scanner;

public class Exception2n4 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try{
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }catch (NumberFormatException e){
            System.out.println("Wrong input");
        }catch(ArithmeticException e){
            System.out.println("Zero division");
        }finally {
            System.out.println("Finally");
        }
    }
}