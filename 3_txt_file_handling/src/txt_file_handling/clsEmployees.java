package txt_file_handling;

public class clsEmployees extends clsPersons{
    
    //---------------------------------------------------------------------------
    
    //Attributes:
    private String employee_salary;
    private String companyBelonging;
    private clsJobTitle JobTitle;
    
    //---------------------------------------------------------------------------
    
    //Builder:
    public clsEmployees(String employee_salary, clsJobTitle JobTitle, String name, String lastName, String gender, String id, String email, String companyBelonging) {
        super(name, lastName, gender, id, email);
        this.employee_salary = employee_salary;
        this.companyBelonging = companyBelonging;
        this.JobTitle = JobTitle;
    }
    
    //---------------------------------------------------------------------------
    
    //Methods:  
    public void watch_employee(){
    }

    //---------------------------------------------------------------------------

    public String getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(String employee_salary) {
        this.employee_salary = employee_salary;
    }

    public String getCompanyBelonging() {
        return companyBelonging;
    }

    public void setCompanyBelonging(String companyBelonging) {
        this.companyBelonging = companyBelonging;
    }

    public clsJobTitle getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(clsJobTitle JobTitle) {
        this.JobTitle = JobTitle;
    }
    
    //---------------------------------------------------------------------------
}
