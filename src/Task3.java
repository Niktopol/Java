import task2.Circle;
import task2.Tester;
import task3.*;

import java.text.NumberFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(arr[arr.length - 1]);
    }

    public void printArr(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(arr[arr.length - 1]);
    }

    public void doThing() {
        //Задание 1 на Math и Random
        double[] arr = new double[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i % 2 == 0) ? Math.random() : rand.nextDouble();
        }
        printArr(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArr(arr);
        //Задание 2 на Math и Random
        Tester circs = new Tester(5);
        circs.addCircle(new Circle(rand.nextInt(100) * Math.random(), rand.nextInt(1000) * Math.random(), rand.nextInt(1000)));
        circs.addCircle(new Circle(rand.nextInt(100) * Math.random(), rand.nextInt(1000) * Math.random(), rand.nextInt(1000)));
        circs.addCircle(new Circle(rand.nextInt(100) * Math.random(), rand.nextInt(1000) * Math.random(), rand.nextInt(1000)));
        circs.addCircle(new Circle(rand.nextInt(100) * Math.random(), rand.nextInt(1000) * Math.random(), rand.nextInt(1000)));
        circs.addCircle(new Circle(rand.nextInt(100) * Math.random(), rand.nextInt(1000) * Math.random(), rand.nextInt(1000)));
        circs.printCircles();
        System.out.println();
        circs.sortCircs();
        circs.printCircles();
        System.out.println();
        System.out.println(circs.getBiggest());
        System.out.println(circs.getSmallest());
        //Задание 3 на Math и Random
        int[] intArr = {rand.nextInt(90) + 10, rand.nextInt(90) + 10, rand.nextInt(90) + 10, rand.nextInt(90) + 10};
        boolean flag = true;
        printArr(intArr);
        for (int i = 0; i < 3; i++) {
            if (intArr[i] >= intArr[i + 1]) {
                flag = false;
            }
        }
        System.out.println(flag ? "Является строго возрастающей последовательностью" : "Не является строго возрастающей последовательностью");
        //Задание 4 на Math и Random
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            n = scanner.nextInt();
            if (n >= 10) {
                int[] randArr = new int[n];
                int c = 0;
                for (int i = 0; i < n; i++) {
                    randArr[i] = rand.nextInt(n + 1);
                    if (randArr[i] % 2 == 0) {
                        c += 1;
                    }
                }
                printArr(randArr);
                if (c > 0){
                    int[] evenArr = new int[c];
                    int ind = 0;
                    for (int i = 0; i < n; i++) {
                        if (randArr[i] % 2 == 0) {
                            evenArr[ind] = randArr[i];
                            ind += 1;
                        }
                    }
                    printArr(evenArr);
                }
                break;
            } else {
                System.out.println("Повторите ввод");
            }
        }
        //Задание 1 на классы Оболочки
        Double doubleObj1 = Double.valueOf(6543.165456);
        Double doubleObj2 = Double.valueOf("98.77858");
        //Задание 2 на классы Оболочки
        String stringVal = "9.75985569";
        double doubleVal = Double.parseDouble(stringVal);
        //Задание 3 на классы Оболочки
        Double doubleObj = 797847.844;
        double pDouble = doubleObj.doubleValue();
        int pInt = doubleObj.intValue();
        long pLong = doubleObj.longValue();
        float pFloat = doubleObj.floatValue();
        short pShort = doubleObj.shortValue();
        byte pByte = doubleObj.byteValue();
        //Задание 4 на классы Оболочки
        System.out.println("Значение объекта Double: " + doubleObj);
        //Задание 5 на классы Оболочки
        String d = Double.toString(3.14);
        //Задания 1, 2 на форматирование строк вывода
        System.out.println(Converter.convert(rand.nextInt(100000)+1+rand.nextDouble(),Locale.FRANCE,Locale.CHINA));
        System.out.println(Converter.convert(rand.nextInt(100000)+1+rand.nextDouble(),Locale.CHINA,Locale.US));
        System.out.println(Converter.convert(rand.nextInt(100000)+1+rand.nextDouble(),Locale.US,Locale.FRANCE));

        Shop shop = new Shop();
        shop.addGood(new Good(6846,"Apple"));
        shop.addGood(new Good(6,"Banana"));
        shop.addGood(new Good(99999,"Grapes"));
        shop.addGood(new Good(4685901,"Mango"));
        shop.addGood(new Good(1,"Cucumber"));

        System.out.println(shop);
        shop.buy(1, Locale.CHINA);
        shop.buy(1, Locale.FRANCE);
        shop.buy(1, Locale.US);

        System.out.println(shop);
        //Задание 3 на форматирование строк вывода
        Employee[] employees = new Employee[5];
        String[] names = {"Ivan", "Dima", "Lena", "Alex", "Petya"};
        for (int i = 0; i < 5; i++){
            employees[i] = new Employee(names[i], rand.nextInt(100000)+1+rand.nextDouble());
        }
        Report report = new Report();
        report.generateReport(employees);
    }
}
