package Lesson11;

public class Box<T> { // джейнерики
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
