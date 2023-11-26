package OOP;

import java.util.ArrayList;

class Doctor extends MedPersonnel {
    public Doctor() { super(); }

    ArrayList<Animal> specAnimal;
    String diploma;

    public ArrayList<Animal> getSpecAnimal() { return specAnimal; }

//    public void setSpecAnimal(ArrayList<Animal> specAnimal) { this.specAnimal = specAnimal; }

    public String getDiploma() { return diploma; }

    public void setDiploma(String diploma) { this.diploma = diploma; }
}
