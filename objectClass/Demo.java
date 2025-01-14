
class Laptop {
    String model;
    int price;

    public String toString() {
        return "Model: " + model + ", Price: " + price;
    }

    public boolean equals(Laptop that) {
        if (this.model.equals(that.model) && this.price == that.price)
            return true;
        else
            return false;
    }
}

public class Demo {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.model = "Lenovo Yoga";
        laptop1.price = 1000;

        Laptop laptop2 = new Laptop();
        laptop2.model = "Lenovo Yoga";
        laptop2.price = 1000;
        // System.out.println("Model: " + laptop.model + " Price: " + laptop.price);
        // System.out.println(laptop);

        System.out.println(laptop1.equals(laptop2));
    }
}
