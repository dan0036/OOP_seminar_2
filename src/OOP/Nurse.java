package OOP;

import java.util.ArrayList;

class Nurse extends MedPersonnel{
    ArrayList<Animal> specAnimal;

    public ArrayList<Animal> getSpecAnimal() { return specAnimal; }

    public void setSpecAnimal(ArrayList<Animal> specAnimal) { this.specAnimal = specAnimal; }
}
