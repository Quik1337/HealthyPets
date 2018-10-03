package healthypets;

public final class Snake extends Animal {
    
    public Snake(String name,
                 String species,
                 String eats,
                 int weight) {
        
        super(name, species, eats, weight);
    }
    
    public int getFoodPortion() {
        
        return 20;
    }
}
