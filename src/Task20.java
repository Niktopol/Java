import task20.*;

import java.io.Serializable;
import java.util.Scanner;

public class Task20 {
    private static class Dog extends Animal implements Serializable {
        Dog(String name) {
            super(name);
        }
    }
    public void doThing(){
        //Задание 1
        GenericClass<Integer, Dog, Double> myGenericInstance = new GenericClass<Integer, Dog, Double>(89, new Dog("Собака"), 3.14);

        System.out.println("T: " + myGenericInstance.getFirstVar());
        System.out.println("V: " + myGenericInstance.getSecondVar().getName());
        System.out.println("K: " + myGenericInstance.getThirdVar());

        myGenericInstance.printClassNames();
        //Задание 4
        Integer[] integers = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        MinMax<Integer> minMaxInteger = new MinMax<>(integers);
        System.out.println("Min: " + minMaxInteger.findMin());
        System.out.println("Max: " + minMaxInteger.findMax());

        int a;
        int b;
        System.out.print("Enter 1 number: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.print("Enter 2 number: ");
        b = scanner.nextInt();
        System.out.println("Sum: " + Calculator.sum(a, b));
        System.out.println("Multiply: " + Calculator.multiply(a, b));
        System.out.println("Divide: " + Calculator.divide(a, b));
        System.out.println("Subtract: " + Calculator.subtract(a, b));
        //Задание 5
        Double[][] data1 = {{1.0, 2.0}, {3.0, 4.0}};
        Double[][] data2 = {{5.0, 6.0}, {7.0, 8.0}};

        Matrix<Double> matrix1 = new Matrix<>(data1);
        Matrix<Double> matrix2 = new Matrix<>(data2);

        System.out.println("Matrix 1:");
        System.out.println(matrix1);

        System.out.println("Matrix 2:");
        System.out.println(matrix2);

        Matrix<Double> sumResult = matrix1.add(matrix2);
        System.out.println("Result of addition:");
        System.out.println(sumResult);

        Matrix<Double> subResult = matrix1.sub(matrix2);
        System.out.println("Result of subtraction:");
        System.out.println(subResult);

        Matrix<Double> result = matrix1.multiply(matrix2);

        System.out.println("Result of multiplication:");
        System.out.println(result);

        Matrix<Double> transposed = matrix1.transpose();
        System.out.println("Transposed matrix 1:");
        System.out.println(transposed);
    }
}
