package txt_file_handling;

import java.io.*;

public class Files {
    
    //---------------------------------------------------------------------------
    
    //---------------------------------------------------------------------------
    
    //Method to register a company in the companies.txt file:
    public void writeCompanies (clsCompanies newC){
        
        try{
            File f=new File("companies.txt");
            FileWriter fw;
            BufferedWriter bw;
            if(f.exists()&& f.length()!=0){
                fw=new FileWriter(f, true);
                bw= new BufferedWriter(fw);
                bw.newLine();
                bw.write(newC.getNameCom()+"▬"+newC.getNIT()+"▬"+newC.getAddress());
            }
            else{
                fw=new FileWriter(f);
                bw= new BufferedWriter(fw);
                bw.write(newC.getNameCom()+"▬"+newC.getNIT()+"▬"+newC.getAddress());
            }
            bw.close();
            fw.close();
        }
        catch(IOException e){
            System.out.println("Error: "+e);
        }
        
    }
    
    //Method to display the companies registered in the companies.txt file:
    public void showCompany(){
        
        try {
            File f=new File("companies.txt");
            if (f.exists()){
                FileReader fr= new FileReader (f);
                BufferedReader br= new BufferedReader(fr);
                String line;
                
                while((line = br.readLine()) != null){
                    String [] item = line.split("▬");
                    clsCompanies company = new clsCompanies(item[0],item[1],item[2],null);
                    company.read_company();
                    System.out.println("\n**************************************\n");
                } 
            }
            else{
                System.out.println("NO EXISTING COMPANY FILE");
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e);
        }
    }
    
    //Method to delete a company registered in the companies.txt file:
    public void removeCompany(String nitC) {
        
        try{
            File f =new File("companies.txt");
            if (f.exists()){
                FileReader fr= new FileReader (f);
                BufferedReader br= new BufferedReader(fr);
                String line;
                int numline=0;
                
                while((line=br.readLine()) !=null ){
                    numline++;
                }
                String companies []=new String[numline];
                br.close();
                fr.close();
                br = new BufferedReader(new FileReader(f));
                int i=0;
                
                while((line = br.readLine()) !=null){
                    companies[i]= line;
                    i++;
                }
                br.close();
                fr.close();
                
                FileWriter fw=new FileWriter(f);
                BufferedWriter bw=new BufferedWriter (fw);
                boolean flag=false;
                boolean ft= true;
                
                for(int j =0; j< companies.length; j++){
                   String l [] = companies[j].split("▬");
                   if(l[1].equals(nitC)){
                       flag=true;
                       System.out.println('\n' + "THE COMPANY WITH NIT HAS BEEN ELIMINATED: " + nitC + '\n');    
                    }
                    else if(ft==true){
                           bw.write(companies[j]);
                           ft=false;
                    }
                    else{
                        if(ft==true){
                            bw.write(companies[j]);
                            ft=false;
                       
                        }
                        else{ 
                           bw.newLine();
                           bw.write(companies[j]);
                       }
                   
                   }
               }
               bw.close();
               fw.close();
               if (numline==1 && flag==true){
                   f.delete();
               }
            }
            else{
                System.out.println("NO ITEMS TO REMOVE");
            }
        }
        catch(IOException e){
            System.out.println("error"+e);
        }
        
    }
    
    //Method to search for a registered company in the companies.txt file:
    public void searchCompany(String nitCompany){
        
        try {
            File f =new File ("companies.txt");
            if(f.exists()){
                FileReader fr= new FileReader (f);
                BufferedReader br= new BufferedReader(fr);
                boolean flag =false;
                String line;
                
                while((line =br.readLine()) !=null){
                    String item [] = line.split("▬");
                    if(item[1].equals(nitCompany)){
                        flag=true;
                        clsCompanies company = new clsCompanies(item[0],item[1],item[2],null); 
                        System.out.println("Found company:");
                        company.read_company();
                    }
                }
                if(flag==false){
                    System.out.println("COMPANY NOT FOUND");
                }
                
            }
            else{
                System.out.println("There is nothing to search for.");
            }
        }
        catch(IOException e){
        System.out.println("error"+e);}
        
    }
    
