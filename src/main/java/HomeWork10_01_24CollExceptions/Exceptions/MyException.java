package HomeWork10_01_24CollExceptions.Exceptions;

public class MyException extends Throwable {
    private String s;

    public MyException(String s) {
        super(s);
    }
}
