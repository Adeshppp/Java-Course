
// abstract class Computer {
//     abstract public void code();
// }

interface Computer {
    int memorySize = 1024;

    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("I am coding by using laptop");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("I am coding by using desktop");
    }
}

class Developer {
    public void buildApplication(Computer computer) {
        computer.code();
    }
}

public class Demo {
    public static void main(String[] args) {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();
        Developer developer = new Developer();
        developer.buildApplication(laptop);
        developer.buildApplication(desktop);
    }
}
