package HomeWork10_01_24CollExceptions.ListSetMap;

import java.util.Objects;

public class User {
    // Создать класс User с полями firstName lastName.
    //  Добавить getters/setters
    //  Реализовать методы equals & hashCode
    //  Создавать два экземпляра User, оба с именем John Smith
    //  Добавить оба экземпляра в HashSet

    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User userSet = (User) o;
        return Objects.equals(getFirstName(), userSet.getFirstName()) && Objects.equals(getLastName(), userSet.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

