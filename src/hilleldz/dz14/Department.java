package hilleldz.dz14;

import java.util.Arrays;

public class Department {

    private String name;
    private Employee[] employees = new Employee[100];

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            } else counter++;

            if (counter == 100) System.out.println("Отдел переполнен, невозможно добавить нового сотрудника!");
        }
        employee.setDepartment(this);
    }

    public void fireEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName().equals(employee.getName()) && employees[i].getSurname().equals(employee.getSurname())) {
                employees[i] = null;
            }
        }
    }

    public String getName() {
        return name;
    }

    public void showDepartment() {
        System.out.println("Сотрудники отдела " + name + ":");
        for (Employee emp : employees) {
            if (emp != null) System.out.println(emp);
        }
    }
}


