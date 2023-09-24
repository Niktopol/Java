package task5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation {
    private int animFrame = 0;
    private JLabel label;
    private JFrame frame;
    private String path = System.getProperty("user.dir") + "\\src\\task5\\";

    private String[] images = {
            "1.png",
            "2.png",
            "3.png",
            "4.png",
            "5.png",
            "6.png",
            "7.png",
            "8.png",
    };
    public void runAnim() {
        System.out.println();
        frame = new JFrame("Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480, 260);

        label = new JLabel();
        frame.add(label);
        Timer timer = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateImage();
            }
        });

        timer.start();
        updateImage();
        frame.setVisible(true);
    }
    private void updateImage() {
        ImageIcon imageIcon = new ImageIcon(path+images[animFrame]);
        label.setIcon(imageIcon);
        animFrame = (animFrame+1) < images.length? ++animFrame: 0;
    }
}
