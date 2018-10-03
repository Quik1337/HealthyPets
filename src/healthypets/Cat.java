package healthypets;

public final class Cat extends Animal {
    
    public Cat(String name,
               String species,
               String eats,
               int weight) {
        
        super(name, species, eats, weight);
    }
    
    public int getFoodPortion() {
        
        int catFoodPortion = this.getWeight() / 150;
        
        return catFoodPortion;
    }
}
