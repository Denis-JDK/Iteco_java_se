package java_course.lesson5;

public class User<T> implements Message {
    private T name;
    private int id;
    private String message;


    public User(T name, int id) {
        this.name = name;
        this.id = id;
        this.message = "User";
    }

    public T getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
