package healthypets;

//Sätter klassen Animal som abstract då det inte skall skapas några objekt som
//endast är av typen Animal. (för inkapslingens skull).
//Också abstract så att kroppslösa abstrakta metoden ska gå att använda genom
//(polymorphism) i sub-klasserna.
public abstract class Animal {
    
    //Skapar och sätter egenskaper med en konstruktor för de djur som kommer
    //att skapas.
    //De är 3 första är private då de inte används i sub-klasserna,
    //men den 4e är protected eftersom den används i en metod i
    //sub-klasserna. (för inkapslingens skull)
    private String name;
    private String species;
    private String eats;
    protected int weight;
    
    public Animal(String name, String species, String eats, int weight) {
        
        this.name = name;
        this.species = species;
        this.eats = eats;
        this.weight = weight;
    }
    
    //Get-metoder.
    
    public String getName() {
        
        return this.name;
    }
    
    public String getSpecies() {
        
        return this.species;
    }
    
    public String getEats() {
        
        return this.eats;
    }
    
    //För att metoden ska gå att kalla i main-klassen gör jag denna till
    //abstrakt. När jag kallar ett objekt av super-klassen så kan jag
    //använda denna metod på vilken djurart som helst.
    //(Polymorphism)
    public abstract int getFoodPortion();
}
