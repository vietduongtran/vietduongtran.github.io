package buoi10.Given.buoi10a;

import java.util.HashSet;
import java.util.Set;

public interface main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);

        Set<Integer> set1 = new HashSet<>();
        set1.addAll(set);
        set1.add(3);
        set1.removeAll(set);

        // System.out.println(set1);
        // set1.clear();
        System.out.println(set1);

        
    }
}
