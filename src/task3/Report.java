package task3;

import java.text.Format;
import java.text.NumberFormat;
import java.util.Formatter;

public class Report {
    public void generateReport(Employee[] employees){
        for (Employee i: employees){
            Formatter format = new Formatter();
            System.out.println(format.format(i.getFullName()+":\n%15.2f", i.getSalary()));
        }
    }
}
