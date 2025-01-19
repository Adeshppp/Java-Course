
enum Laptop {
    Macbook(2000), XPS(2200), Surface(), ThankPad(1500);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    private Laptop() {
        this.price = 500;
    }

    public int getPrice() {
        return price;
    }

}

public class DemoNew {
    public static void main(String[] args) {
        for (Laptop laptop : Laptop.values())
            System.out.println(laptop + " : " + laptop.getPrice());
    }
}
