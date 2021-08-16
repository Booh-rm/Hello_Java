package Clases;

public class clsChartPetsPlan {
    
    private String plan;
    private int amount;

    //--------------------------------------------------------------------------
    
    public clsChartPetsPlan(String plan, int amount) {
        this.plan = plan;
        this.amount = amount;
    }

    //--------------------------------------------------------------------------
    
    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    //--------------------------------------------------------------------------
}
