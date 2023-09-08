package task2;

public class TestBall {
    public void startTest(Ball ball){
        for(int i = 0; i < 10; i++) {
            ball.move(i * 3, i * 0.9);
        }
        System.out.println(ball);
        ball.setXY(700, 300);
        System.out.println(ball);
        ball.setX(100000);
        ball.setY(0.0000001);
        System.out.println(ball.getX() + " " + ball.getY());
    }
}
