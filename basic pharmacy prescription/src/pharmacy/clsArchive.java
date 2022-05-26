package pharmacy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Booh
 */
public class clsArchive {
    
    //--------------------------------------------------------------------------
    
    public void writePatient(clsPatient newp){
        
        try{
            File f=new File("Patient.txt");
            FileWriter fw;
            BufferedWriter bw;
            if(f.exists()&& f.length()!=0){
                fw=new FileWriter(f, true);
                bw= new BufferedWriter(fw);
                bw.newLine();
                bw.write(newp.getName());
            }
            else{
                fw=new FileWriter(f);
                bw= new BufferedWriter(fw);
                bw.write(newp.getName());
            }
            
            bw.close();
            fw.close();
        }
        catch(IOException e){
            System.out.println("Error: "+e);
        }
    }
   
    public void readPatient(){
        
        try {
            File f=new File("Patient.txt");
            if (f.exists()){
                FileReader fr= new FileReader (f);
                BufferedReader br= new BufferedReader(fr);
                String line;
                
                while((line = br.readLine()) != null){
                    String [] separator = line.split("▬");
                    clsPatient Patient = new clsPatient(separator[0]);
                    Patient.show_information();
                } 
            }
            else{
                System.out.println("");
            }
        }
        catch(IOException e){
            System.out.println("Error: "+e);
        }
        
    }
    
    //--------------------------------------------------------------------------

    public void writeTablet(clsTablet newt){
        
        try{
            File f=new File("Tablet.txt");
            FileWriter fw;
            BufferedWriter bw;
            if(f.exists()&& f.length()!=0){
                fw=new FileWriter(f, true);
                bw= new BufferedWriter(fw);
                bw.newLine();
                bw.write(newt.getMedicine_Name()+"▬"+newt.getWeight()+"▬"+newt.getAmount_of_tables()+"▬"+newt.getDosage());
            }
            else{
                fw=new FileWriter(f);
                bw= new BufferedWriter(fw);
                bw.write(newt.getMedicine_Name()+"▬"+newt.getWeight()+"▬"+newt.getAmount_of_tables()+"▬"+newt.getDosage());
            }
            
            bw.close();
            fw.close();
        }
        catch(IOException e){
            System.out.println("Error: "+e);
        }
    }
  
    public void readTablet(){
        
        try {
            File f=new File("Tablet.txt");
            if (f.exists()){
                FileReader fr= new FileReader (f);
                BufferedReader br= new BufferedReader(fr);
                String line;
                
                while((line = br.readLine()) != null){
                    String [] separator = line.split("▬");
                    clsTablet tablet = new clsTablet(separator[0],separator[1],separator[2],separator[3]);
                    tablet.show_information(); 
                } 
            }
            else{
                System.out.println("");
            }
        }
        catch(IOException e){
            System.out.println("Error: "+e);
        }
    }
    
    //--------------------------------------------------------------------------

    public void writeLiquid(clsLiquid newl){
        
        try{
            File f=new File("Liquid.txt");
            FileWriter fw;
            BufferedWriter bw;
            if(f.exists()&& f.length()!=0){
                fw=new FileWriter(f, true);
                bw= new BufferedWriter(fw);
                bw.newLine();
                bw.write(newl.getMedicine_Name()+"▬"+newl.getIs_Suspention()+"▬"+newl.getAmount()+"▬"+newl.getDosage());
            }
            else{
                fw=new FileWriter(f);
                bw= new BufferedWriter(fw);
                bw.write(newl.getMedicine_Name()+"▬"+newl.getIs_Suspention()+"▬"+newl.getAmount()+"▬"+newl.getDosage());
            }
            
            bw.close();
            fw.close();
        }
        catch(IOException e){
            System.out.println("Error: "+e);
        }
    }
   
    public void readLiquid(){
        
        try {
            File f=new File("Liquid.txt");
            if (f.exists()){
                FileReader fr= new FileReader (f);
                BufferedReader br= new BufferedReader(fr);
                String line;
                
                while((line = br.readLine()) != null){
                    String [] separator = line.split("▬");
                    clsLiquid liquid = new clsLiquid(separator[0],separator[1],separator[2],separator[3]);
                    liquid.show_information();
                } 
            }
            else{
                System.out.println("");
            }
        }
        catch(IOException e){
            System.out.println("Error: "+e);
        }  
    }
    
    //--------------------------------------------------------------------------
    
    public void writeInjection(clsInjection newi){
        
        try{
            File f=new File("Injection.txt");
            FileWriter fw;
            BufferedWriter bw;
            if(f.exists()&& f.length()!=0){
                fw=new FileWriter(f, true);
                bw= new BufferedWriter(fw);
                bw.newLine();
                bw.write(newi.getMedicine_Name()+"▬"+newi.getType()+"▬"+newi.getAmount_of_vials()+"▬"+newi.getDosage());
            }
            else{
                fw=new FileWriter(f);
                bw= new BufferedWriter(fw);
                bw.write(newi.getMedicine_Name()+"▬"+newi.getType()+"▬"+newi.getAmount_of_vials()+"▬"+newi.getDosage());
            }
            
            bw.close();
            fw.close();
        }
        catch(IOException e){
            System.out.println("Error: "+e);
        }
    }
   
