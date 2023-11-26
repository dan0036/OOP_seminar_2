package OOP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

abstract class MedPersonnel{
    Integer salary;
    String fullName;
    ArrayList<String> specialAnimals = new ArrayList<>();
    Boolean[] timeTable;
    ArrayList<MedPersonnel> medPersFullList;
    public MedPersonnel(){
    }

    public MedPersonnel(String fullName){
        this.fullName = fullName;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setSpecialAnimals(String animalStr) {
        specialAnimals.add(animalStr);
    }

    public void setTimeTable(Boolean[] timeTable) {
        this.timeTable = timeTable;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getFullName() {
        return fullName;
    }

    public ArrayList<String> getSpecialAnimals() {
        return specialAnimals;
    }

    public Boolean[] getTimeTable() {
        return timeTable;
    }
}
