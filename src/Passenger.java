import java.util.Objects;

public class Passenger {

    private final String name;
    private final int age;
    private final boolean vip;

    public Passenger(String name, int age, boolean vip) {
        this.name = name;
        this.age = age;
        this.vip = vip;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVip() {
        return vip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passenger)) return false;
        Passenger that = (Passenger) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
