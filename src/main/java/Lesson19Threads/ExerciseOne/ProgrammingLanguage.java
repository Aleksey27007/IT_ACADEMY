package Lesson19Threads.ExerciseOne;

public enum ProgrammingLanguage {
    C_PLUS_PLUS("C++"),
    JAVA("Java");

    private String name;

    ProgrammingLanguage(String name) {
        this.name = name;
    }

    ProgrammingLanguage() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
