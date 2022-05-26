package pharmacy;

/**
 *
 * @author Booh
 */
public class clsLiquid {
    
    private String Medicine_Name;
    private String Is_Suspention;
    private String Amount;
    private String Dosage;
    
    public clsLiquid(String Medicine_Name, String Is_Suspention, String Amount, String Dosage) {
        this.Medicine_Name = Medicine_Name;
        this.Is_Suspention = Is_Suspention;
        this.Amount = Amount;
        this.Dosage = Dosage;
    }
    
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    public void show_information(){
        System.out.println(ANSI_BLUE +  "Liquid: " + this.Medicine_Name + " " + this.Is_Suspention + ", " + this.Amount + "Ml, " + this.Dosage + "." + ANSI_RESET);
    }

    public String getMedicine_Name() {
        return Medicine_Name;
    }

    public void setMedicine_Name(String Medicine_Name) {
        this.Medicine_Name = Medicine_Name;
    }

    public String getIs_Suspention() {
        return Is_Suspention;
    }

    public void setIs_Suspention(String Is_Suspention) {
        this.Is_Suspention = Is_Suspention;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    public String getDosage() {
        return Dosage;
    }

    public void setDosage(String Dosage) {
        this.Dosage = Dosage;
    }
    
    
    
}
