package Lesson24.ExOnlineShop.Exceptions;

public class NoSuchCategoryException extends  RuntimeException {

    public NoSuchCategoryException(String message) {
        super(message);
    }
}
