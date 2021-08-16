package Clases;

public class clsChartPetsCustomer {
    
    private String idCustomer;
    private int amount;

    //--------------------------------------------------------------------------
    
    public clsChartPetsCustomer(String idCustomer, int amount) {
        this.idCustomer = idCustomer;
        this.amount = amount;
    }

    //--------------------------------------------------------------------------
    
    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    //--------------------------------------------------------------------------
}
