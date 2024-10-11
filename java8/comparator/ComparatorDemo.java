

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(99);
        list.add(0);
        list.add(8);
        System.out.println("ascending order" );
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Descending order");
        // Collections.sort(list,new Myclass());
        Collections.sort(list,(a,b)->b-a); // lambda expression
        System.out.println(list);




    }
}
