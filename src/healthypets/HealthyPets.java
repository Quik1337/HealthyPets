package healthypets;

import java.util.*;
import javax.swing.*;

public class HealthyPets {
    
    public HealthyPets() {
        
        List<Animal> animals = new ArrayList<>();
        
        Animal venus  = new Cat(  "Venus",  "Cat",   "Cat food", 5000);
        Animal ola    = new Cat(  "Ove",    "Cat",   "Cat food", 3000);
        Animal sixten = new Dog(  "Sixten", "Dog",   "Dog food", 5000);
        Animal dogge  = new Dog(  "Dogge",  "Dog",   "Dog food", 10000);
        Animal hypno  = new Snake("Hypno",  "Snake", "Snake pellet", 1000);
        
        animals.add(venus);
        animals.add(ola);
        animals.add(sixten);
        animals.add(dogge);
        animals.add(hypno);
        
        String animal = JOptionPane.showInputDialog("Which animal is getting fed?");
        
        animal = animal.substring(0, 1).toUpperCase() + animal.substring(1).toLowerCase();
        
        for (Animal a : animals) {
            
            if (a.getName().equals(animal))
                
                JOptionPane.showMessageDialog(null,
                    "The " + a.getSpecies() + " " + a.getName() + " should get " + a.getFoodPortion() + "grams of " + a.getEats());
        }
    }

    public static void main(String[] args) {
        
        HealthyPets pets = new HealthyPets(); 
    }
}