package task19;

import java.util.Scanner;

public class LabClassUI {

    private LabClass back;
    public LabClassUI(){
        back = new LabClass();
    }
    public void updateStudentInfo(){
        System.out.println("Список студентов:");
        System.out.println(back.getStudents());
    }
    public void runCommand(){
        System.out.println("Введите команду (Add, Find, Sort):");
        Scanner scanner = new Scanner(System.in);
        String cmd = scanner.next();

        if(cmd.equals("Add")){
            System.out.print("Введите ФИО студента: ");
            cmd = scanner.next();
            System.out.print("Введите ID студента: ");
            int id = scanner.nextInt();
            back.addStudent(new Student(id, cmd));
        }else if(cmd.equals("Find")){
            System.out.print("Введите ФИО студента: ");
            cmd = scanner.next();
            try{
                System.out.println("Студент найден: "+back.findStudent(cmd));
            }catch (StudentNotFoundException e){
                System.out.println(e);
            }catch (EmptyStringException e){
                System.out.println(e);
            }

        }else if(cmd.equals("Sort")){
            back.sortStudents();
        }
    }
}
