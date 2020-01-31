import javax.swing.plaf.synth.SynthSpinnerUI;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.lang.String;

/*
The user can:

Add item to the inventory, entering its type (book or gift card, etc), and necessary attributes along with quantity.

Display all items.

Display only books sorted by author name.

Display only gifts sorted by label.

Display only shoes sorted by sizeDelete an item by item_id

Purchase an item by removing the purchased quantity from the inventory


Bonus1: Save items to a file, and loading them back, using object serialization.

Bonus2: Instead of array object use a linked list to enable dynamic size for the e-store.
 */


public class Store {

    public void DisAll(){
        System.out.println("ALL ITEMS");
        System.out.println("Product\tDescription\t\t\t\t\t\t\t\t\tPrice\tQuantity");
        System.out.println("====================================================================");

        for (Item item : ilist) {
            item.Display();
            System.out.println("----------------------------------------------------------------");

        }
        Menu();
    }
    public void DisAuth(){
        System.out.println("\nBooks in the store according to author name");
        System.out.println("Product\tDescription\t\t\t\t\t\t\t\t\tPrice\tQuantity");
        System.out.println("====================================================================");
        for(Item item : ilist) {
            if(item.product.equals("Book")) {
                System.out.println("----------------------------------------------------------------");
                item.Display();
            }
            Menu();

        }

    } public void DisGift(){
        System.out.println("\nGifts in the store according to label");
        System.out.println("Product\tDescription\t\t\t\t\t\t\t\t\tPrice\tQuantity");
        System.out.println("====================================================================");
        for(Item item : ilist) {
            if(item.product.equals("GiftCard")) {
                item.Display();
                System.out.println("----------------------------------------------------------------");

            }
        }
        Menu();

    }
    public void DisShoe(){
        System.out.println("\nShoes in the store by size ");
        System.out.println("Product\tDescription\t\t\t\t\t\t\t\t\tPrice\tQuantity");
        System.out.println("====================================================================");
        for(Item item : ilist) {
            if(item.product.equals("Shoe")) {
                item.Display();
                System.out.println("----------------------------------------------------------------");
            }
            Menu();
        }

    } public void DelItem(){
        System.out.println("Enter the item id you would like to delete");
        int i = sc.nextInt();
        for(Item item : ilist) {
            if(item.id == i) {
                ilist.remove(i-1);
            }
        }
        DisAll();
        Menu();


    } public void Checkout(){

        System.out.println("type in the item id of the product you would like to purchase");
        int a = sc.nextInt();
        for(Item item : ilist) {
            if(item.id == a) {
                System.out.println("how many quantities?");
                int b = sc.nextInt();
                item.Purchase(b);
                Menu();
            }
        }
    }


public void Menu(){
    System.out.println("What would you like to do now?\n1)Display all items\n2)Display books by authos name\n3)Display gifts by label\n4)shoes by size\n5)Delete an item\n6)Check out\n7)Wite ");
    int i = sc.nextInt();
    if(i==1){
        DisAll();
    }else if (i==2){

        DisAuth();
    }else if (i==3){
        DisGift();

    }else if (i==4){
        DisShoe();

    }else if (i==5){
        DelItem();

    }else if (i==6){
        Checkout();
    }
}
    static LinkedList<Item> ilist = new LinkedList<Item>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Store store = new Store();
        System.out.println("how many items?");
        int n;
        n=sc.nextInt();
        Item i;

        for(int j = 0; j<n;j++){
            System.out.println("What is the item you would like to add?\n1)Book\n2)Gift Card\n3)Shoe");
            int s = sc.nextInt();

            if(s==1){
                System.out.println("Authors name?\n");
                String a = sc.next();
                System.out.println("title?\n");
                String b = sc.next();
                System.out.println("year?\n");
                String c = sc.next();
                System.out.println("qty?\n");
                int q = sc.nextInt();
                System.out.println("price?\n");
                double p = sc.nextDouble();
                i = new Book(a,b,c,p,q);
                ilist.add(i);

            }else if(s==2){
                System.out.println("label?\n");
                String a = sc.next();
                System.out.println("manufacturer?\n");
                String b = sc.next();
                System.out.println("qty?\n");
                int q = sc.nextInt();
                System.out.println("price?\n");
                double p = sc.nextDouble();
                i=new GiftCard(a,b,p,q);
                ilist.add(i);

            }else if(s==3){
                System.out.println("color?\n");
                String a = sc.next();
                System.out.println("size?\n");
                double b = sc.nextDouble();
                System.out.println("qty?\n");
                int q = sc.nextInt();
                System.out.println("price?\n");
                double p = sc.nextDouble();
                i=new Shoe(a,b,p,q);
                ilist.add(i);
            }

        }
        store.Menu();
    }

}