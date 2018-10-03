package healthypets;

//hej

public abstract class Animal {
    
    private String name;
    private String species;
    private String eats;
    private int weight;
    
    public Animal() {}
    
    public Animal(String name, String species, String eats, int weight) {
        
        this.name = name;
        this.species = species;
        this.eats = eats;
        this.weight = weight;
    }
    
    public String getName() {
        
        return this.name;
    }
    
    public String getSpecies() {
        
        return this.species;
    }
    
    public String getEats() {
        
        return this.eats;
    }
    
    public int getWeight() {
        
        return this.weight;
    }
    
    abstract int getFoodPortion();
}
