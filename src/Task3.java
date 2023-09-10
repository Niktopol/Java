import task2.Circle;
import task2.Tester;

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

        int[] intArr = {rand.nextInt(90) + 10, rand.nextInt(90) + 10, rand.nextInt(90) + 10, rand.nextInt(90) + 10};
        boolean flag = true;
        printArr(intArr);
        for (int i = 0; i < 3; i++) {
            if (intArr[i] >= intArr[i + 1]) {
                flag = false;
            }
        }
        System.out.println(flag ? "Является строго возрастающей последовательностью" : "Не является строго возрастающей последовательностью");

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
    }
}
