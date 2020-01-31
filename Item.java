/*
abstract class: “Item”
every item has a unique item_id (a positive integer,
auto-incremented for each new item), a price (double, 0 or positive),
and quantity (integer, 0 or positive), Title (String, cannot be empty).
Every item can be “Display()”, an abstract method, and “Purchase()”
(that is removed from the inventory).
 */

public abstract class Item {
    protected int id,qty;
    protected double price;
    protected String product;
    private int count = 0;


    public Item()
    {
        id=++count;
    }

    public abstract void Display();
    public abstract void Purchase(int b);

public String toString(){
        return "" + id;
}

}


