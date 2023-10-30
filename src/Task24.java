import task24.*;

public class Task24 {
    public void doThing(){
        //Задание 1
        ComplexAbstractFactory factory = new ConcreteFactory();
        // Создаем комплексное число через фабрику
        Complex complex1 = factory.createComplex(3, 4);
        Complex complex2 = factory.createComplex(1, 2);
        // Выводим комплексные числа
        System.out.println("Complex 1: " + complex1); // Вывод: Complex 1: 3 + 4i
        System.out.println("Complex 2: " + complex2); // Вывод: Complex 2: 1 + 2i
        // Выполняем операции с комплексными числами
        int sumReal = complex1.getReal() + complex2.getReal();
        int sumImaginary = complex1.getImaginary() + complex2.getImaginary();

        System.out.println("Sum of Complex Numbers: " + sumReal + " + " + sumImaginary + "i"); // Вывод: Sum of Complex Numbers: 4 + 6i

        //Задание 2
        AbstractChairFactory chairFactory = new ChairFactory();
        Chair chair1 = chairFactory.createMagicChair();
        Chair chair2 = chairFactory.createFunctionalChair();
        Chair chair3 = chairFactory.createVictorianChair();
        Client client = new Client();
        client.setChair(chair1);
        client.sit();

        client.setChair(chair2);
        client.sit();

        client.setChair(chair3);
        client.sit();
        //Задание 3
        ICreateDocument textDocumentFactory = new CreateTextDocument();
        ICreateDocument musicDocumentFactory = new CreateMusicDocument();
        ICreateDocument imageDocumentFactory = new CreateImageDocument();

        EditorWindow textEditor = new EditorWindow(textDocumentFactory, "text");
        EditorWindow musicEditor = new EditorWindow(musicDocumentFactory, "music");
        EditorWindow imageEditor = new EditorWindow(imageDocumentFactory, "image");
    }
}
