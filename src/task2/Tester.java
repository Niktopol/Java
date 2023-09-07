package task2;

public class Tester {
    Circle[] circles;
    int space = 0;
    public Tester(int size){
        circles = new Circle[size];
    }
    public void addCircle (Circle circ) {
        if (space < circles.length) {
            circles[space] = circ;
            space++;
        }
    }
    public void removeCircle(){
        space = space > 0? --space: 0;
    }
    public void printCircles(){
        for (int i = 0; i < space; i++) {
            System.out.println(circles[i].toString());
        }
    }
}
