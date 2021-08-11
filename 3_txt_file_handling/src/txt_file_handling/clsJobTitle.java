package txt_file_handling;


public class clsJobTitle {
    
    //---------------------------------------------------------------------------
    
    //Attributes:
    private String name;
    private String hierarchicalLevel;
    
    //---------------------------------------------------------------------------
    
    //Builder:
    public clsJobTitle(String name, String hierarchicalLevel) {
        this.name = name;
        this.hierarchicalLevel = hierarchicalLevel;
    }
    
    //---------------------------------------------------------------------------
    
    //Allows you to change the color of the text displayed in the console:
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    //---------------------------------------------------------------------------
    
    //Methods:
    public void displayInformation(){
        System.out.println(ANSI_BLUE +  "Job title of the administrative employee: "+ this.name + ANSI_RESET);
        System.out.println(ANSI_BLUE +  "Hierarchical level of the administrative employee: "+ this.hierarchicalLevel + ANSI_RESET);
    }
    
    public void displayInformationSub(){
        System.out.println(ANSI_BLUE +  "Job title of the subordinate employee: "+ this.name + ANSI_RESET);
        System.out.println(ANSI_BLUE +  "Hierarchical level of the subordinate employee: "+ this.hierarchicalLevel + ANSI_RESET);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHierarchicalLevel() {
        return hierarchicalLevel;
    }

    public void setHierarchicalLevel(String hierarchicalLevel) {
        this.hierarchicalLevel = hierarchicalLevel;
    }
    
    //---------------------------------------------------------------------------
}