    //---------------------------------------------------------------------------
    
    
    //------------------------------------------------------------------------------------------------------------------------------------------------
    
    
    //---------------------------------------------------------------------------
    
    //Method to register an administrative employee in the Administrative_Employees.txt file:
    public void registerAdministrativeEmployees (clsSubordinateEmployees code, clsJobTitle jobTitle, clsAdministrativeEmployees newAE){
        
        try{
            File f=new File("administrative_employees.txt");
            FileWriter fw;
            BufferedWriter bw;
            if(f.exists()&& f.length()!=0){
                fw=new FileWriter(f, true);
                bw= new BufferedWriter(fw);
                bw.newLine();
                bw.write(newAE.getName()+"▬"+ newAE.getEmployee_salary()+"▬"+ newAE.getCategory()+"▬"+ 
                        newAE.getLastName()+"▬"+ newAE.getGender()+"▬"+ newAE.getId()+"▬"+ 
                        newAE.getEmail()+"▬"+ code.getCode()+"▬"+ jobTitle.getName()+"▬"+ 
                        jobTitle.getHierarchicalLevel()+"▬"+newAE.getCompanyBelonging());
            }
            else{
                fw=new FileWriter(f);
                bw= new BufferedWriter(fw);
                bw.write(newAE.getName()+"▬"+ newAE.getEmployee_salary()+"▬"+ newAE.getCategory()+"▬"+ 
                        newAE.getLastName()+"▬"+ newAE.getGender()+"▬"+ newAE.getId()+"▬"+ 
                        newAE.getEmail()+"▬"+ code.getCode()+"▬"+ jobTitle.getName()+"▬"+ 
                        jobTitle.getHierarchicalLevel()+"▬"+newAE.getCompanyBelonging());
            }
            bw.close();
            fw.close();
        }
        catch(IOException e){
            System.out.println("Error: "+e);
        }
        
    }
    
    //Method to display the administrative employees registered in the Administrative_Employees.txt file:
    public void ShowAdministrativeEmployees(){
        
        try {
            File f=new File("administrative_employees.txt");
            if (f.exists()){
                FileReader fr= new FileReader (f);
                BufferedReader br= new BufferedReader(fr);
                String line;
                
                while((line = br.readLine()) != null){
                    String [] item = line.split("▬");     
                    clsSubordinateEmployees subor = new clsSubordinateEmployees ( null,item[7], null, null, null, null, null, null,null);
                    clsJobTitle jobTitle = new clsJobTitle(item[8],item[9]);
                    clsAdministrativeEmployees Adempl = new clsAdministrativeEmployees(item[0],item[1],item[2],item[3],item[4],item[5],item[6],null,null,item[10]);
                
                    jobTitle.displayInformation();
                    Adempl.displayInformation();
                    subor.displayInformation();
                    
                    System.out.println("\n**************************************\n");
                } 
            }
            else{
                System.out.println("ADMINISTRATIVE EMPLOYEE FILE DOES NOT EXIST");
            }
        }
        catch(IOException e){
            System.out.println("Error: "+e);
        }
        
    }
    
    //Method to delete an administrative employee registered in the Administrative_Employees.txt file:
    public void removeAdmEmp(String IdE) {
        
        try{
            File f =new File("administrative_employees.txt");
            if (f.exists()){
                FileReader fr= new FileReader (f);
                BufferedReader br= new BufferedReader(fr);
                String line;
                int numlines=0;
                
                while((line=br.readLine()) !=null ){
                    numlines++;
                }
                String employee []=new String[numlines];
                br.close();
                fr.close();
                br = new BufferedReader(new FileReader(f));
                int i=0;
                
                while((line = br.readLine()) !=null){
                    employee[i]= line;
                    i++;
                }
                br.close();
                fr.close();
                
                FileWriter fw=new FileWriter(f);
                BufferedWriter bw=new BufferedWriter (fw);
                boolean flag=false;
                boolean ft= true;
               
                for(int j =0; j< employee.length; j++){
                   String l [] = employee[j].split("▬");
                    if(l[5].equals(IdE)){
                       flag=true;
                       System.out.println('\n' + "THE EMPLOYEE WITH ID HAS BEEN REMOVED: " + IdE + '\n');
                    }
                    else{
                        if(ft==true){
                            bw.write(employee[j]);
                            ft=false;
                        }
                        else{ 
                           bw.newLine();
                           bw.write(employee[j]);
                        }
                    }
                }
                
               bw.close();
               fw.close();
               if (numlines==1 && flag==true){
                   f.delete();
               }
            }
            else{
                System.out.println("NO ITEMS TO REMOVE");
            }
        }
        catch(IOException e){
            System.out.println("error"+e);
        }
        
    }
    
