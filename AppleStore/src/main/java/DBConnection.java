/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Himashi
 */
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.io.*;


public class DBConnection 
{
 void makeconnection(String Record) 
  {
          String FILE= "D:\\Apple_iStore\\AppleiStoreProduct.txt";
          
          {
              FileWriter filewriter = null;
              BufferedWriter bufferedwriter = null;
              try
              {
                   
                  filewriter = new FileWriter(FILE,true);
                  bufferedwriter = new BufferedWriter(filewriter);
                  
                  bufferedwriter.write(Record);
                  bufferedwriter.newLine();
                  bufferedwriter.close();
                  
                  JOptionPane.showMessageDialog(null, "Sccessfully write in the file");
                  
              }
              catch (Exception e)
              {
                  System.out.println("An error occoured saving values"+e);
              }
          }  
  }    
    
}
