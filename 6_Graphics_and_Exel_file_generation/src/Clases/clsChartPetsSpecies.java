package Clases;

public class clsChartPetsSpecies {
    
    private String species;
    private int amount;
    
    //--------------------------------------------------------------------------
    
    public clsChartPetsSpecies(String species, int amount) {
        this.species = species;
        this.amount = amount;
    }

    //--------------------------------------------------------------------------
    
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    //--------------------------------------------------------------------------
}
