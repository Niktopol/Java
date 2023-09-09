package task2;

public class TestCircle {
    public void doThing(){
        Circle c1 = new Circle(10,10,0.9);
        Circle c2 = new Circle(0,-9,38);
        Circle c3 = new Circle(123,321,3);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println(c1.getCenterX()+" "+c2.getCenterY()+" "+c3.getRadius());
        c1.setRadius(99);
        c2.setCenterX(66666);
        c3.setCenterY(536456);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("S = "+c1.gelSpace()+" l = "+c1.gelLength());
    }
}
