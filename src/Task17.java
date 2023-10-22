import task17.MVCEmployeeDemo;
import task17.MVCPatternDemo;
import task17.MyMVC;
import task7.MathCalculatable;

public class Task17 {

    public void doThing(){
        //Задание 1
        MVCPatternDemo pattd = new MVCPatternDemo();
        pattd.main();
        //Задание 2
        MVCEmployeeDemo patte = new MVCEmployeeDemo();
        patte.main();
        //Задание 3
        MyMVC m = new MyMVC();
        m.main();
    }
}
