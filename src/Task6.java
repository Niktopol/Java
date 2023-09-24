import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import task6.*;

public class Task6 {

    private Random random = new Random();
    private JPanelMoveble panel;
    public void doThing(){
        //Задание 1,2,3,5
        JFrame frame = new JFrame("Movable Shape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        panel = new JPanelMoveble();
        frame.getContentPane().add(panel);
        frame.setVisible(true);
        panel.repaint();
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.move();
                panel.repaint();
            }
        });
        timer.start();
        //Задание 11
        String numbers = "0123456789";

        ModifiedStringBuilder sb = new ModifiedStringBuilder(numbers);

        System.out.println(sb.substring(3)); //3456789
        System.out.println(sb.substring(4, 8)); //4567
        System.out.println(sb.replace(3, 5, "ABCDE"));

        sb = new ModifiedStringBuilder(numbers);
        System.out.println(sb.reverse());
        sb.reverse();

        sb = new ModifiedStringBuilder(numbers);
        System.out.println(sb.delete(5, 9)); //012349
        System.out.println(sb.deleteCharAt(1)); //02349
        System.out.println(sb.insert(1, "One")); //0One2349
        sb.undo();
        sb.undo();
        System.out.println(sb);

        ModifiedStringBuilder sbsub1 = new ModifiedStringBuilder(numbers);
        ModifiedStringBuilder sbsub2 = new ModifiedStringBuilder(numbers);
        sb.addSubscriber(sbsub1);
        sb.addSubscriber(sbsub2);
        sb.notifySubs();
        System.out.println("Notified");
        System.out.println(sbsub1);
        System.out.println(sbsub2);
        sbsub1.undo();
        System.out.println(sbsub1);
    }
}
