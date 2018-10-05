package healthypets;

public final class Snake extends Animal implements FoodPortion{
    
    public Snake(String name,
                 String species,
                 String eats,
                 int weight) {
        
        super(name, species, eats, weight);
    }
    
    public int getWeight() {
        
        return this.weight;
    }
    
    public int getFoodPortion() {
        
        return 20;
    }
}
