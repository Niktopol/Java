package task17;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyStudentController {
    private Student model;
    private MyStudentView view;

    public MyStudentController(Student model, MyStudentView view) {
        this.model = model;
        this.view = view;

        setName(model.getName());
        setRollNo(model.getRollNo());

        view.addNameTextFieldListener(new NameTextFieldListener());
        view.addRollNoTextFieldListener(new RollNoTextFieldListener());
        view.addButtonListener(new AddButtonListener());
    }

    class NameTextFieldListener implements DocumentListener {
        public void insertUpdate(DocumentEvent e) {
            updateModel();
        }

        public void removeUpdate(DocumentEvent e) {
            updateModel();
        }

        public void changedUpdate(DocumentEvent e) {
            updateModel();
        }
    }

    class RollNoTextFieldListener implements DocumentListener {
        public void insertUpdate(DocumentEvent e) {
            updateModel();
        }

        public void removeUpdate(DocumentEvent e) {
            updateModel();
        }

        public void changedUpdate(DocumentEvent e) {
            updateModel();
        }
    }

    private void updateModel() {
        model.setName(getName());
        model.setRollNo(getRollNo());
    }

    class AddButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = getName();
            String rollNo = getRollNo();
            setName("");
            setRollNo("");
            view.showConfirmationMessage("Студент " + name + " с номером " + rollNo + " добавлен в реестр.");
        }
    }
    public String getName() {
        return this.view.getFullNameField().getText();
    }

    public void setName(String name) {
        this.view.getFullNameField().setText(name);
    }

    public String getRollNo() {
        return this.view.getRollNoField().getText();
    }

    public void setRollNo(String rollNo) {
        this.view.getRollNoField().setText(rollNo);
    }
}