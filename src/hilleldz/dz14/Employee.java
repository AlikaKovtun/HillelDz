package hilleldz.dz14;

import java.time.LocalDate;

public class Employee {
    private String name;
    private String surname;
    private LocalDate birthday;
    private String position;
    private Department department;

    public Employee(String name, String surname, LocalDate birthday, String position) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
         if(department==null) {
             this.department = department;
             return;
         }
        this.department = department;
        for (Employee emp : department.getEmployees()) {
            if (emp != null && emp.getName().equals(name) && emp.getSurname().equals(surname)) {
                return;
            }
        }
            department.addEmployee(this);
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + birthday + " " + position;
    }

}


