package ControlWork;

import java.util.List;

public class Boss extends User{
    private List<Manager> managers;
    private Company company;
    private List<Task> tasks;
    private List<User> users;
    private static Boss boss;

    private Boss(String id, String name, Title title) {
        super(id, name, title);
    }

    public static Boss getBoss(String id, String name, Title title) {
        if (boss == null) {
            boss = new Boss(id, name, title);
        }
        return boss;
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public static Boss getBoss() {
        return boss;
    }

    public static void setBoss(Boss boss) {
        Boss.boss = boss;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addNewUser(User user) {
        boss.getUsers().add(user);
    }

    public void printManagers() {
        for (Manager manager: managers) {
            System.out.println("ID: " + manager.getId() + " Name: " + manager.getName() + " Title: " + manager.getTitle());
        }
    }
}
