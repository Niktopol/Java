package task2;

import java.util.Scanner;

public class HowMany {
    public void words(){
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" +");
        for (String k : s){
            System.out.println(k);
        }
        System.out.println(s.length);
    }
}
