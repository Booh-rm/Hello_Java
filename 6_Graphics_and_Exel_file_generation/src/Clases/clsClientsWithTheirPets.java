package Clases;

public class clsClientsWithTheirPets {
    
    private String id_customer;
    private String name_customer;
    private String lastName_customer;
    private String address_customer;
    private String phone_customer;
    private String code_pet;
    private String name_pet;
    private int age_pet;
    private double weight_pet;
    private String species;
    
    //--------------------------------------------------------------------------

    public clsClientsWithTheirPets(String id_customer, String name_customer, String lastName_customer, String address_customer, String phone_customer, String code_pet, String name_pet, int age_pet, double weight_pet, String species) {
        this.id_customer = id_customer;
        this.name_customer = name_customer;
        this.lastName_customer = lastName_customer;
        this.address_customer = address_customer;
        this.phone_customer = phone_customer;
        this.code_pet = code_pet;
        this.name_pet = name_pet;
        this.age_pet = age_pet;
        this.weight_pet = weight_pet;
        this.species = species;
    }

    //--------------------------------------------------------------------------
    
    public String getId_customer() {
        return id_customer;
    }

    public void setId_customer(String id_customer) {
        this.id_customer = id_customer;
    }

    public String getName_customer() {
        return name_customer;
    }

    public void setName_customer(String name_customer) {
        this.name_customer = name_customer;
    }

    public String getLastName_customer() {
        return lastName_customer;
    }

    public void setLastName_customer(String lastName_customer) {
        this.lastName_customer = lastName_customer;
    }

    public String getAddress_customer() {
        return address_customer;
    }

    public void setAddress_customer(String address_customer) {
        this.address_customer = address_customer;
    }

    public String getPhone_customer() {
        return phone_customer;
    }

    public void setPhone_customer(String phone_customer) {
        this.phone_customer = phone_customer;
    }

    public String getCode_pet() {
        return code_pet;
    }

    public void setCode_pet(String code_pet) {
        this.code_pet = code_pet;
    }

    public String getName_pet() {
        return name_pet;
    }

    public void setName_pet(String name_pet) {
        this.name_pet = name_pet;
    }

    public int getAge_pet() {
        return age_pet;
    }

    public void setAge_pet(int age_pet) {
        this.age_pet = age_pet;
    }

    public double getWeight_pet() {
        return weight_pet;
    }

    public void setWeight_pet(double weight_pet) {
        this.weight_pet = weight_pet;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    
    //--------------------------------------------------------------------------
}
