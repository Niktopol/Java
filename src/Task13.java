import task13.Address;
import task13.Person;
import task13.PhoneNumber;
import task13.TShirt;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task13 {
    private void workWithString(String s){
        System.out.println(s.charAt(s.length()-1));
        System.out.println(s.endsWith("!!!"));
        System.out.println(s.startsWith("Java"));
        System.out.println(s.contains("Java"));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.replace('a', 'o'));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("Java")+4));
    }
    private String getLine(ArrayList<String> s){
        StringBuilder sb = new StringBuilder();
        String prev = s.get(0);
        s.remove(0);
        while (!s.isEmpty()){
            boolean flag = false;
            for (int i = 0; i < s.size(); i++){
                if(s.get(i).substring(0, 1).equalsIgnoreCase(prev.substring(prev.length()-1))){
                    flag = true;
                    sb.append(prev).append(" ");
                    prev = s.get(i);
                    s.remove(i);
                    break;
                }
            }
            if (!flag){
                sb.append(prev).append(" ");
                prev = s.get(0);
                s.remove(0);
            }
        }
        sb.append(prev);
        return sb.toString();
    }
    public void doThing() throws IOException {
        //Задание 1
        workWithString("I like Java!!!");
        //Задние 2
        Person one = new Person("Петров");
        Person two = new Person("Петров", "Игорь", "Алексеевич");
        System.out.println(one.getNames());
        System.out.println(two.getNames());
        //Задние 3
        Address a = new Address("SSSSS,RRRRR,GGGGG,UUUUU,DDDDD,KKKKK,KVKVKV");
        System.out.println(a + "\n-----");
        Address b = new Address("SSSSS.RRRRR.GGGGG.UUUUU.DDDDD.KKKKK.KVKVKV", ".");
        System.out.println(b + "\n-----");
        Address c = new Address("SSSSS;RRRRR;GGGGG;UUUUU;DDDDD;KKKKK;KVKVKV", ";");
        System.out.println(c + "\n-----");
        Address d = new Address("SSSSS|RRRRR|GGGGG|UUUUU|DDDDD|KKKKK|KVKVKV", "|");
        System.out.println(d + "\n-----");
        //Задание 4
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        TShirt[] cshirts = new TShirt[11];
        for (int i = 0; i < 11; i++){
            cshirts[i] = new TShirt(shirts[i]);
            System.out.println(cshirts[i]);
        }
        //Задание 5
        PhoneNumber nmb1 = new PhoneNumber("+70123456789");
        System.out.println(nmb1);
        PhoneNumber nmb2 = new PhoneNumber("80123456789");
        System.out.println(nmb2);
        //Задание 6
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла");
        Scanner fileReader = new Scanner(new File(System.getProperty("user.dir") + "\\src\\task13\\"+scanner.next()));
        fileReader.useDelimiter(" ");
        StringBuilder sb = new StringBuilder();
        while (fileReader.hasNext()){
            String s = fileReader.next();
            if (!s.isEmpty()) {
                sb.append(s + " ");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write(getLine(new ArrayList<String>(Arrays.asList(sb.toString().split(" ")))));

        writer.close();
    }
}
