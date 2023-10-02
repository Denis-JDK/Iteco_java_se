package java_course.lesson5;

public class Main {
    public static void main(String[] args) {
        User user = new User<>(3, 3);

        System.out.println(user.getName());
        System.out.println(user.getMessage());

        Order order = new Order<>(new Client<>(3, "New" ));
        System.out.println(order.getOrderMan().getMessage());
    }


}
