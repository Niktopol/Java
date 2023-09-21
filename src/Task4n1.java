import task4n1.*;

public class Task4n1 {

    public void doThing(){
        //Задание 1,8
        Shape[] shapes = {
                new Circle(1.6, "Blue", false),
                new Rectangle(6.6, 9, "Yellow", true),
                new Square( 99, "Red", true)
        };
        for(Shape i: shapes){
            System.out.println(i);
            System.out.println("Area: "+ i.getArea());
            System.out.println("Perimeter: "+ i.getPerimeter());
        }
        //Задание 4
        double[][] mtOne = {{1,3,4,-2},{2,-1,0,5}};
        double[][] mtTwo = {{1,0,2},{-1,1,3},{2,-1,4},{3,0,1}};
        Matrix one = new Matrix(mtOne);
        Matrix two = new Matrix(mtTwo);
        one.multMatrix(two);
        two.multMatrix(6);
        System.out.println(one);
        System.out.println(two);
        one.addMatrix(one);
        System.out.println(one);
        //Задание 7
        Student[] students = {new Undergraduate("Alexander"), new Schoolchild("Sonya"), new Schoolchild("Dima")};
        System.out.println("Undergraduates:");
        for(Student i: students){
            if (i instanceof Undergraduate){
                System.out.println(i);
            }
        }
        System.out.println("Schoolchildren:");
        for(Student i: students){
            if (i instanceof Schoolchild){
                System.out.println(i);
            }
        }
    }
}
