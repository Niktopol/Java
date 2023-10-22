package task17;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;
    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }
    public void setEmployeeSalary(int salary) {
        this.model.setSalary(salary);
    }
    public int getEmployeeSalary() {
        return this.model.getSalary();
    }
    public void setEmployeeFullName(String fullName) {
        this.model.setFullName(fullName);
    }
    public String getEmployeeFullName() {
        return this.model.getFullName();
    }
    public void updateView() {
        this.view.printEmployeeDetails(this.model.getSalary(), this.model.getFullName());
    }
}