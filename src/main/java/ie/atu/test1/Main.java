package ie.atu.test1;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        // Main Menu //
        System.out.println("WELCOME\n");
        System.out.println("Please enter command.\n");
        System.out.println("1. Add Product\n");
        System.out.println("2. Update Product\n");
        System.out.println("3. Display All Products\n");
        System.out.println("4. Exit\n");


        // Input validation //
        String name = "Shirt";
        String productId = "shirt123";
        boolean IdChecker = false;
        while(!IdChecker)
        {
            try
            {
                if (productId.equals(productId))
                {
                    System.out.println("Product found.");
                    IdChecker = true;
                    break;
                }
                else if (!IdChecker)
                {
                    System.out.println("Product not found. Invalid Input.");
                }
            }
            catch (NumberFormatException ae)
            {
                System.out.println("Please try again");
            }
        }


    // user selects an option

    // if user enters add product
        Scanner p1 = new Scanner(System.in);
        System.out.println("Enter New Product Name: ");
        String name = p1.nextline();
       Product name = set.productId("");

       // if user updates product

        // if user displays all products
        ArrayList<String> product = new ArrayList<>();
        product.add("Shirts\n Product ID: shirt123\n Price: $10\n Quantity: 5");


        System.out.println("Current Products: ");
        for(int i=0; i < product.size(); i++)
        {
            System.out.println((i+1) + product.get(i));
        }

        // exits program
    if(userInput = 4)
        {
            break;
        }
    }
}
