package HomeWork27_12_23OOP.Man;

public class MainMan {
    public static void main(String[] args) {

        Student Alex = new Student(0, "male");
        System.out.println(Alex.getYearOfStudy());

        System.out.println(Alex.getSex());

        Alex.setName("Alex");
        System.out.println(Alex.getName());

        Alex.setAge(18);
        System.out.println(Alex.getAge());

        Alex.setHumanWeight(68.5f);
        System.out.println(Alex.getHumanWeight());

        Alex.upDateOfStudy();
        System.out.println(Alex.getYearOfStudy());
    }
}
