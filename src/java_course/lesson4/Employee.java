package java_course.lesson4;

public class Employee extends Person implements PrintTable, SeasonHandler{

    private int id;
    private Season season;

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String name, int age, int id, Season season) {
        super(name, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Season getSeason() {
        return season;
    }

    public void getField() {
        getId();
        getName();
    }
}
