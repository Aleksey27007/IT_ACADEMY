package HomeWork21_02_24.Reflection.Annotation;

class TestAnnotation {
    @SuppressWarnings("deprecation")
    public String old() {
        return "Any text.";
    }
}

class CallOld {
    @Deprecated
    public void call() {
        TestAnnotation message = new TestAnnotation();
        System.out.println(message.old());
    }
}


public class Main {
    public static void main(String[] args) {
        CallOld callOld = new CallOld();
        callOld.call();
    }
}
