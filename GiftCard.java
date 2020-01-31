/*
concrete class: “GiftCard”
a GiftCard is-an item.
It adds the attributes “label”, and “manufacturer”.
 */

class GiftCard extends Item{

    private String label;
    private String manu;

    public GiftCard(String label, String manu ,double price, int qty)
    {
        this.product = "Gift Card";
        this.label = label;
        this.manu = manu;
        this.price = price;
        this.qty = qty;

    }

    @Override
    public void Display() {
        System.out.println(""+id+""+product+"\tLabel:"+label+"\tManufacturer:"+manu+"\t\t\t\t     "+price+"\t"+qty);
    }

    @Override
    public void Purchase(int i) {
        qty -=i;
    }

}