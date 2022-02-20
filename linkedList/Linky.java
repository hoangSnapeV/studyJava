package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Linky {
    public static void main(String[] args) {
        LinkedList<Integer> linky = new LinkedList<Integer>();

        // linky.add("Ronny");
        // linky.add("Alex");
        // linky.add("Snape");
        linky.add(87);
        linky.add(22);
        linky.add(2);
        linky.add(78);
        System.out.println(linky.get(1));

        int index = 0;
        Iterator it  = linky.iterator();
        while(it.hasNext()) {
            if((int) it.next() == 78) {
                System.out.println(index + " we found 78");
            }
            index++;
        }
        System.out.println(index);

    }
}