    //Method to search for an administrative employee registered in the Administrative_Employees.txt file:
    public void searchAdministrativeEmployee(String IdAdmEmp){
        
        try {
            File f =new File ("administrative_employees.txt");
            if(f.exists()){
                FileReader fr= new FileReader (f);
                BufferedReader br= new BufferedReader(fr);
                boolean flag =false;
                String line;
                
                while((line =br.readLine()) !=null){
                    String item [] = line.split("▬");
                    if(item[5].equals(IdAdmEmp)){
                        flag=true;
                        clsAdministrativeEmployees emp = new clsAdministrativeEmployees        
                        (item[0],item[1],item[2],item[3],item[4],item[5],item[6],null,null,item[10]); 
                        clsJobTitle jobTitle = new clsJobTitle(item[8],item[9]);
                        clsSubordinateEmployees subor = new clsSubordinateEmployees (null, item[7], null, null, null, null, null, null,null);
                        System.out.println("Found employee: " + '\n');
                        jobTitle.displayInformation();
                        emp.displayInformation();
                        subor.displayInformation();
                    }
                }
                if(flag==false){
                    System.out.println('\n' + "EMPLOYEE NOT FOUND");
                }
            }
            else {
                System.out.println("There is nothing to search for.");
            }
        }
        catch(IOException e){
        System.out.println("error"+e);
        }
        
    }
    
    //---------------------------------------------------------------------------
    
    
    //------------------------------------------------------------------------------------------------------------------------------------------------

    
    //---------------------------------------------------------------------------
    
    //Method to register a subordinate employee in the Subordinate_Employees.txt file:
    public void registerSubordinateEmployee (clsJobTitle jobTitle, clsSubordinateEmployees newSE){
        
        try{
            File f=new File("Employees_Subordinates.txt");
            FileWriter fw;
            BufferedWriter bw;
            if(f.exists()&& f.length()!=0){
                fw=new FileWriter(f, true);
                bw= new BufferedWriter(fw);
                bw.newLine();
                bw.write(newSE.getName()+"▬"+ newSE.getCode()+"▬"+newSE.getEmployee_salary()+"▬"+
                        newSE.getLastName()+"▬"+ newSE.getGender()+"▬"+ newSE.getId()+"▬"+ 
                        newSE.getEmail()+"▬"+jobTitle.getName()+"▬"+ 
                        jobTitle.getHierarchicalLevel()+"▬"+newSE.getCompanyBelonging());
            }
            else{
                fw=new FileWriter(f);
                bw= new BufferedWriter(fw);
                bw.write(newSE.getName()+"▬"+newSE.getCode()+"▬"+newSE.getEmployee_salary()+"▬"+ 
                        newSE.getLastName()+"▬"+ newSE.getGender()+"▬"+ newSE.getId()+"▬"+ 
                        newSE.getEmail()+"▬"+jobTitle.getName()+"▬"+ 
                        jobTitle.getHierarchicalLevel()+"▬"+newSE.getCompanyBelonging());
            }
            bw.close();
            fw.close();
        }
        catch(IOException e){
            System.out.println("Error: "+e);
        }
        
    }
    
    //Method to display the subordinate employees registered in the Employees_Subordinates.txt file:
    public void showSubordinateEmployees(){
        
        try {
            File f=new File("Employees_Subordinates.txt");
            if (f.exists()){
                FileReader fr= new FileReader (f);
                BufferedReader br= new BufferedReader(fr);
                String line;
                
                while((line = br.readLine()) != null){
                    String [] item = line.split("▬");
                    clsSubordinateEmployees subor = new clsSubordinateEmployees(item[0], item[1],item[2],item[3],item[4],item[5],item[6],null,item[9]);                
                    clsJobTitle jobTitle = new clsJobTitle(item[7],item[8]);
                    jobTitle.displayInformationSub();
                    subor.mostrar_informacion_Sub();

                    System.out.println("\n**************************************\n");
                } 
            }
            else{
                System.out.println("SUBORDINATE EMPLOYEE FILE DOES NOT EXIST");
            }
        }
        catch(IOException e){
            System.out.println("Error: "+e);
        }
        
    }
    
