package healthypets;

import java.util.*;
import javax.swing.*;

public class HealthyPets {
    
    public HealthyPets() {
        
        //Skapar en lista, skapar djur, lägger in dessa djur i listan.
        
        List<Animal> animals = new ArrayList<>();
        
        Animal venus  = new Cat(  "Venus",  "Cat",   "cat food",     5000);
        Animal ola    = new Cat(  "Ola",    "Cat",   "cat food",     3000);
        Animal sixten = new Dog(  "Sixten", "Dog",   "dog food",     5000);
        Animal dogge  = new Dog(  "Dogge",  "Dog",   "dog food",     10000);
        Animal hypno  = new Snake("Hypno",  "Snake", "snake pellet", 1000);
        
        animals.add(venus);
        animals.add(ola);
        animals.add(sixten);
        animals.add(dogge);
        animals.add(hypno);
        
        //Lägger alla djuren i en string där varje rad i stringen är ett djur
        //med art och namn.
        String s = "";
        
        for (Animal a : animals) {
            
            s = s + "The " + a.getSpecies() + " " + a.getName() + "\n";
        }
        
        //Tar in användar-input.
        String animal = JOptionPane.showInputDialog(
            "Which animal is getting fed?");
        
        //En while-sats som går tills användaren skriver in ett djurs namn.
        boolean flag = true;
        
        while(flag) {
            
            //Modifierar användar-input för att se till att matchar djurets namn. 
            animal = animal.substring(0, 1).toUpperCase() +
                     animal.substring(1).toLowerCase();
            
            //Går igenom hela listan med djur och ser och användar-input
            //överensstämmer med något djurs namn, om det gör det
            //sätts flag till false och while-satsen avslutas.
            for (Animal a : animals) {
            
                if (a.getName().equals(animal)) {

                    JOptionPane.showMessageDialog(null,
                        "The " + a.getSpecies() + " " + a.getName() + 
                        " should get " + a.getFoodPortion() + " grams of " + a.getEats());
                    
                    flag = false;
                }
            }
            
            //Om användar-input inte överensstämde med något djurs namn
            //(flag fortfarande true) så skrivs stringen s ut med alla djuren
            //och användaren ombeds försöka skriva in ett djurs namn igen.
            if(flag) { 
                
                animal = JOptionPane.showInputDialog(
                    "These animals are staying at HealthyPets: \n\n" + s + "\n" +
                    "You have to write the name of an animal that stays at HealthyPets");
            }
        }
    }

    public static void main(String[] args) {
        
        HealthyPets pets = new HealthyPets(); 
    }
}