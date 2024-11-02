/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minor_project;
/**
 *
 * @author geet
 */
public class Minor_Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            System.out.println("Driver Registered successfully");
            
        }
        catch(Exception e){
            System.err.println(e);
            
        }
    }
    
}
