package ControlWork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class KotlinDeveloper extends User implements Developer{
    private Task task;
    private final Unit unit = Unit.JAVA;

    public KotlinDeveloper(String id, String name, Title title) {
        super(id, name, title);
    }

    @Override
    public void develop() {
        ExecutorService exservice = Executors.newSingleThreadExecutor();
        Runnable task = () -> {
            try {
                this.task.setStatus(TaskStatus.IN_PROGRESS);
                this.task.writeMessage(this.task.getContent(), this.task.getStatus());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        exservice.execute(task);
        exservice.shutdown();
        this.task.setStatus(TaskStatus.DONE);
        this.task.writeMessage(this.task.getContent(), this.task.getStatus());
    }

    @Override
    public Unit getUnit() {
        return this.unit;
    }

    @Override
    public void setTask(Task task) {
        this.task = task;
    }

    @Override
    public Task getTask() {
        return this.task;
    }
}
