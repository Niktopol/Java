package task17;

public class MVCPatternDemo {
    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("МегаКрутой");
        student.setRollNo("9999");
        return student;
    }
    public void main(){
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Крутой");
        controller.setStudentRollNo("696");
        System.out.println("После обновления: ");
        controller.updateView();
    }
}
