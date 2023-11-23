import entity.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //1. Create a unique product for purchasing
        Product product = new Product("Tsinandali", new Euro(300));

        //2. Create an array for 6 objects (2 instances of every subclass by general-purpose constructors).

        PurchaseOne one = new PurchaseOne(product, 5, 10);
        PurchaseOne two = new PurchaseOne(product, 6, 5);
        PurchaseTwo three = new PurchaseTwo(product, 7, 20);
        PurchaseTwo four = new PurchaseTwo(product, 10, 50);
        PurchaseThree five = new PurchaseThree(product, 1, new Euro(20000));
        PurchaseThree six = new PurchaseThree(product, 2, new Euro(300));

        AbstractPurchase purchases[] = new AbstractPurchase[] {one, two, three, four, five, six};


        //3. Print the array content to the console (one element per line).
        for (AbstractPurchase purchase : purchases) {
            System.out.println(purchase);
        }

        //4. Sort an array by the cost in descending order with the method sort( ) of the class Arrays.
        Arrays.sort(purchases);
        System.out.println("\n");

        //5. Print the array content to the console (one element per line).
        for (AbstractPurchase purchase : purchases) {
            System.out.println(purchase);
        }
//
//        6. Print the minimum cost of purchase.
//        Example:
//        Minimum cost = 2.00
        System.out.println("Minimum cost = " + purchases[0].getCost());


//        7. Create the method int search(Purchase[] purchases), where find an index of some purchase with cost equal to 5.00 Euro,
//        using the method binarySearch( ) of the class Arrays.  Print the found purchase or a message about the failed search.

    }
}