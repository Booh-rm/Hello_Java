package pharmacy;

/**
 *
 * @author Booh
 */
public class clsTablet {

    private String Medicine_Name;
    private String Weight;
    private String Amount_of_tables;
    private String Dosage;

    public clsTablet(String Medicine_Name, String Weight, String Amount_of_tables, String Dosage) {
        this.Medicine_Name = Medicine_Name;
        this.Weight = Weight;
        this.Amount_of_tables = Amount_of_tables;
        this.Dosage = Dosage;
    }
    
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    public void show_information(){
        System.out.println(ANSI_BLUE +  "Tablet: " + this.Medicine_Name + ", " + this.Weight + "Mg, " + this.Amount_of_tables + " pills, " + this.Dosage + "." + ANSI_RESET);
    }

    public String getMedicine_Name() {
        return Medicine_Name;
    }

    public void setMedicine_Name(String Medicine_Name) {
        this.Medicine_Name = Medicine_Name;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String Weight) {
        this.Weight = Weight;
    }

    public String getAmount_of_tables() {
        return Amount_of_tables;
    }

    public void setAmount_of_tables(String Amount_of_tables) {
        this.Amount_of_tables = Amount_of_tables;
    }

    public String getDosage() {
        return Dosage;
    }

    public void setDosage(String Dosage) {
        this.Dosage = Dosage;
    }
}
