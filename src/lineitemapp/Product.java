package lineitemapp;

import java.text.NumberFormat;

public abstract class Product {

    private String code;
    private String description;
    private double price;
    
    protected static int count = 0;
    
    public Product()
    {
        
        code = "";
        description = "";
        price = 0;
    }
    
    public Product(String code, String description, double price)
    {
        this.code = code;
        this.description = description;
        this.price = price;
    }
    
    @Override
    public String toString()
    {
        return "Code:        " + code + "\n" +
               "Description: " + description + "\n" +
               "Price:       " + this.getFormattedPrice() + "\n";
    }
    
    abstract String getDisplayText();
    
    @Override
    public boolean equals(Object object)
    {
        if (object instanceof Product)
        {
            Product product2 = (Product) object;
            if
            (
                code.equals(product2.getCode()) &&
                description.equals(product2.getDescription()) &&
                price == product2.getPrice()
            )
                return true;
        }
        return false;
    }
    
    public static int getCount()
    {
        return count;
    }
    

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode(){
        return code;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public String getFormattedPrice()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
    
}//class Product
