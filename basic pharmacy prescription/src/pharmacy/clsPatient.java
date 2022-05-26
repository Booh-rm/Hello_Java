package pharmacy;

/**
 *
 * @author Booh
 */
public class clsPatient {
    
    private String name;
    
    public clsPatient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    public void show_information(){    
        System.out.println(ANSI_BLUE +  "Patient: "+ this.name + ANSI_RESET);
        System.out.println("----------------------------------------------------------------------");   
    }

    public void setName(String name) {
        this.name = name;
    }
}
