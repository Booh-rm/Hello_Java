package txt_file_handling;

public class clsCompanies {
    
    //---------------------------------------------------------------------------
    
    //Attributes:
    private String nameCom;
    private String NIT;
    private String address;
    private clsEmployees employees;
    private clsCustomers customers;
    
    //---------------------------------------------------------------------------
    
    //Builder:
    public clsCompanies(String nameCom, String NIT, String address, clsEmployees employees) {
        this.nameCom = nameCom;
        this.NIT = NIT;
        this.address = address;
        this.employees = employees;
    }
    
    //---------------------------------------------------------------------------

    //Allows you to change the color of the text displayed in the console:
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    //Methods:
    public void read_company(){
        
        System.out.println("");
        System.out.println(ANSI_BLUE +  "Company name: "+ getNameCom() + ANSI_RESET);
        System.out.println(ANSI_BLUE +  "NIT of the company: "+ getNIT() + ANSI_RESET);
        System.out.println(ANSI_BLUE +  "Address of the company: " + getAddress() + ANSI_RESET);
        
    }
    
    //---------------------------------------------------------------------------

    public String getNameCom() {
        return nameCom;
    }

    public void setNameCom(String nameCom) {
        this.nameCom = nameCom;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getAddress() {
        return address;
    }

    public void setÁddress(String áddress) {
        this.address = áddress;
    }

    public clsEmployees getEmployees() {
        return employees;
    }

    public void setEmployees(clsEmployees employees) {
        this.employees = employees;
    }

    public clsCustomers getCustomers() {
        return customers;
    }

    public void setCustomers(clsCustomers customers) {
        this.customers = customers;
    }
    
}
