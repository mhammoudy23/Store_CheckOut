/*
concrete class: “Book”
a Book is-an item.
It adds the attributes “author”, “title” and “year”
 */

public class Book extends Item {
    private String author;
    private String btitle;
    private String year;

    public Book(String author,String btitle, String year,double p, int q)
    {
        this.price=p;
        this.qty=q;
        this.product="Book";
        this.author=author;
        this.btitle=btitle;
        this.year=year;
    }

    public void Display(){
        System.out.println(""+id+"  "+product+"\tTitle:"+btitle+"\tAuthor:"+author+"\tYear:"+year+"\t\t\t\t     "+price+"\t"+qty);
    }

    @Override
    public void Purchase(int i) {
        qty-=i;

    }

}
