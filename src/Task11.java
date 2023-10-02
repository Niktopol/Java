import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task11 {
    String got = "Mon Oct 02 09:47:08 MSK 2023";
    private Date date = new Date();
    public void doThing(){
        //Задание 1
        System.out.println("Ермаков");
        System.out.println("Получение задния: "+got);
        System.out.println("Сдача задания: "+date);
        //Задание 2
        Calendar calendar = new GregorianCalendar();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM, yyyy г.");
        System.out.println("Год");
        int year = scanner.nextInt();
        System.out.println("Месяц");
        int month = scanner.nextInt() - 1;
        System.out.println("Дата");
        int date = scanner.nextInt();
        calendar.set(year, month, date);
        System.out.println(simpleDateFormat.format(calendar.getTime()));
    }
}
