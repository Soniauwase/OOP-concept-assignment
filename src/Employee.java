public class Employee {
    private int employee_id;
    private String employee_name;
    private String employee_sstatus;
    private double salary;

    public Employee(int employee_id, String employee_name, String employee_sstatus, double salary) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_sstatus = employee_sstatus;
        if (salary < 0) {
            System.out.println("Salary can't be negative");
        } else {
            this.salary = salary;
        }
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_sstatus() {
        return employee_sstatus;
    }

    public void setEmployee_sstatus(String employee_sstatus) {
        this.employee_sstatus = employee_sstatus;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if (salary < 0) {
            System.out.println("Salary can't be negative");
        } else {
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", employee_name='" + employee_name + '\'' +
                ", employee_sstatus='" + employee_sstatus + '\'' +
                ", salary=" + salary +
                '}';
    }
}
