package OOP;

import java.time.LocalDate;

public class Dog extends Animal implements Goable{
    public Dog() {
        super();
    }

    Double runSpeed;

    public void setRunSpeed(Double runSpeed) {
        this.runSpeed = runSpeed;
    }

    public Dog(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void run() {
        System.out.println("Dog runs");
    }

    @Override
    public Double getRunSpeed() {
        return runSpeed;
    }
}

