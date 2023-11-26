package OOP;

import java.time.LocalDate;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        Cat cat = new Cat();//Экземпляр класса
        cat.setName("Barsic");
//        System.out.println(cat.getName());
        Dog dog = new Dog("max",new Chumka("chumka"),"petr", LocalDate.of(3,12,21));
//        System.out.println(dog.getName());
//        System.out.println(dog.getIllness());
//        dog.getIllness().heal();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
//        cat.liveCircle();
//        cat.toGo();
        Duck duck = new Duck();
        Fish fish = new Fish();
//        duck.fly();
//        fish.fly();
        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatient(cat).addPatient(dog).addPatient(duck);
//        System.out.println(clinic.getPatients());
//        System.out.println(clinic.getGoable());

        dog.setRunSpeed(8.0);
        System.out.println(dog.getRunSpeed()+ " is dogs speed.");

        MedPersonnel doglikeDoc = new Doctor();
        clinic.setDoctors(doglikeDoc);
        doglikeDoc.setSpecialAnimals("goable");
        doglikeDoc.setSpecialAnimals("flyable");
        MedPersonnel dogLikeNurse = new Nurse();
        clinic.setNurses(dogLikeNurse);
        dogLikeNurse.setSpecialAnimals("swimmable");
        dogLikeNurse.setSpecialAnimals("goable");
        dogLikeNurse.setSpecialAnimals("flyable");

        Boolean[] booleans = new Boolean[]{true, false, true, false, true, false, false};
        doglikeDoc.setTimeTable(booleans);
        booleans = new Boolean[]{true, true, true, false, false, false, false};
        dogLikeNurse.setTimeTable(booleans);

        clinic.getScheduleClinic(); // Могут работать по понедельникам и средам.

    }
}
