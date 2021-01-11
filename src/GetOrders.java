import java.util.InputMismatchException; // import the exception catching class
import java.util.Scanner; // import the scanner class

public class GetOrders {

    // main method which will run your program
    public static void main(String args[]) {

        // create your new scanner
        // Note: since scanner is opened to "System.in" closing it will close "System.in". 
        // Do not close scanner until you no longer want to use it at all.
        Scanner scanner = new Scanner(System.in);

        // PROMPT THE USER
        // Note: when using scanner it is recommended to prompt the user with "System.out.print" or "System.out.println"
        System.out.println("Please select Product  1. Apples  2. oranges ");

        // use "try" to catch invalid inputs
        try {

            // get integer with "nextInt()"
            int productID = scanner.nextInt();


            System.out.println("Please enter a Quantity"); // PROMPT
            // get decimal with "nextFloat()"
            float Qty = scanner.nextFloat();

            System.out.println("Please Select Offer 1.Buy one get one free on apples 2. 3 for the price of 2 on oranges"); // PROMPT
            // 
            int offer = scanner.nextInt();

            // ---- Note: Scanner.nextInt() does not consume a nextLine character /n 
            // ---- In order to read a new line we first need to clear the current nextLine by reading it:
            scanner.nextLine(); 
            int free=0,price=0;
            if(productID==1)
            {
            	price=60;
            }else
            {
            	price=65;
            }
           if(offer==1)
           {
        	   free=(int) Qty;
           }
  
         float  total=(int)Qty*price;
            float total_price=productPrice((int)Qty,free,price,total);
            // do something with the input
            System.out.println("Order has been placed. We will deliver this order within 6 hours . Total Order Price : "+String.valueOf( total_price));
           
        }
        catch (InputMismatchException e) {
            System.out.println("\tInvalid input entered. Please enter the specified input");
        }

        scanner.close(); // close the scanner so it doesn't leak
    }
    
    
    public static float productPrice(int products,int freeproduct, int price, float totalprice) {
    	int sum = price*freeproduct;
    	int totalproducts=products+freeproduct;
    	float total= totalprice+ sum;
    //	int singleproduct=totalprice/totalproducts ;
    return total;
    }
    
    // Kindly refer the below application Link. 
   //  https://play.google.com/store/apps/details?id=com.scoto.wizesales
    // https://play.google.com/store/apps/details?id=com.scoto.frshmilk
    //I have done this function in Server side.(Python,PHP,)
}