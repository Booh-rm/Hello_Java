package pharmacy;

/**
 *
 * @author Booh
 */
public class clsInjection {

    private String Medicine_Name;
    private String type;
    private String Amount_of_vials;
    private String Dosage; 
    
    public clsInjection(String Medicine_Name, String type, String Amount_of_vials, String Dosage) {
        this.Medicine_Name = Medicine_Name;
        this.type = type;
        this.Amount_of_vials = Amount_of_vials;
        this.Dosage = Dosage;
    }
    
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    public void show_information(){
        System.out.println(ANSI_BLUE +  "Injection: " + this.Medicine_Name + " " + this.type + ", " + this.Amount_of_vials + "Ml, " + this.Dosage + "." + ANSI_RESET);
    }

    public String getMedicine_Name() {
        return Medicine_Name;
    }

    public void setMedicine_Name(String Medicine_Name) {
        this.Medicine_Name = Medicine_Name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmount_of_vials() {
        return Amount_of_vials;
    }

    public void setAmount_of_vials(String Amount_of_vials) {
        this.Amount_of_vials = Amount_of_vials;
    }

    public String getDosage() {
        return Dosage;
    }

    public void setDosage(String Dosage) {
        this.Dosage = Dosage;
    }
   
    
}
