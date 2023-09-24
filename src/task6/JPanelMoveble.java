package task6;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class JPanelMoveble extends JPanel {
    private Random random = new Random();
    private MovableRectangle rect = new MovableRectangle(50+random.nextInt(200), 50+random.nextInt(200), 200+random.nextInt(200), 200+random.nextInt(200), random.nextInt(50), random.nextInt(50));
    private MovableCircle circ = new MovableCircle(200+random.nextInt(200), 200+random.nextInt(200), random.nextInt(50), random.nextInt(50), 50+random.nextInt(200));
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        rect.draw(g);
        circ.draw(g);
        System.out.println(rect.toString());
        System.out.println(circ.toString());
    }

    public void move() {
        switch (random.nextInt(4)){
            case 0:
                rect.moveUp();
                break;
            case 1:
                rect.moveLeft();
                break;
            case 2:
                rect.moveDown();
                break;
            case 3:
                rect.moveRight();
                break;
        }
        switch (random.nextInt(4)){
            case 0:
                circ.moveUp();
                break;
            case 1:
                circ.moveLeft();
                break;
            case 2:
                circ.moveDown();
                break;
            case 3:
                circ.moveRight();
                break;
        }
    }
}
