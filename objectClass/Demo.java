
class Laptop {
    String model;
    int price;

    public String toString() {
        return "Model: " + model + ", Price: " + price;
    }
}

public class Demo {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.model = "Lenovo Yoga";
        laptop.price = 1000;
        // System.out.println("Model: " + laptop.model + " Price: " + laptop.price);
        System.out.println(laptop);
    }
}
