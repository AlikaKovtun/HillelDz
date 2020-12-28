package hilleldz.dz14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private String name;
    private String surname;
    private Date birthday;
    private String position;
    Department department;

    public Employee(String name, String surname, Date birthday, String position) {
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
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
        this.department = department;
    }

    @Override
    public String toString() {
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-YYYY");
        return name + " " + surname + " " + formater.format(birthday) + " " + position;
    }

}


