import task19.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Task19 {
    private void checkINNbuy(String name, String INN) throws WrongINNexception {
        ArrayList<String> correct = new ArrayList<>();
        correct.add("0123456789");
        correct.add("9876543210");
        correct.add("0001112223");
        if (correct.contains(INN)){
            System.out.println(name+" успешно совершил покупку");
        }else{
            throw new WrongINNexception(INN);
        }
    }
    public void doThing(){
        //Задание 1
        Scanner scanner = new Scanner(System.in);
        String name;
        String INN;
        System.out.print("Введите имя: ");
        name = scanner.next();
        System.out.print("Введите ИНН: ");
        INN = scanner.next();
        try {
            checkINNbuy(name, INN);
        }catch (WrongINNexception e){
            System.out.println(e);
        }
        //Задание 2
        LabClassDriver driver = new LabClassDriver();
        driver.runUI();
    }
}
