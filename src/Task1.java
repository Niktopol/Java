import java.math.BigInteger;
import java.util.Scanner;
public class Task1 {
    private BigInteger fact(int num){
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 1; i <= num; i++){
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    public void doThing(String[] args) {
        //-----------------------------------------№3
        int[] arr = {1, 2, 654, 64, 946, 456, 6, 64};
        //Создание массива
        int sm = 0;
        for (int i = 0; i < arr.length; i++) {
            //Нахождение суммы элементов
            sm += arr[i];
        }
        System.out.println("Задание 1");
        System.out.println("Сумма элеменйтов: " + sm + "; Среднее арифметическое: " + sm / arr.length);
        //-----------------------------------------
        //-----------------------------------------№4
        sm = 0;
        int min = 0;
        int max = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива");
        //Создание массива указанной длины
        int l = sc.nextInt();
        int[] nextArr = new int[l];
        System.out.println("Введите числа");
        l = 0;
        while (l < nextArr.length) {
            //Ввод чисел массива
            if (sc.hasNextInt()) {
                nextArr[l] = sc.nextInt();
                min = max = nextArr[l];
                l++;
            } else {
                sc.next();
            }
        }
        l = 0;
        //Нахождение минимума, максимума и суммы элементов
        while (l < nextArr.length) {
            if (nextArr[l] > max) {
                max = nextArr[l];
            }
            if (nextArr[l] < min) {
                min = nextArr[l];
            }
            sm += nextArr[l];
            l++;
        }
        System.out.println("Сумма элементов массива: " + sm);
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        //-----------------------------------------
        //-----------------------------------------№5
        //Вывод на экран аргументов коммандной строки
        System.out.println("Аргументы командной строки: ");
        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
        //-----------------------------------------
        //-----------------------------------------№6
        for (int i = 1; i <= 10; i++){
            //Вывод на экран форматированных чисел
            System.out.println(String.format("%1$.7f",(1/(float)i)));
        }
        //-----------------------------------------
        //-----------------------------------------№7
        System.out.println("Введите число");
        //Вывод факториала числа
        System.out.println(this.fact(sc.nextInt()));
        //-----------------------------------------
    }
}
