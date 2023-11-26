package OOP;

import java.time.LocalDate;

public class Fish extends Animal implements Swimmable{
    Double swimSpeed;
    public Fish() {
        super();
    }

    public Fish(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void swim() {
        System.out.println("Fish swims");
    }

    @Override
    public Double getSwimSpeed() {
        return swimSpeed;
    }
}
