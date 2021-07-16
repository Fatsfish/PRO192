package CaseStudy2;

/**
 *
 * @author Kyro-FF
 */
public class Item {

    private String code;
    private String name;
    private int price;

    public Item(String c, String n, int p) {
        code=c;
        name=n;
        price=p;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
   
    public void print() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
