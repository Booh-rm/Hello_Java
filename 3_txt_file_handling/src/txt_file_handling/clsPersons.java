package txt_file_handling;

public class clsPersons {
    
    //---------------------------------------------------------------------------
    
    //Attributes:
    private String name;
    private String lastName;
    private String gender;
    private String id;
    private String email;

    //---------------------------------------------------------------------------
    
    //Builder:
    public clsPersons(String name, String lastName, String gender, String id, String email) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.id = id;
        this.email = email;
    }
 
    //---------------------------------------------------------------------------

    //Methods:
    public void displayInformation(){
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //---------------------------------------------------------------------------
}
