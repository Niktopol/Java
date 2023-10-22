package task17;

public class MVCEmployeeDemo {
    private static Employee retriveEmployeeFromDatabase() {
        Employee employee = new Employee();
        employee.setFullName("Ермаков Кирилл");
        employee.setSalary(69696969);
        return employee;
    }
    public void main() {
        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeSalary(70000000);
        System.out.println("After updating:");
        controller.updateView();
    }

}
