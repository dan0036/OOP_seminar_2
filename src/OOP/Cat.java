package OOP;

import java.time.LocalDate;

public class Cat extends Animal{
    public Cat() {
        super();
    }

    public Cat(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public void swim() {
        System.out.println("afraid water");
    }

    @Override
    public void fly() {
        System.out.println("can not swim");
    }
}
