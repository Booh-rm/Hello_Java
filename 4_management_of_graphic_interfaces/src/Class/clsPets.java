package Class;

public class clsPets {
    
    private String code;
    private String name;
    private int age;
    private double weight;
    private String specie;
    private clsPlans plans;
    private clsCustomers customer;

    //--------------------------------------------------------------------------
    
    public clsPets(String code, String name, int age, double weight, String specie, clsPlans plans, clsCustomers customer) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.specie = specie;
        this.plans = plans;
        this.customer = customer;
    }
    
    //--------------------------------------------------------------------------
    
    public String obtainPet() {
       return "Pet";
    }
    
    //--------------------------------------------------------------------------

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

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    //--------------------------------------------------------------------------
    
    public clsPlans getPlans() {
        return plans;
    }

    public void setPlans(clsPlans plans) {
        this.plans = plans;
    }

    //--------------------------------------------------------------------------
    
    public clsCustomers getCustomer() {
        return customer;
    }

    public void setCustomer(clsCustomers customer) {
        this.customer = customer;
    }
    
    //--------------------------------------------------------------------------
}
