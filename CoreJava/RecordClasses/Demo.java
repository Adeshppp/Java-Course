
// class Student {
//     int id;
//     String name;

//     public int getId() {
//         return id;
//     }

//     public Student(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + id;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }

//     @Override
//     public String toString() {
//         return "Student [id=" + id + ", name=" + name + "]";
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Student other = (Student) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

// }

record Student(int id, String name) {
    // we can declare multiple methods here
}

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Adesh");
        Student s2 = new Student(2, "Nilesh");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1);
        System.out.println(s2.name());

    }
}
