package entities;

public class Employee extends Person{
    private String employeeId;

    public Employee() {
        super();
    }

    public Employee(String id) {
        super(id);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
