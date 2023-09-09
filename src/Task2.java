import task2.*;

import java.util.Scanner;

public class Task2 {
    public void doThing(){
        Scanner scanner = new Scanner(System.in);

        Author pushkin = new Author("Alex", "litpushkin@mail.com", 'M');
        System.out.println(pushkin.getName()+" "+pushkin.getEmail()+" "+pushkin.getGender());
        pushkin.setEmail("bestwriter@mail.com"); System.out.println(pushkin.getEmail());
        System.out.println(pushkin.toString());

        Ball ball = new Ball(1, 1);
        TestBall tester = new TestBall();
        tester.startTest(ball);

        Tester circs = new Tester(5);
        circs.addCircle(new Circle(10, 11, 12));
        circs.addCircle(new Circle(5465, 1654654, 1));
        circs.addCircle(new Circle(-9, 1, 2));
        circs.printCircles();
        circs.removeCircle();
        circs.printCircles();

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
        TestCircle testCircle = new TestCircle();
        testCircle.doThing();
    }
}
