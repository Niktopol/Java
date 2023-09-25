import task7.ComplexNum;
import task7.MathSet;

public class Task7 {
    public void doThing(){
        MathSet oprns = new MathSet();
        System.out.println(oprns.power(2, 8));
        System.out.println(oprns.compAbs(new ComplexNum(3,4)));
        System.out.println(oprns.getCircArea(10));
    }
}
