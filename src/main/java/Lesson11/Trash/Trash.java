package Lesson11.Trash;

public class Trash<T> {
    private T boxForPaper;

    private int paper;

    private T boxForGlass;

    private int glass;



    public T getBoxForPaper() {
        return boxForPaper;
    }

    public void setBoxForPaper(T boxForPaper) {
        this.boxForPaper = boxForPaper;
    }

    public int getPaper() {
        return paper;
    }

    public void setPaper(int paper) {
        this.paper = paper;
    }

    public T getBoxForGlass() {
        return boxForGlass;
    }

    public void setBoxForGlass(T boxForGlass) {
        this.boxForGlass = boxForGlass;
    }

    public int getGlass() {
        return glass;
    }

    public void setGlass(int glass) {
        this.glass = glass;
    }
}
