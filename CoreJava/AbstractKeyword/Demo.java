
abstract class Car {
    public abstract void drive();

    public void playMusic() {
        System.out.println("Music playing");
    }

}

class Ford extends Car {
    @Override
    public void drive() {
        System.out.println("Driving Ford");
    }
}

public class Demo {
    public static void main(String[] args) {
        Car obj = new Ford();
        obj.drive();
        obj.playMusic();
    }
}
