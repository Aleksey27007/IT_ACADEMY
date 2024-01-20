package HomeWork10_01_24CollExceptions.ListSetMap;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        User userJohnFirst = new User("John", "Smith");
        User userJohnSecond = new User("John", "Smith");

        Set<User> usersSet = new HashSet<>();
        usersSet.add(userJohnFirst);
        usersSet.add(userJohnSecond);

        System.out.println(usersSet);
        System.out.println(userJohnFirst.equals(userJohnSecond));


    }
}
