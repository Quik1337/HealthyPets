package healthypets;

public final class Dog extends Animal {
    
    public Dog(String name,
               String species,
               String eats,
               int weight) {
        
        super(name, species, eats, weight);
    }
    
    public int getFoodPortion() {
        
        int dogFoodPortion = this.getWeight() / 100;
        
        return dogFoodPortion;
    }
}
