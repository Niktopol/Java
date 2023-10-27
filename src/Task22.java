import task22.*;

public class Task22 {
    public void doThing(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorControl(new CalculatorView(), new CalculatorModel());
            }
        });
    }
}
