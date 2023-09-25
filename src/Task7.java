import task7.*;

public class Task7 {
    public void printMagazines(Printable[] printable){
        for(Printable i: printable){
            if (i instanceof Magazine){
                i.print();
            }
        }
    }
    public void printBooks(Printable[] printable){
        for(Printable i: printable){
            if (i instanceof Book){
                i.print();
            }
        }
    }
    public void doThing(){
        MathSet oprns = new MathSet();
        System.out.println(oprns.power(2, 8));
        System.out.println(oprns.compAbs(new ComplexNum(3,4)));
        System.out.println(oprns.getCircArea(10));

        ProcessStrings processStrings = new ProcessStrings();
        String s = "THIS IS A STRING";
        System.out.println(processStrings.countChars(s));
        System.out.println(processStrings.getOdd(s));
        System.out.println(processStrings.makeReversed(s));

        Printable[] toRead = {new Book("Война и мир"),new Book("Преступление и наказание"), new Magazine("Сканворды"),new Magazine("Современник"),new Book("Муму")};
        printMagazines(toRead);
        printBooks(toRead);
    }
}
