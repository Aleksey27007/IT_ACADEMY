package Lesson19Threads.ExerciseOne;


import java.util.Set;
import java.util.UUID;

public class Developer {

    private UUID id;
    private String name;
    private Set<ProgrammingLanguage> programmingLanguages;

    public Developer(String name, Set<ProgrammingLanguage> programmingLanguages) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.programmingLanguages = programmingLanguages;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ProgrammingLanguage> getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(Set<ProgrammingLanguage> programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public void deleteProgLanguage(ProgrammingLanguage language) {
        this.programmingLanguages.remove(language);
    }

    public void addProgLanguage(ProgrammingLanguage language) {
        this.programmingLanguages.add(language);
    }

}
