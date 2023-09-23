import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import task5.*;

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
        frame.setSize(300,300);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,300));
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
    public void doThing() {
        playFootball();
    }
}
