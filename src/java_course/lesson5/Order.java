package java_course.lesson5;

public class Order <T extends Message>{
    private T orderMan;

    public Order(T orderMan) {
        this.orderMan = orderMan;
    }

    public T getOrderMan() {
        return orderMan;
    }
}
