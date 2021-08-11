package txt_file_handling;

public class clsSubordinateEmployees extends clsEmployees{
    
    //---------------------------------------------------------------------------
    
    //Attributes:
    private String code;

    //---------------------------------------------------------------------------
    
    //Builder:
    public clsSubordinateEmployees(String name, String code, String employee_salary, String lastName, String gender, String id, String email, clsJobTitle JobTitle, String companyBelonging) {
        super(employee_salary, JobTitle, name, lastName, gender, id, email, companyBelonging);
        this.code = code;
    }

    //---------------------------------------------------------------------------
    
    //Allows you to change the color of the text displayed in the console:
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    //Methods:
    @Override
    public void displayInformation(){
        System.out.println(ANSI_BLUE +  "Code of subordinate employees in charge of Administrative employee: "+ this.getCode()+ ANSI_RESET);
    }
    
    public void mostrar_informacion_Sub(){
        System.out.println(ANSI_BLUE +  "Code of subordinate employees to which it belongs: "+ this.getCode()+ ANSI_RESET);
        System.out.println(ANSI_BLUE +  "Salary Subordinate employee: " + super.getEmployee_salary()+ ANSI_RESET);
        System.out.println(ANSI_BLUE +  "Name Subordinate employee: "+ super.getName()+ ANSI_RESET);
        System.out.println(ANSI_BLUE +  "Last name Subordinate employee: " + super.getLastName()+ ANSI_RESET);
        System.out.println(ANSI_BLUE +  "Gender Subordinate employee: "+ super.getGender()+ ANSI_RESET);
        System.out.println(ANSI_BLUE +  "Subordinate Employee ID number: "+ super.getId()+ ANSI_RESET);
        System.out.println(ANSI_BLUE +  "E-mail Subordinate Employee: " + super.getEmail()+ ANSI_RESET);
        System.out.println(ANSI_BLUE +  "The subordinate employee belongs to the company with tax identification number NIT: " + super.getCompanyBelonging()+ ANSI_RESET);
    }

    //---------------------------------------------------------------------------

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    //---------------------------------------------------------------------------
}
