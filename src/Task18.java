import task18.*;

public class Task18 {
    public void doThing(){
        //Задание 1
        Exception1 t1 = new Exception1();
        t1.exceptionDemo();
        //Задание 2
        Exception2 t2 = new Exception2();
        t2.exceptionDemo();
        //Задание 3
        Exception2n3 t3 = new Exception2n3();
        t3.exceptionDemo();
        //Задание 4
        Exception2n4 t4 = new Exception2n4();
        t4.exceptionDemo();
        //Задание 5,6
        ThrowsDemo t5n6 = new ThrowsDemo();
        String k1 = "key";
        String k2 = null;
        t5n6.printMessage(k1);
        t5n6.printMessage(k2);
        //Задание 7,8
        ThrowsDemoNew t7n8 = new ThrowsDemoNew();
        t7n8.getKey();
    }
}
