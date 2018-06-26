package lineitemapp;

import java.text.NumberFormat;

public class LineItem {
    
    private Product product;
    private int quantity;
    private double total;
    
    
    public LineItem()
    {
        
        this.product = new Product();
        this.quantity = 0;
        this.total = 0;
        
    }//LineItem()
    
    
    
    public LineItem(Product product, int quantity)
    {
        
        this.product = product;
        this.quantity = quantity;
        
    }//LineItem()
    
    
    
    public void setProduct(Product product)
    {
        this.product = product;
    }//setProduct
    
    
    
    public Product getProduct()
    {
        return product;
    }//getProduct
    
    
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }//setQuantity
    
    
    
    public int getQuantity()
    {
        return quantity;
    }//getQuantity
    
    
    
    public double getTotal()
    {
        this.calculateTotal();
        return total;
    }//getTotal
    
    
    
    private void calculateTotal()
    {
        total = quantity * product.getPrice();
    }//calculateTotal
    
    
    
    public String getFormattedTotal()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(this.getTotal());
    }//getFormattedTotal
    
    
    
}//class LineItem
