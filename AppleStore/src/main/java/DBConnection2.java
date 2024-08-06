
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Himashi
 */
public class DBConnection2 
{
  void makeconnection2(String Record)
  {
    
          String ACCFILE= "D:\\Apple_iStore\\NewAccounts.txt";
          
          {
              FileWriter filewriter = null;
              BufferedWriter bufferedwriter = null;
              try
              {
                   
                  filewriter = new FileWriter(ACCFILE,true);
                  bufferedwriter = new BufferedWriter(filewriter);
                  
                  bufferedwriter.write(Record);
                  bufferedwriter.newLine();
                  bufferedwriter.close();
                  
                  JOptionPane.showConfirmDialog(null, "Successfully writer in the file");
                  
              }
              catch (Exception e)
              {
                  System.out.println("An error occoured saving values"+e);
              }  
          }    
      
  }  
}
