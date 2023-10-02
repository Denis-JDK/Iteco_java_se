package java_course.lesson5;

import java.util.Objects;

public class Client<T> implements Message{
        private T id;
        private String name;
        private String message;

    public Client(T id, String name) {
        this.id = id;
        this.name = name;
        this.message = "Client";
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client<?> client = (Client<?>) o;
        return Objects.equals(id, client.id) && Objects.equals(name, client.name) && Objects.equals(message, client.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, message);
    }

    public T getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
