package ControlWork;


import java.util.Arrays;
import java.util.List;

public class TestCompany {
    public static void main(String[] args) {
        Boss boss = Boss.getBoss("1", "Andrew", Title.BOSS);
        Manager manager = new Manager("2", "Milord", Title.MANAGER);
        JavaDeveloper developerJava = new JavaDeveloper("3", "Ronald", Title.DEVELOPER);
        KotlinDeveloper developerKotlin = new KotlinDeveloper("4", "Sam", Title.DEVELOPER);

        List<User> employees = Arrays.asList(boss, manager, developerJava, developerKotlin);
        List<Manager> managers = Arrays.asList(manager);
        List<User> employeesForBoss = Arrays.asList(manager, developerJava, developerKotlin);
        List<Developer> developers = Arrays.asList(developerJava, developerKotlin);

        boss.setManagers(managers);
        boss.setUsers(employeesForBoss);

        Company company = new Company("0", "IT_ACADEMY", employees);

        company.printUsers(company.getUsers());
        System.out.println("---------------");
        company.printUsers(boss.getUsers());

        Task task1 = new Task("1", "develop", TaskStatus.CREATED);
        Task task2 = new Task("2", "develop", TaskStatus.CREATED);

        Runnable task = () -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        task1.setTask(task);
        task2.setTask(task);

        manager.setDevelopers(developers);
        manager.setTasks(Arrays.asList(task1, task2));

        manager.giveATask(developerJava, task1);
        manager.giveATask(developerKotlin, task2);
    }
}
