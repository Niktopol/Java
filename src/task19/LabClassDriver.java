package task19;

import java.util.Scanner;

public class LabClassDriver {
    public void runUI(){
        LabClassUI ui = new LabClassUI();
        while (true){
            ui.runCommand();
            ui.updateStudentInfo();
        }
    }
}
