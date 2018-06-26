package lineitemapp;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        //display a welcome message
//        System.out.println("Welcome to the Line Item Calculator");
        System.out.println("Welcome to the Product Selector");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        Validator v = new Validator();
        while (choice.equalsIgnoreCase("y"))
        {
            //get user input
            String productCode = v.getString(sc, 
                    "Enter product code: ");
            
            // get the Product object
            Product product = ProductDB.getProduct(productCode);
            
            //display the output
            System.out.println();
            if (product != null)
                product.print();
            else
                System.out.println("No product matches this product code.\n");
            
            System.out.println("Product count: " + Product.getCount() + "\n");
//            
//            int quantity = v.getInt(sc,
//                    "Enter quantity:     ", 0, 1000);
//            
            
            
            //create the LineItem object
//            LineItem lineItem = new LineItem(product, quantity);
            
            //display the output
//            System.out.println();
//            System.out.println("LINE ITEM");
//            System.out.println("Code:        " + product.getCode());
//            System.out.println("Description: " + product.getDescription());
//            System.out.println("Price:       " + product.getFormattedPrice());
//            System.out.println("Quantity:    " + lineItem.getQuantity());
//            System.out.println("Total:       " +
//                    lineItem.getFormattedTotal() + "\n");
            
            //see if the user wants to continue
            choice = v.getString(sc, "Continue? (y/n): ");
            System.out.println();
            
        }
        
    }//main
    
}//MainApp
