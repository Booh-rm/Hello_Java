package txt_file_handling;

public class clsCustomers extends clsPersons{
        
    //---------------------------------------------------------------------------
    
    //Attributes:
    private String address;
    private String phone;
    private String companyBelonging;
    
    //---------------------------------------------------------------------------
    
    //Builder:
    public clsCustomers(String name, String address, String phone, String lastName, String gender, String id, String email, String companyBelonging) {
        super(name, lastName, gender, id, email);
        this.address = address;
        this.phone = phone;
        this.companyBelonging = companyBelonging;
    }
    
    //---------------------------------------------------------------------------
    
    //Allows you to change the color of the text displayed in the console:
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    //---------------------------------------------------------------------------
    
    //methods:
    @Override
    public void displayInformation(){
        
        System.out.println(ANSI_BLUE +  "The customer's name is: "+ super.getName()+ ANSI_RESET);
        System.out.println(ANSI_BLUE +  "The customer's last name is: " + super.getLastName()+ ANSI_RESET);
        System.out.println(ANSI_BLUE +  "The customer ID number is: "+ super.getId()+ ANSI_RESET);
        System.out.println(ANSI_BLUE +  "The customer's gender is: " + super.getGender()+ ANSI_RESET);
        System.out.println(ANSI_BLUE +  "The customer's e-mail address is: "+ super.getEmail()+ ANSI_RESET);
        System.out.println(ANSI_BLUE +  "The customer's correspondence address is: "+ this.address + ANSI_RESET);
        System.out.println(ANSI_BLUE +  "The customer's phone number is: " + this.phone + ANSI_RESET);
        System.out.println(ANSI_BLUE +  "The customer belongs to the company with NIT: " + this.companyBelonging + ANSI_RESET);
        
    }
    
    //---------------------------------------------------------------------------

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompanyBelonging() {
        return companyBelonging;
    }

    public void setCompanyBelonging(String companyBelonging) {
        this.companyBelonging = companyBelonging;
    }
    
    //---------------------------------------------------------------------------
}
