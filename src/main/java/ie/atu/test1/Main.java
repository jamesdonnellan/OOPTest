package ie.atu.test1;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("WELCOME\n");
        System.out.println("Please enter command.\n");
        System.out.println("1. Add Product\n");
        System.out.println("2. Update Product\n");
        System.out.println("3. Display All Products\n");
        System.out.println("4. Exit\n");

        Scanner p1 = new Scanner(System.in);
        System.out.println("Enter Product Id: ");
        String productId = p1.nextLine();

    }
}
