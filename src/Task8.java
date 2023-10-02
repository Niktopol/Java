import java.util.Random;
import java.util.Scanner;

public class Task8 {
    private Random random = new Random();
    private int recSum(int num){
        if (num > 0){
            return num % 10 + recSum(num/10);
        }
        return 0;
    }
    private boolean isPrime(int num, int denom){
        if (denom > (int)Math.sqrt(num)){
            return true;
        }else {
            if (num%denom != 0){
                return isPrime(num, denom+1);
            }else{
                return false;
            }
        }
    }
    private void findDels(int num, int denom){
        if (num == 1){
            return;
        }else if(isPrime(num, 2)){
            System.out.print(num);
            return;
        }else {
            if (num%denom == 0) {
                System.out.print(denom+" ");
                findDels(num/denom, 2);
            }else {
                findDels(num, denom+1);
            }
        }
    }
    private boolean isPolind(String s, int pos){
        if (pos > (s.length()/2)){
            return true;
        }
        if (s.charAt(pos) != s.charAt(s.length()-pos-1)) {
            return false;
        }
        return isPolind(s, ++pos);
    }
    private int countCombs(int zeros, int ones, char lst){
        int sum = 0;
        if (zeros == 0 && ones == 0){
            return 1;
        }
        if (zeros > ones && lst == '0') {
            return 0;
        }
        if (zeros > 0 && lst == '1'){
            sum += countCombs(zeros-1, ones, '0');
        }
        if (ones > 0){
            sum += countCombs(zeros, ones-1, '1');
        }
        return sum;
    }
    public void doThing(){
        Scanner scanner = new Scanner(System.in);
        //Задание 5
        System.out.println("Введите число: ");
        int num = Math.abs(scanner.nextInt());
        System.out.println("Сумма цифр: "+recSum(num));
        //Задание 6
        System.out.println("Введите число: ");
        num = Math.abs(scanner.nextInt());
        System.out.println("Число является простым: "+ (isPrime(num, 2) ? "YES":"NO"));
        //Задание 7
        System.out.println("Введите число: ");
        num = Math.abs(scanner.nextInt());
        System.out.print("Простые множители числа: ");
        findDels(num, 2);
        System.out.println();
        //Задание 8
        System.out.println("Введите строку: ");
        String s = scanner.next();
        System.out.println("Является палиндромом: "+ (isPolind(s, 0) ? "YES":"NO"));
        //Задание 9
        System.out.println("Введите число нулей: ");
        int a = Math.abs(scanner.nextInt());
        System.out.println("Введите число единиц: ");
        int b = Math.abs(scanner.nextInt());
        System.out.println("Всего комбинаций без двух нулей: "+countCombs(a,b,'1'));
    }
}
