package OOP;

import javax.print.Doc;
import java.util.*;

public class VeterinaryClinic {
    public VeterinaryClinic() {
    }

    private List<Animal> patients = new ArrayList<>();
    static List<MedPersonnel> doctors = new ArrayList<>();
    static List<MedPersonnel> nurses = new ArrayList<>();

    public void setDoctors(MedPersonnel doctor) {
        doctors.add(doctor);
    }

    public void setNurses(MedPersonnel nurse) {
        nurses.add(nurse);
    }


    public  List<Animal> getPatients(){
        return patients;
    }

    public VeterinaryClinic addPatient(Animal patient){
        patients.add(patient);
        return this;
    }
    public void removePatient(Animal patient){
        patients.remove(patient);
    }

    public List<Animal> getGoable(){
        List<Animal> result = new ArrayList<>();
        for (Animal animal:patients){
            if (animal instanceof Goable){
                result.add(animal);
            }
        }
        return result;
    }

    public List<Animal> getFlyable() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : patients) {
            if (animal instanceof Flyable) {
                result.add(animal);
            }
        }
        return result;
    }

    public List<Animal> getSwimmable() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : patients) {
            if (animal instanceof Swimmable) {
                result.add(animal);
            }
        }
        return result;
    }


    // Недоработан. Выводит на печать множество дней недели, для которых указана пара доктор-м/сестра,
    // которые специализируются на одинаковых животных (м/сестра обеспечивает все специализации доктора)
    // и совпадают по личному расписанию.
   void getScheduleClinic(){
        Map<Integer, ArrayList<MedPersonnel[]>> scheduleClinic = new HashMap<>();
       for (int i = 0; i < 7; i++) {
           ArrayList<MedPersonnel[]> mp = new ArrayList<>();
           for (MedPersonnel doctor : doctors) {
               for (MedPersonnel nurse : nurses) {
                   if (doctor.timeTable[i] &&
                           nurse.timeTable[i] &&
                           nurse.specialAnimals.containsAll(doctor.specialAnimals)){
                       MedPersonnel[] mpArr = new MedPersonnel[2];
                       mpArr[0] = doctor;
                       mpArr[1] = nurse;
                       mp.add(mpArr);
                       scheduleClinic.put(i, mp);
                   }
               }
           }
       }
       System.out.println(scheduleClinic);
   }




}
