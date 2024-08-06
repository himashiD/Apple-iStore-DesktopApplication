/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Himashi
 */
public class ProductsClass {
    
    private String PoductID;
    private String ProductName;
    private String Category;
    private float Price;

    /**
     * @return the PoductID
     */
    public String getPoductID() {
        return PoductID;
    }

    /**
     * @param PoductID the PoductID to set
     */
    public void setPoductID(String PoductID) {
        this.PoductID = PoductID;
    }

    /**
     * @return the ProductName
     */
    public String getProductName() {
        return ProductName;
    }

    /**
     * @param ProductName the ProductName to set
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * @return the Category
     */
    public String getCategory() {
        return Category;
    }

    /**
     * @param Category the Category to set
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * @return the Price
     */
    public float getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(float Price) {
        this.Price = Price;
    }
    
    public void addProducts(ProductsClass obj)
    {
       String objString = obj.getPoductID()+ " , "+ obj.getProductName()+" , "+ obj.getCategory()+" , "+ String.valueOf(obj.getPrice());
       DBConnection db= new DBConnection();
       db.makeconnection(objString);
    }
    
}
