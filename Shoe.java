/*
concrete class: “Shoe”
a Shoe is-an item.
 It adds the attributes “colour”
  (a String one of these colours: white, silver, red, beige, brown, blue, black, pink),
  and “size” (double).
 */

import java.util.Arrays;

class Shoe extends Item{

    private String color;
    private double size;

    public Shoe(String color, double size,double price, int qty)
    {
        this.price = price;
        this.qty = qty;
        this.product = "Shoes";
        this.color = color;
        this.size = size;
    }

    @Override
    public void Display() {
        System.out.println(""+id+""+product+"\tColor:"+color+"\tSize:"+size+"\t\t\t\t     "+price+"\t"+qty);

    }

    @Override
    public void Purchase(int i) {
        qty -=i;
    }

}
