package OOP;

import java.time.LocalDate;

public class Duck extends Animal implements Flyable, Swimmable{
    Double flySpeed;
    Double swimSpeed;
    public Duck() {
        super();
    }

    public Duck(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println("Duck flies");
    }

    @Override
    public Double getFlySpeed() {
        return flySpeed;
    }

    @Override
    public void swim() {
        System.out.println("Duck swims");
    }

    @Override
    public Double getSwimSpeed() {
        return swimSpeed;
    }
}
