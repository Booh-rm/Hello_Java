package Class;


public class clsCustomers {
    
    private String Id;
    private String name;
    private String lastName;
    private String address;
    private String phone;

    //--------------------------------------------------------------------------

    public clsCustomers(String Id, String name, String lastName, String address, String phone) {
        this.Id = Id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
    }

    //--------------------------------------------------------------------------
    
    public String ObtainCustomer() {
       return "Customer";
    }


    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
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
    
    //--------------------------------------------------------------------------
}
