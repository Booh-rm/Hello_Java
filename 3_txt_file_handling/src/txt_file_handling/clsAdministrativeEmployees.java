package txt_file_handling;

public class clsAdministrativeEmployees extends clsEmployees{
    
    //---------------------------------------------------------------------------
    
    //Attributes:
    private String category;
    private clsSubordinateEmployees SubordinatesEmp;

    //---------------------------------------------------------------------------
    
    //Builder:
    public clsAdministrativeEmployees(String name, String category, String employee_salary,String lastName, String gender, String id,  String email, clsSubordinateEmployees SubordinatesEmp,  clsJobTitle JobTitle, String companyBelonging) {
        super(employee_salary, JobTitle, name, lastName, gender, id, email, companyBelonging);
        this.category = category;
        this.SubordinatesEmp = SubordinatesEmp;
    }
    
    
    
    //---------------------------------------------------------------------------

    //Allows you to change the color of the text displayed in the console:
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    //Methods:
    @Override
    public void displayInformation(){
    
        System.out.println(ANSI_BLUE +  "Category Administrative employee: "+ this.category + ANSI_RESET);
        System.out.println(ANSI_BLUE +  "Salary Administrative employee: " + super.getEmployee_salary()+ ANSI_RESET);
        System.out.println(ANSI_BLUE +  "Name Administrative employee: "+ super.getName()+ ANSI_RESET);
        System.out.println(ANSI_BLUE +  "Last name Administrative employee: " + super.getLastName()+ ANSI_RESET);
        System.out.println(ANSI_BLUE +  "Gender Administrative employee: "+ super.getGender()+ ANSI_RESET);
        System.out.println(ANSI_BLUE +  "Administrative Employee ID Number: "+ super.getId()+ ANSI_RESET);
        System.out.println(ANSI_BLUE +  "E-mail Administrative Employee: " + super.getEmail()+ ANSI_RESET);
        System.out.println(ANSI_BLUE +  "The administrative employee belongs to the company with tax identification number NIT: " + super.getCompanyBelonging()+ ANSI_RESET);
    }

    //---------------------------------------------------------------------------

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public clsSubordinateEmployees getSubordinatesEmp() {
        return SubordinatesEmp;
    }

    public void setSubordinatesEmp(clsSubordinateEmployees SubordinatesEmp) {
        this.SubordinatesEmp = SubordinatesEmp;
    }
    
    
}
