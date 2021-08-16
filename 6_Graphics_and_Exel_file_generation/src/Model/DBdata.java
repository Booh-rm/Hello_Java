package Model;

public class DBdata {
    
    private final String url;
    private final String user;
    private final String pass;

    //--------------------------------------------------------------------------
    
    public DBdata() {
        this.url = "jdbc:mysql://localhost:3306/yourpetdb";
        this.user = "root";
        this.pass = "";
    }

    //--------------------------------------------------------------------------

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }
    
    //--------------------------------------------------------------------------
}