    //Method to delete a subordinate employee registered in the Employees_Subordinates.txt file:
    public void removeSubEmp(String IdE) {
         
        try{
            File f =new File("Employees_Subordinates.txt");
            if (f.exists()){
                FileReader fr= new FileReader (f);
                BufferedReader br= new BufferedReader(fr);
                String line;
                int numlines=0;
                
                while((line=br.readLine()) !=null ){
                    numlines++;
                }

                String employee []=new String[numlines];
                br.close();
                fr.close();
                br = new BufferedReader(new FileReader(f));
                int i=0;
                
                while((line = br.readLine()) !=null){
                    employee[i]= line;
                    i++;
                }
                br.close();
                fr.close();
                
                FileWriter fw=new FileWriter(f);
                BufferedWriter bw=new BufferedWriter (fw);
                boolean flag=false;
                boolean ft= true;
                
                for(int j =0; j< employee.length; j++){
                    String l [] = employee[j].split("▬");
                    if(l[5].equals(IdE)){
                        flag=true;
                        System.out.println('\n' + "THE EMPLOYEE WITH ID HAS BEEN REMOVED: " + IdE + '\n');
                    }
                    else{
                        if(ft==true){
                        bw.write(employee[j]);
                        ft=false;
                        }
                        else{ 
                            bw.newLine();
                            bw.write(employee[j]);
                        }
                    }
                }
                
                bw.close();
                fw.close();
                if (numlines==1 && flag==true){
                    f.delete();
                }
            }
            else{
                System.out.println("NO ITEMS TO REMOVE");
            }
        }
        catch(IOException e){
            System.out.println("error"+e);
        }
        
    }
    
    //Method to search for a subordinate employee registered in the Employees_Subordinates.txt file:
    public void  searchSubordinateEmployee(String IdSubEmp){
        
        try {
            File f =new File ("Employees_Subordinates.txt");
            if(f.exists()){
                FileReader fr= new FileReader (f);
                BufferedReader br= new BufferedReader(fr);
                boolean flag =false;
                String line;
                
                while((line =br.readLine()) !=null){
                    String item [] = line.split("▬");
                    if(item[5].equals(IdSubEmp)){
                        flag=true;
                        clsJobTitle jobTitle = new clsJobTitle(item[7],item[8]);
                        clsSubordinateEmployees subor = new clsSubordinateEmployees(item[0], item[1],item[2],item[3],item[4],item[5],item[6],null,item[9]);
                        System.out.println("Found employee: " + '\n');
                        jobTitle.displayInformationSub();
                        subor.mostrar_informacion_Sub();
                    }
                }
                if(flag==false){
                    System.out.println('\n' + "EMPLOYEE NOT FOUND");
                }
            }
            else{
                System.out.println("There is nothing to search for.");
            }
        }
        catch(IOException e){
            System.out.println("error"+e);
        }
        
    }
    
    
    
    //---------------------------------------------------------------------------
    
    
    //------------------------------------------------------------------------------------------------------------------------------------------------
  
    
    //---------------------------------------------------------------------------
    
