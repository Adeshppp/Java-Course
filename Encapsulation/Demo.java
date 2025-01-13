
class Human {
    private int age;
    private String name;

    public Human(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Demo {
    public static void main(String[] args) {
        Human obj = new Human("Adesh", 27);
        // obj.setName("Adesh");
        // obj.setAge(27);

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
