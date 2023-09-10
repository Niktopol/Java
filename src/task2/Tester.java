package task2;

public class Tester {
    private Circle[] circles;
    private int space = 0;
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
    public void sortCircs(){
        for (int i = 0; i < space; i++) {
            for (int j = 0; j < space - 1; j++) {
                if (circles[j].getRadius() > circles[j + 1].getRadius()) {
                    Circle temp = circles[j];
                    circles[j] = circles[j + 1];
                    circles[j + 1] = temp;
                }
            }
        }
    }
    public Circle getSmallest(){
        if (space > 0){
            double val = circles[0].getRadius();
            int ind = 0;
            for (int i = 1; i < space; i++) {
                if (circles[i].getRadius() < val){
                    val = circles[i].getRadius();
                    ind = i;
                }
            }
            return circles[ind];
        }
        return null;
    }
    public Circle getBiggest(){
        if (space > 0){
            double val = circles[0].getRadius();
            int ind = 0;
            for (int i = 1; i < space; i++) {
                if (circles[i].getRadius() > val){
                    val = circles[i].getRadius();
                    ind = i;
                }
            }
            return circles[ind];
        }
        return null;
    }
    public void printCircles(){
        for (int i = 0; i < space; i++) {
            System.out.println(circles[i]);
        }
    }
}
