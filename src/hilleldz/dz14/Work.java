package hilleldz.dz14;


import java.util.Date;

public class Work {
    public static void main(String[] args) {

        Department programmersDepartment = new Department("Программисты");
        Department accountantDepartment = new Department("Бухгатлеры");
        Department hrDepartment = new Department("Эйчары");
        Department cleaningDepartment = new Department("Уборщики");

        //Создаем сотрудников и добавляем в отделы
        Employee sysEngineer = new Employee("Nico", "Hulkenberg", new Date(80, 5, 17), "Девопс");
        programmersDepartment.addEmployee(sysEngineer);
        Employee hr1 = new Employee("Anna", "Dmitrieva", new Date(90, 5, 10), "Эйчар");
        hrDepartment.addEmployee(hr1);
        Employee hr2 = new Employee("Maria", "Petrova", new Date(79, 1, 8), "Эйчар");
        hrDepartment.addEmployee(hr2);
        Employee recruter = new Employee("Antonio", "Giovinazzi", new Date(92, 0, 30), "Рекрутер");
        hrDepartment.addEmployee(recruter);
        Employee accountant = new Employee("Valtteri", "Bottas", new Date(77, 4, 13), "Бухгалтер");
        accountantDepartment.addEmployee(accountant);
        Employee chefAccountant = new Employee("Lewis", "Hamilton", new Date(80, 5, 10), "Главный бухгалтер");
        accountantDepartment.addEmployee(chefAccountant);
        Employee cleanManager1 = new Employee("Lance", "Stroll", new Date(92, 1, 18), "Уборщик");
        cleaningDepartment.addEmployee(cleanManager1);
        Employee cleanManager2 = new Employee("Nikita", "Mazepin", new Date(90, 4, 13), "Мойщик окон");
        cleaningDepartment.addEmployee(cleanManager2);
        Employee javaProg = new Employee("George", "Russel", new Date(93, 11, 11), "Java разработчик");
        programmersDepartment.addEmployee(javaProg);
        Employee pytonProg = new Employee("Lando", "Norris", new Date(91, 9, 19), "Pyton разработчик");
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