    public void readInjection(){
        
        try {
            File f=new File("Injection.txt");
            if (f.exists()){
                FileReader fr= new FileReader (f);
                BufferedReader br= new BufferedReader(fr);
                String line;
                
                while((line = br.readLine()) != null){
                    String [] separator = line.split("▬");
                    clsInjection injection = new clsInjection(separator[0],separator[1],separator[2],separator[3]);
                    injection.show_information();
                } 
            }
            else{
                System.out.println("");
            }
        }
        catch(IOException e){
            System.out.println("Error: "+e);
        }
    }
    
    //--------------------------------------------------------------------------
    
    public void deleteP() {
        
        try{
            File f =new File("Patient.txt");
            if (f.exists()){
                FileReader fr= new FileReader (f);
                BufferedReader br= new BufferedReader(fr);
                String line;
                int numlines=0;
                
                while((line=br.readLine()) !=null ){
                    numlines++;
                }
                String patient []=new String[numlines];
                br.close();
                fr.close();
                br = new BufferedReader(new FileReader(f));
                int i=0;
                
                while((line = br.readLine()) !=null){
                    patient[i]= line;
                    i++;
                }
                br.close();
                fr.close();
                
                FileWriter fw=new FileWriter(f);
                BufferedWriter bw=new BufferedWriter (fw);
                boolean flag=true;
                
                for(int j =0; j< patient.length; j++){
                   String l [] = patient[j].split("▬");
               }
               bw.close();
               fw.close();
               if (numlines==1 && flag==true){
                   f.delete();
               }
            }
        }
        catch(IOException e){
            System.out.println("error"+e);
        }
    }
    
    //--------------------------------------------------------------------------
    
    public void deleteT() {
        
        try{
            File f =new File("Tablet.txt");
            if (f.exists()){
                FileReader fr= new FileReader (f);
                BufferedReader br= new BufferedReader(fr);
                String line;
                int numlines=0;
                
                while((line=br.readLine()) !=null ){
                    numlines++;
                }
                String tablet []=new String[numlines];
                br.close();
                fr.close();
                br = new BufferedReader(new FileReader(f));
                int i=0;
                
                while((line = br.readLine()) !=null){
                    tablet[i]= line;
                    i++;
                }
                br.close();
                fr.close();
                
                FileWriter fw=new FileWriter(f);
                BufferedWriter bw=new BufferedWriter (fw);
                boolean flag=true;
                
                for(int j =0; j< tablet.length; j++){
                   String l [] = tablet[j].split("▬");
               }
               bw.close();
               fw.close();
               if (numlines==1 && flag==true){
                   f.delete();
               }
            }
        }
        catch(IOException e){
            System.out.println("error"+e);
        }
    }
    
    //--------------------------------------------------------------------------
    
    public void deleteL() {
        
        try{
            File f =new File("Liquid.txt");
            if (f.exists()){
                FileReader fr= new FileReader (f);
                BufferedReader br= new BufferedReader(fr);
                String line;
                int numlines=0;
                
                while((line=br.readLine()) !=null ){
                    numlines++;
                }
                String liquid []=new String[numlines];
                br.close();
                fr.close();
                br = new BufferedReader(new FileReader(f));
                int i=0;
                
                while((line = br.readLine()) !=null){
                    liquid[i]= line;
                    i++;
                }
                br.close();
                fr.close();
                
                FileWriter fw=new FileWriter(f);
                BufferedWriter bw=new BufferedWriter (fw);
                boolean flag=true;
                
                for(int j =0; j< liquid.length; j++){
                   String l [] = liquid[j].split("▬");
               }
               bw.close();
               fw.close();
               if (numlines==1 && flag==true){
                   f.delete();
               }
            }
        }
        catch(IOException e){
            System.out.println("error"+e);
        }
    }
    
    //--------------------------------------------------------------------------
    
    public void deleteI() {
        
        try{
            File f =new File("Injection.txt");
            if (f.exists()){
                FileReader fr= new FileReader (f);
                BufferedReader br= new BufferedReader(fr);
                String line;
                int numlines=0;
                
                while((line=br.readLine()) !=null ){
                    numlines++;
                }
                String injection []=new String[numlines];
                br.close();
                fr.close();
                br = new BufferedReader(new FileReader(f));
                int i=0;
                
                while((line = br.readLine()) !=null){
                    injection[i]= line;
                    i++;
                }
                br.close();
                fr.close();
                
                FileWriter fw=new FileWriter(f);
                BufferedWriter bw=new BufferedWriter (fw);
                boolean flag=true;
                
                for(int j =0; j< injection.length; j++){
                   String l [] = injection[j].split("▬");
               }
               bw.close();
               fw.close();
               if (numlines==1 && flag==true){
                   f.delete();
               }
            }
        }
        catch(IOException e){
            System.out.println("error"+e);
        }
    }
   
    //--------------------------------------------------------------------------
}
