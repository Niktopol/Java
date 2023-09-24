import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import task5.*;
import task5.Rectangle;
import task5.Shape;

public class Task5 {
    int team1score = 0;
    int team2score = 0;

    public void increaseTeam1(){
        team1score += 1;
    }
    public void increaseTeam2(){
        team2score += 1;
    }
    private void playFootball(){
        JFrame frame = new JFrame("Football match");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,200));
        panel.setBackground(Color.GREEN);
        panel.setLayout(new VerticalLayout());
        JButton team1 = new JButton("AC Milan");
        JButton team2 = new JButton("Real Madrid");
        JLabel score = new JLabel( team1score+" X " + team2score);
        JLabel lastScorer = new JLabel( "Last Scorer: N/A");
        JLabel winner = new JLabel( "Winner: DRAW");
        panel.add(team1);
        panel.add(team2);
        panel.add(score);
        panel.add(lastScorer);
        panel.add(winner);
        team1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                increaseTeam1();
                score.setText(team1score+" X " + team2score);
                lastScorer.setText("Last Scorer: "+team1.getText());
                winner.setText("Winner: "+(team1score > team2score ? team1.getText(): team1score == team2score? "DRAW" : team2.getText()));
            }
        });
        team2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                increaseTeam2();
                score.setText(team1score+" X " + team2score);
                lastScorer.setText("Last Scorer: "+team2.getText());
                winner.setText("Winner: "+(team1score > team2score ? team1.getText(): team1score == team2score? "DRAW" : team2.getText()));
            }
        });
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
    private void drawRandomShapes(Graphics g) {
        Random random = new Random();
        ArrayList<Shape> shapes = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int x = random.nextInt(700);
            int y = random.nextInt(700);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            if (random.nextInt(2) % 2 == 0) {
                int radius = random.nextInt(50) + 10;
                shapes.add(new Circle(color, new Point(x, y), radius));
            } else {
                int width = random.nextInt(100) + 20;
                int height = random.nextInt(100) + 20;
                shapes.add(new Rectangle(color, new Point(x, y), width, height));
            }
        }

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
    public void doThing() {
        playFootball();

        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawRandomShapes(g);
            }
        };
        frame.getContentPane().add(panel);
        frame.setVisible(true);

        Animation animation = new Animation();
        animation.runAnim();
    }
}
