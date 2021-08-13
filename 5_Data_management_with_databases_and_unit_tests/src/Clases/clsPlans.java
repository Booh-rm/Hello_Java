package Clases;


public class clsPlans{
    
    private int idPlan;
    private String codePlan;
    private String namePlan;
    private String description;
    private int price;

    //--------------------------------------------------------------------------

    public clsPlans(int idPlan, String codePlan, String namePlan, String description, int price) {
        this.idPlan = idPlan;
        this.codePlan = codePlan;
        this.namePlan = namePlan;
        this.description = description;
        this.price = price;
    }
    
    //--------------------------------------------------------------------------

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public String getCodePlan() {
        return codePlan;
    }

    public void setCodePlan(String codePlan) {
        this.codePlan = codePlan;
    }

    public String getNamePlan() {
        return namePlan;
    }

    public void setNamePlan(String namePlan) {
        this.namePlan = namePlan;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    //--------------------------------------------------------------------------
}
