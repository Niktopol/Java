package task3;

import java.text.Format;
import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Locale;

public class Report {
    public void generateReport(Employee[] employees){
        for (Employee i: employees){
            System.out.println(String.format(i.getFullName()+":\n%15.2f%n", i.getSalary()));
        }
    }
}
