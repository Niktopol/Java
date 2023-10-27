package task22;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CalculatorControl {
    JTextArea text;
    ArrayList<JButton> buttons;
    public CalculatorControl(CalculatorView view, CalculatorModel model){
        text = view.getTextarea();
        buttons = view.getButtons();

        for(JButton i: buttons){
            if(i.getText().equals("=")){
                i.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        text.setText(model.calculate(text.getText()));
                    }
                });
            } else{
                i.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        text.append(i.getText().equals("Next")?" ":i.getText());
                    }
                });
            }
        }
    }
}

