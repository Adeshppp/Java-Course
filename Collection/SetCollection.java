import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {

        // Set<Integer> set = new HashSet<>();
        Collection<Integer> set = new TreeSet<>(); // sorted
        set.add(21);
        set.add(22);
        set.add(2);
        set.add(4);
        set.add(43);
        set.add(7);
        set.add(45);
        set.add(5);
        System.out.println(set);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
