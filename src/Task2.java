import task2.*;

public class Task2 {
    public void doThing(){
        Author pushkin = new Author("Alex", "litpushkin@mail.com", 'M');
        System.out.println(pushkin.getName()+" "+pushkin.getEmail()+" "+pushkin.getGender());
        pushkin.setEmail("bestwriter@mail.com"); System.out.println(pushkin.getEmail());
        System.out.println(pushkin.toString());

        Ball ball = new Ball(1, 1);
        TestBall tester = new TestBall();
        tester.startTest(ball);

        Tester circs = new Tester(5);
        circs.addCircle(new Circle(10, 11, 12));
        circs.addCircle(new Circle(5465, 1654654, 1));
        circs.addCircle(new Circle(-9, 1, 2));
        circs.printCircles();
        circs.removeCircle();
        circs.printCircles();
    }
}
