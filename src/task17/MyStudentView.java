package task17;

import javax.swing.*;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyStudentView {
    private JFrame frame;
    private JTextField fullNameField;
    private JTextField rollNoField;
    private JButton addButton;

    public MyStudentView() {
        frame = new JFrame("Student Information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 200);
        frame.setLayout(new GridLayout(4, 2));

        frame.add(new JLabel("Name:"));
        fullNameField = new JTextField();
        frame.add(fullNameField);

        frame.add(new JLabel("Roll No:"));
        rollNoField = new JTextField();
        frame.add(rollNoField);

        addButton = new JButton("Добавить в реестр студентов");
        frame.add(addButton);

        frame.setVisible(true);
    }

    public JTextField getFullNameField() {
        return fullNameField;
    }

    public JTextField getRollNoField() {
        return rollNoField;
    }

    public void addButtonListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    public void showConfirmationMessage(String message) {
        JOptionPane.showMessageDialog(frame, message, "Реестр студентов", JOptionPane.INFORMATION_MESSAGE);
    }
    public void addNameTextFieldListener(DocumentListener listener) {
        fullNameField.getDocument().addDocumentListener(listener);
    }

    public void addRollNoTextFieldListener(DocumentListener listener) {
        rollNoField.getDocument().addDocumentListener(listener);
    }
}
