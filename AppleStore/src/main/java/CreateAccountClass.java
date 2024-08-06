/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Himashi
 */
public class CreateAccountClass 
{
    
    private String Name;
    private String ID;
    private Integer MobileNo;
    private String User_Name;
    private String Password;
    private String ConfirmPassword;

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the MobileNo
     */
    public Integer getMobileNo() {
        return MobileNo;
    }

    /**
     * @param MobileNo the MobileNo to set
     */
    public void setMobileNo(Integer MobileNo) {
        this.MobileNo = MobileNo;
    }

    /**
     * @return the User_Name
     */
    public String getUser_Name() {
        return User_Name;
    }

    /**
     * @param User_Name the User_Name to set
     */
    public void setUser_Name(String User_Name) {
        this.User_Name = User_Name;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the ConfirmPassword
     */
    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    /**
     * @param ConfirmPassword the ConfirmPassword to set
     */
    public void setConfirmPassword(String ConfirmPassword) {
        this.ConfirmPassword = ConfirmPassword;
    }

    
    public void addAccount(CreateAccountClass account)
    {
     String accountString = account.getName() + " , "+ account.getID()+" , "+ String.valueOf(account.getMobileNo()+ " , "+ account.getPassword()+ " , "+ account.getConfirmPassword());
     DBConnection2 db= new DBConnection2();
     db.makeconnection2(accountString);  
    }

   
    
}
