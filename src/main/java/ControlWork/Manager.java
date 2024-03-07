package ControlWork;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Manager extends User{
    private Unit unit;
    private List<Developer> developers;
    private List<Task> tasks;

    public Manager(String id, String name, Title title) {
        super(id, name, title);
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public List<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void giveATask(JavaDeveloper javaDeveloper, Task task) {
        ExecutorService exservice = Executors.newSingleThreadExecutor();
        javaDeveloper.setTask(task);
        javaDeveloper.develop();
        exservice.execute(task.getTask());
        exservice.shutdown();
    }

    public void giveATask(KotlinDeveloper kotlinDeveloper, Task task) {
        ExecutorService exservice = Executors.newSingleThreadExecutor();
        kotlinDeveloper.setTask(task);
        kotlinDeveloper.develop();
        exservice.execute(task.getTask());
        exservice.shutdown();
    }
}
