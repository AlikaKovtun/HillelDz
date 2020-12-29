package hilleldz.dz14;


public class Department {

    private String name;
    private Employee[] employees = new Employee[10];

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        for(Employee emp : employees) {
            if(emp!=null && emp.getName().equals(employee.getName())&&emp.getSurname().equals(employee.getSurname())){
                System.out.println("Этот сотрудник уже занесен в этот отдел!");
                return;
            }
        }
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                employee.setDepartment(this);
                break;
            } else counter++;
        }
            if (counter == 100) System.out.println("Отдел переполнен, невозможно добавить нового сотрудника!");

    }

    public void fireEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName().equals(employee.getName()) && employees[i].getSurname().equals(employee.getSurname())) {
                employees[i] = null;
                employee.setDepartment(null);
            }
        }
    }

    public String getName() {
        return name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void showDepartment() {
        System.out.println("Сотрудники отдела " + name + ":");
        for (Employee emp : employees) {
            if (emp != null) System.out.println(emp);
        }
    }
}


