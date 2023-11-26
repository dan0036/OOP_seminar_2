package OOP;

import java.time.LocalDate;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Cat extends Animal implements Goable, Flyable{

    Double kickHard;
    Double runSpeed;

    public Cat() {
        super();
    }

    public Cat(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Cat run");
    }

    @Override
    public Double getRunSpeed() {
        return runSpeed;
    }

    @Override
    public void fly() {
        System.out.println("Even cats fly, but not for long.");
    }

    @Override
    public Double getFlySpeed() {
        return kickHard/2;
    }
}
