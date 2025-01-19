
import java.util.*;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

}

public class Demo {
    public static void main(String[] args) {
        // Comparator<Integer> comparator = new Comparator<Integer>() {
        // public int compare(Integer a, Integer b) {
        // if (a % 10 > b % 10)
        // return 1;
        // else
        // return -1;
        // }
        // };
        Comparator<Integer> comparator = (a, b) -> a % 10 > b % 10 ? 1 : -1;
        List<Integer> list = new ArrayList<Integer>();
        list.add(532);
        list.add(101);
        list.add(34);
        list.add(79);
        list.add(18);
        list.add(188820);
        System.out.println(list);
        Collections.sort(list, comparator);
        System.out.println(list);

        List<String> strings = new ArrayList<>();
        // Comparator<String> strComparator = new Comparator<String>() {
        // public int compare(String a, String b) {
        // if (a.length() < b.length())
        // return -1;
        // else
        // return 1;
        // }
        // };
        Comparator<String> strComparator = (a, b) -> a.length() < b.length() ? -1 : 1;
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Cherry");
        strings.add("Date");
        strings.add("Elderberry");
        System.out.println(strings);
        Collections.sort(strings, strComparator);
        System.out.println(strings);

        // Comparator<Student> studComparator = new Comparator<Student>() {
        // public int compare(Student stud1, Student stud2) {
        // if (stud1.getAge() < stud2.getAge())
        // return -1;
        // else
        // return 1;
        // }
        // };
        Comparator<Student> studComparator = (s1, s2) -> s1.getAge() < s2.getAge() ? -1 : 1;

        // Comparator<Student> nameComparator = new Comparator<Student>() {
        // public int compare(Student stud1, Student stud2) {
        // if (stud1.getName().length() < stud2.getName().length())
        // return -1;
        // else
        // return 1;
        // }
        // };

        // Comparator is functional interface
        Comparator<Student> nameComparator = (stud1,
                stud2) -> (stud1.getName().length() < stud2.getName().length()) ? -1 : 1;

        List<Student> students = new ArrayList<>();
        students.add(new Student(27, "Adesh"));
        students.add(new Student(25, "Nilesh"));
        students.add(new Student(23, "Suresh"));
        students.add(new Student(21, "Vishal"));
        students.add(new Student(29, "Abhi"));
        System.out.println(students);
        Collections.sort(students, studComparator);
        System.out.println("====== sorted studets based on age =======");
        for (Student stud : students) {
            System.out.println(stud);
        }
        Collections.sort(students, nameComparator);
        System.out.println(students);

        System.out.println("====== sorted studets based on name length =======");
        for (Student stud : students) {
            System.out.println(stud);
        }
    }

}