    //Method to register a customer in the customers.txt file:
    public void registerCustomers(clsCustomers newCustomer){
        
        try{
            File f=new File("customers.txt");
            FileWriter fw;
            BufferedWriter bw;
            if(f.exists()&& f.length()!=0){
                fw=new FileWriter(f, true);
                bw= new BufferedWriter(fw);
                bw.newLine();
                bw.write(newCustomer.getName()+"▬"+newCustomer.getAddress()+"▬"+newCustomer.getPhone()+"▬"+
                newCustomer.getLastName()+"▬"+newCustomer.getGender()+"▬"+newCustomer.getId()+"▬"+newCustomer.getEmail()+"▬"+newCustomer.getCompanyBelonging());
            }
            else{
                fw=new FileWriter(f);
                bw= new BufferedWriter(fw);
                bw.write(newCustomer.getName()+"▬"+newCustomer.getAddress()+"▬"+newCustomer.getPhone()+"▬"+
                newCustomer.getLastName()+"▬"+newCustomer.getGender()+"▬"+newCustomer.getId()+"▬"+newCustomer.getEmail()+"▬"+newCustomer.getCompanyBelonging());
            }
            
            bw.close();
            fw.close();
        }
        catch(IOException e){
            System.out.println("Error: "+e);
        }
    }

    //Method to show the clients registered in the customers.txt file:    
    public void showCustomers(){
        
        try {
            File f=new File("customers.txt");
            if (f.exists()){
                FileReader fr= new FileReader (f);
                BufferedReader br= new BufferedReader(fr);
                String line;
                
                while((line = br.readLine()) != null){
                    String [] item = line.split("▬");
                    clsCustomers customers = new clsCustomers(item[0],item[1],item[2],item[3],item[4],item[5],item[6],item[7]);
                    customers.displayInformation();
                    System.out.println("\n**************************************\n");
                } 
            }
            else{
                System.out.println("CUSTOMERS FILE DOES NOT EXIST");
            }
        }
        catch(IOException e){
            System.out.println("Error: "+e);
        }
        
    }
    
    //Method to delete a customer registered in the customers.txt file:
    public void removeCustomer(String IdCustomer) {
        
        try{
            File f =new File("customers.txt");
            if (f.exists()){
                FileReader fr= new FileReader (f);
                BufferedReader br= new BufferedReader(fr);
                String line;
                int numlines=0;
                
                while((line=br.readLine()) !=null ){
                    numlines++;
                }
                
                String customers []=new String[numlines];
                br.close();
                fr.close();
                br = new BufferedReader(new FileReader(f));
                int i=0;
                
                while((line = br.readLine()) !=null){
                    customers[i]= line;
                    i++;
                }
                
                br.close();
                fr.close();
                
                FileWriter fw=new FileWriter(f);
                BufferedWriter bw=new BufferedWriter (fw);
                boolean flag=false;
                boolean ft= true;
                
                for(int j =0; j< customers.length; j++){
                    String l [] = customers[j].split("▬");
                    if(l[5].equals(IdCustomer)){
                        flag=true;
                        System.out.println('\n' + "THE CUSTOMER WITH ID HAS BEEN DELETED: " + IdCustomer + '\n');    
                    }    
                    else 
                        if(ft==true){
                            bw.write(customers[j]);
                            ft=false;
                        }
                        else{
                            if(ft==true){
                                bw.write(customers[j]);
                                ft=false;
                            }
                            else{ 
                                bw.newLine();
                                bw.write(customers[j]);
                            }
                        }
                }
                
                bw.close();
                fw.close();
                if (numlines==1 && flag==true){
                    f.delete();
                }
            }
            else{
            System.out.println("NO ITEMS TO REMOVE");
            }
        }
        catch(IOException e){
            System.out.println("error"+e);
        }
        
    }
    
    //Method to search for a registered customer in the customers.txt file:
    public void searchCustomers (String IdCustomer){
        
        try {
            File f =new File ("customers.txt");
            if(f.exists()){
                FileReader fr= new FileReader (f);
                BufferedReader br= new BufferedReader(fr);
                boolean flag =false;
                String line;
                
                while((line =br.readLine()) !=null){
                    String item [] = line.split("▬");
                    if(item[5].equals(IdCustomer)){
                        flag=true;
                        clsCustomers customers = new clsCustomers(item[0],item[1],item[2],item[3],item[4],item[5],item[6],item[7]);
                        System.out.println("Found customer: " + '\n');
                        customers.displayInformation();
                    }
                }
                if(flag==false){
                    System.out.println("CUSTOMER NOT FOUND: " + '\n');
                }
            }
            else {
                System.out.println("There is nothing to search for.");
            }
        }
        catch(IOException e){
        System.out.println("error"+e);
        }
        
    }
    //---------------------------------------------------------------------------
}
