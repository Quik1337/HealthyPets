package healthypets;

//Sub-klasserna är final då det inte skapas fler sub-klasser till dessa.

//De extendar super-klassen så att de kan använda protected egenskaper och
//abstrakta metoder.

//De implementerar också ett interface vilket gör att de måste använda sig av
//den metod som står skriven där.
public final class Dog extends Animal implements FoodPortion {
    
    //Sub-klassen får sina egenskaper genom arv.
    public Dog(String name,
               String species,
               String eats,
               int weight) {
        
        super(name, species, eats, weight);
    }
    
    //Denna metod går att använda eftersom weight är protected i
    //super-klassen. (Inkapsling). *sätt till private för att visa inkapsling*
    public int getWeight() {
        
        return this.weight;
    }
    
    //Denna metod är abstrakt i super-klassen, vilket gör att när vi kallar
    //ett objekt i main-klassen med dess super-klass så kan denna implementeras
    //olika för de olika arterna. (Polymorphism)
    
    //Denna metod finns även i det interface som implementeras av sub-klasserna,
    //det gör att denna metod MÅSTE anvädas i var och en av de klasser som
    //implementerar interfacet.
    public int getFoodPortion() {
        
        int dogFoodPortion = this.getWeight() / 100;
        
        return dogFoodPortion;
    }
}
