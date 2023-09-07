package task2;

public class Circle {
    Point center;
    double radius;
    public Circle(double x, double y, double radius) {
        center = new Point(x, y);
        this.radius = radius;
    }
    public String toString(){
        return "Center: "+center.toString() + " Radius: "+radius;
    }

}