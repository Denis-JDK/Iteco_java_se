package java_course.lesson4;

public class Client extends Person implements PrintTable, SeasonHandler{

    private String name = "Client";

    private int order;
    private Season season;
    public Client() {
    }

    public Client(String name, int age, int order, Season season) {
        super(name, age);
        this.order = order;
        this.season = season;
    }

    public int getOrder() {
        return order;
    }


    @Override
    public String getName() {
        return name;
    }

    public void getField() {
        getName();
        getOrder();
    }

    public Season getSeason() {
        return season;
    }
}
