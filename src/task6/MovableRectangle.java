package task6;

import java.awt.*;

public class MovableRectangle implements Movable, Nameable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    public void draw(Graphics g) {
        g.setColor(new Color(0));
        g.fillRect(topLeft.x, topLeft.y, Math.abs(bottomRight.x - topLeft.x), Math.abs(bottomRight.y - topLeft.y));
    }
    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
    @Override
    public String toString(){
        return getName() + ", X1: "+topLeft.x + ", Y1: " + topLeft.y + ", X2: "+bottomRight.x + ", Y2: " + bottomRight.y;
    }
}
