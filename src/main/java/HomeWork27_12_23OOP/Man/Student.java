package HomeWork27_12_23OOP.Man;

public class Student extends Man{
    private int yearOfStudy;

    public Student(int yearOfStudy, String sex) {
        super(sex);
        this.yearOfStudy = yearOfStudy;
    }

    public Student() {
    }
    public void upDateOfStudy() {
        this.yearOfStudy = yearOfStudy + 1;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }
}
