package OOP;

import java.time.LocalDate;

public class Cat extends Animal implements Speakble,Goable{
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
    public void swim() {
        System.out.println("afraid water");
    }

    @Override
    public void fly() {
        System.out.println("can not swim");
    }

    @Override
    public void speak() {
        System.out.println("meow");
    }

    @Override
    public void run() {
        System.out.println("Cat run");
    }


}
