package PractiseQueList;

import java.util.Vector;

public class Vector_check {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(12);
        v.add(13);
        v.add(20);

        System.out.println(v.contains(20));
    }
}
