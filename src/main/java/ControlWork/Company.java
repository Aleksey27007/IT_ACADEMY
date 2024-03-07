package ControlWork;


import java.util.List;

public class Company {
    private String id;
    private String name;
    private List<User> users;

    public Company(String id, String name, List<User> users) {
        this.id = id;
        this.name = name;
        this.users = users;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void printUsers(List<User> users) {
        for (User user: users) {
            System.out.println("ID: " + user.getId() + " Name: " + user.getName() + " Title: " + user.getTitle());
        }
    }
}
