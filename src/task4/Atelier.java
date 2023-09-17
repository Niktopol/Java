package task4;

public class Atelier {
    public void dressWoman(Clothes[] clothes){
        for (Clothes i: clothes){
            if (i instanceof WomenClothing){
                ((WomenClothing) i).dressWoman();
            }
        }
    }
    public void dressMan(Clothes[] clothes){
        for (Clothes i: clothes){
            if (i instanceof MenClothing){
                ((MenClothing) i).dressMan();
            }
        }
    }
}
