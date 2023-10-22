package task17;

public class MyMVC {
    public Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Ермаков Кирилл");
        student.setRollNo(""+(1000-7));
        return student;
    }
    public void main() {
        Student model = retriveStudentFromDatabase();
        MyStudentView view = new MyStudentView();
        MyStudentController controller = new MyStudentController(model, view);
    }
}
