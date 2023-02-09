package Unit5.PetCatDogLab;

import java.util.List;

public class Kennel {
    // instance variables
    private List<Pet> petList;

    // constructor
    public Kennel(List<Pet> list) {
        petList = list;
    }

    // setters and getters
    public List<Pet> getPetList() {
        return petList;
    }

    public void setPetList(List<Pet> petList) {
        this.petList = petList;
    }

    // other methods
    public void allSpeak() {
        for (int i = 0; i < petList.size(); i++) {
            System.out.println(petList.get(i).getName() + " says " + petList.get(i).speak());
        }
    }
}
