import task5.Animation;
import task5.Circle;
import task5.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Task12 {
    private void drawRandomShapes(Graphics g) {
        Random random = new Random();
        ArrayList<task5.Shape> shapes = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int x = random.nextInt(700);
            int y = random.nextInt(700);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            if (random.nextInt(2) % 2 == 0) {
                int radius = random.nextInt(50) + 10;
                shapes.add(new Circle(color, new Point(x, y), radius));
            } else {
                int width = random.nextInt(100) + 20;
                int height = random.nextInt(100) + 20;
                shapes.add(new task5.Rectangle(color, new Point(x, y), width, height));
            }
        }

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
    public void doThing(){
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawRandomShapes(g);
            }
        };
        frame.getContentPane().add(panel);
        frame.setVisible(true);

        Animation animation = new Animation();
        animation.runAnim();
    }
}
