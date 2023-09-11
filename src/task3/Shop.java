package task3;

import java.util.ArrayList;
import java.util.Locale;

public class Shop {
    ArrayList<Good> goods = new ArrayList<Good>();
    public void addGood(Good good){
        goods.add(good);
    }
    public void buy(int ind, Locale loc){
        if (ind < goods.size()){
            System.out.println("Bought good №"+ind+" for "+ Converter.convert(goods.get(ind).getPrice(), Locale.US, loc));
            goods.remove(ind);
        }
    }
    @Override
    public String toString(){
        String s = "";
        for (int i = 0; i < goods.size()-1; i++){
            s += "["+i+"]"+goods.get(i).toString()+"\n";
        }
        s += "["+(goods.size()-1)+"]"+goods.get(goods.size()-1).toString();
        return s;
    }
}
