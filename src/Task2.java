import task2.*;

import java.util.Scanner;

public class Task2 {
    public void revString(String[] s){
        for(int i = 0; i < s.length/2; i++){
            String temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;
        }
    }
    public void doThing(){
        Scanner scanner = new Scanner(System.in);
        //Задание 1
        Author pushkin = new Author("Alex", "litpushkin@mail.com", 'M');
        System.out.println(pushkin.getName()+" "+pushkin.getEmail()+" "+pushkin.getGender());
        pushkin.setEmail("bestwriter@mail.com"); System.out.println(pushkin.getEmail());
        System.out.println(pushkin.toString());
        //Задание 2
        Ball ball = new Ball(1, 1);
        TestBall tester = new TestBall();
        tester.startTest(ball);
        //Задание 3
        Tester circs = new Tester(5);
        circs.addCircle(new Circle(10, 11, 12));
        circs.addCircle(new Circle(5465, 1654654, 1));
        circs.addCircle(new Circle(-9, 1, 2));
        circs.printCircles();
        circs.removeCircle();
        circs.printCircles();
        //Задание 4
        Shop shop = new Shop();

        while (true){
            System.out.println("Ведите команду:\nДобавление\nУдаление\nПоиск");
            String inp = scanner.next();
            if (inp.equals("Добавление")){
                shop.addPc();
                System.out.println(shop);
            }else if(inp.equals("Удаление")){
                System.out.println(shop);
                System.out.println("Параметр удаления:\nПроцессор\nПамять\nЦена");
                inp = scanner.next();
                if (inp.equals("Процессор")){
                    System.out.println("Введите значение параметра");
                    shop.deletePc(shop.findPc(scanner.next()));
                    System.out.println(shop);
                }else if (inp.equals("Память")){
                    System.out.println("Введите значение параметра");
                    shop.deletePc(shop.findPc(scanner.nextInt()));
                    System.out.println(shop);
                }else if (inp.equals("Цена")){
                    System.out.println("Введите значение параметра");
                    shop.deletePc(shop.findPc(scanner.nextDouble()));
                    System.out.println(shop);
                }
            }else if(inp.equals("Поиск")){
                System.out.println("Параметр поиска:\nПроцессор\nПамять\nЦена");
                inp = scanner.next();
                if (inp.equals("Процессор")){
                    System.out.println("Введите значение параметра");
                    System.out.println(shop.findPc(scanner.next()));
                }else if (inp.equals("Память")){
                    System.out.println("Введите значение параметра");
                    System.out.println(shop.findPc(scanner.nextInt()));
                }else if (inp.equals("Цена")){
                    System.out.println("Введите значение параметра");
                    System.out.println(shop.findPc(scanner.nextDouble()));
                }
            }else{
                break;
            }
        }
        //Задание 5
        TestCircle testCircle = new TestCircle();
        testCircle.doThing();
        //Задание 6
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.addBook(new Book(pushkin, "first",2001));
        bookshelf.addBook(new Book(pushkin, "fourth",2031));
        bookshelf.addBook(new Book(pushkin, "second",2010));
        bookshelf.addBook(new Book(pushkin, "third",2021));
        System.out.println(bookshelf);
        bookshelf.sortShelf();
        System.out.println(bookshelf);
        //Задание 7
        String[] strArr = {"one", "two", "three", "four", "five"};
        for (String s: strArr){
            System.out.println(s+" ");
        }
        revString(strArr);
        for (String s: strArr){
            System.out.println(s+" ");
        }
        //Задание 8
        Poker poker = new Poker();
        poker.giveCards(3);
        //Задание 9
        HowMany howMany = new HowMany();
        howMany.words();
    }
}
