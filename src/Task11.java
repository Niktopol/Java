import task11.CompareCollections;
import task11.Student;

import java.text.SimpleDateFormat;
import java.util.*;

public class Task11 {
    Date got = new Date(1696244396275L);
    private Date date = new Date();
    public void doThing(){
        //Задание 1
        System.out.println("Ермаков");
        System.out.println("Получение задния: "+got);
        System.out.println("Сдача задания: "+date);
        //Задание 2
        GregorianCalendar calendar = new GregorianCalendar();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM, yyyy г.", Locale.ENGLISH);
        SimpleDateFormat difformat = new SimpleDateFormat("dd дн. MM мес.", Locale.ENGLISH);
        System.out.println("Год");
        int year = scanner.nextInt();
        System.out.println("Месяц");
        int month = scanner.nextInt() - 1;
        System.out.println("Число");
        int day = scanner.nextInt();
        calendar.set(year, month, day);
        GregorianCalendar diff = new GregorianCalendar();
        diff.setTime(new Date(date.getTime()-calendar.getTime().getTime()));
        System.out.println("Введённая дата: "+simpleDateFormat.format(calendar.getTime()));
        System.out.println("Разница во времени: "+ difformat.format(diff.getTime()) + " " + (diff.getWeekYear()-1970) + " г.");
        //Задание 3
        Student student = new Student("Пётр", "Петров", calendar.getTime());
        System.out.println(student);
        student.setFormat(student.MEDIUM);
        System.out.println(student);
        student.setFormat(student.SHORT);
        System.out.println(student);
        //Задание 4
        simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm");
        GregorianCalendar precise = new GregorianCalendar();
        System.out.println("Год");
        precise.set(Calendar.YEAR, scanner.nextInt());
        System.out.println("Месяц");
        precise.set(Calendar.MONTH, scanner.nextInt()-1);
        System.out.println("Число");
        precise.set(Calendar.DATE, scanner.nextInt());
        System.out.println("Час");
        precise.set(Calendar.HOUR_OF_DAY, scanner.nextInt());
        System.out.println("Минута");
        precise.set(Calendar.MINUTE, scanner.nextInt());
        System.out.println(simpleDateFormat.format(precise.getTime()));
        //Задание 5
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();
        Random random = new Random();
        for(int i = 0; i <= 1000000; i++) {
            list1.add(random.nextInt(100000));
            list2.add(random.nextInt(100000));
        }
        CompareCollections comparator = new CompareCollections();
        System.out.println("Вставка: ");
        System.out.println("\tArrayList: " + comparator.insertionOperation(list1) + " мс");
        System.out.println("\tLinkedList: " + comparator.insertionOperation(list2) + " мс\n");
        System.out.println("Удаление: ");
        System.out.println("\tArrayList: " + comparator.deleteOperation(list1) + " мс");
        System.out.println("\tLinkedList: " + comparator.deleteOperation(list2) + " мс\n");
        System.out.println("Добавление: ");
        System.out.println("\tArrayList: " + comparator.addingOperation(list1) + " мс");
        System.out.println("\tLinkedList: " + comparator.addingOperation(list2) + " мс\n");
        System.out.println("Поиск по образцу: ");
        System.out.println("\tArrayList: " + comparator.sampleSearchOperation(list1) + " мс");
        System.out.println("\tLinkedList: " + comparator.sampleSearchOperation(list2) + " мс\n");
    }
}
