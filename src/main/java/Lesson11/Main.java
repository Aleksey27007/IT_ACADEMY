package Lesson11;

public class Main {
    public static void main(String[] args) {

        Box box = new Box();
        box.setItem("it s new item");

        System.out.println(box.getItem());

        Box<Integer> newBox = new Box<Integer>();
        box.setItem(12);
        System.out.println(box.getItem());
    }
}
