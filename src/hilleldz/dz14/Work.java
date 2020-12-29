package hilleldz.dz14;


import java.time.LocalDate;

public class Work {
    public static void main(String[] args) {

        Department programmersDepartment = new Department("Программисты");
        Department accountantDepartment = new Department("Бухгатлеры");
        Department hrDepartment = new Department("Эйчары");
        Department cleaningDepartment = new Department("Уборщики");

        //Создаем сотрудников и добавляем в отделы
        Employee sysEngineer = new Employee("Nico", "Hulkenberg", LocalDate.of(1990, 4, 5), "Девопс");
        programmersDepartment.addEmployee(sysEngineer);
        Employee hr1 = new Employee("Anna", "Dmitrieva", LocalDate.of(19990, 5, 10), "Эйчар");
        hrDepartment.addEmployee(hr1);
        Employee hr2 = new Employee("Maria", "Petrova", LocalDate.of(1979, 1, 8), "Эйчар");
        hrDepartment.addEmployee(hr2);
        Employee recruter = new Employee("Antonio", "Giovinazzi", LocalDate.of(1992, 12, 30), "Рекрутер");
        hrDepartment.addEmployee(recruter);
        Employee accountant = new Employee("Valtteri", "Bottas", LocalDate.of(1977, 4, 13), "Бухгалтер");
        accountantDepartment.addEmployee(accountant);
        Employee chefAccountant = new Employee("Lewis", "Hamilton", LocalDate.of(1980, 5, 10), "Главный бухгалтер");
        accountantDepartment.addEmployee(chefAccountant);
        Employee cleanManager1 = new Employee("Lance", "Stroll", LocalDate.of(1992, 1, 18), "Уборщик");
        cleaningDepartment.addEmployee(cleanManager1);
        Employee cleanManager2 = new Employee("Nikita", "Mazepin", LocalDate.of(1990, 4, 13), "Мойщик окон");
        cleaningDepartment.addEmployee(cleanManager2);
        Employee javaProg = new Employee("George", "Russel", LocalDate.of(1993, 11, 11), "Java разработчик");
        programmersDepartment.addEmployee(javaProg);
        Employee pytonProg = new Employee("Lando", "Norris", LocalDate.of(1991, 9, 19), "Pyton разработчик");
        programmersDepartment.addEmployee(pytonProg);


        System.out.println("Относится к отделу " + sysEngineer.getDepartment().getName());

        //Выводим информацию об отделах
        System.out.println();
        programmersDepartment.showDepartment();
        System.out.println();
        hrDepartment.showDepartment();
        System.out.println();
        accountantDepartment.showDepartment();
        System.out.println();
        cleaningDepartment.showDepartment();

         //увольняем сотрудника
        programmersDepartment.fireEmployee(javaProg);
        System.out.println();
        programmersDepartment.showDepartment();

    }
}
