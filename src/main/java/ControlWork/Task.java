package ControlWork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private String id;
    private String content;
    private TaskStatus status;
    private Runnable task;
    private final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("MMMM, dd, yyyy HH:mm:ss SSS");
    private final LocalDateTime DATE_TIME = LocalDateTime.now();
    private final String CURRENT_DATE = DATE_TIME.format(FORMATTER);
    private final String path = "D:\\IntJava\\IT_Academy\\IT_AcademyLessonsAndHomeW\\src\\main\\java\\ControlWork\\test_file.txt";

    public Task(String id, String content, TaskStatus status) {
        this.id = id;
        this.content = content;
        this.status = status;
        writeMessage(this.content, this.status);
    }

    public void writeMessage(String content, TaskStatus status) {
        File file = new File(getPath());

        try(FileWriter writer = new FileWriter(getPath(), true)) {
            if (!file.exists()) {
                Files.createFile(Path.of(getPath()));
            }
            writer.write(id + " ");
            writer.write(getCURRENT_DATE() + " ");
            writer.write(content + " ");
            writer.write(status.toString() + "\n");
            writer.write("----------\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public DateTimeFormatter getFORMATTER() {
        return FORMATTER;
    }

    public LocalDateTime getDATE_TIME() {
        return DATE_TIME;
    }

        public String getCURRENT_DATE() {
        return CURRENT_DATE;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public String getPath() {
        return path;
    }

    public Runnable getTask() {
        return task;
    }

    public void setTask(Runnable task) {
        this.task = task;
    }
}
