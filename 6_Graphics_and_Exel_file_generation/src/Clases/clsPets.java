package Clases;

public class clsPets {
    
    private int idPet;
    private String code;
    private String name;
    private int age;
    private double weight;
    private String species;
    
    //--------------------------------------------------------------------------

    public clsPets(int idPet, String code, String name, int age, double weight, String species) {
        this.idPet = idPet;
        this.code = code;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }
    
    //--------------------------------------------------------------------------

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    
    //--------------------------------------------------------------------------
}
