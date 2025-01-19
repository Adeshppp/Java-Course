
class Laptop {
    String model;
    int price;

    // public String toString() {
    // return "Model: " + model + ", Price: " + price;
    // }

    // public boolean equals(Laptop that) {
    // return this.model.equals(that.model) && this.price == that.price;
    // }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + ", hashCode()=" + hashCode() + ", getClass()="
                + getClass() + ", toString()=" + super.toString() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
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
