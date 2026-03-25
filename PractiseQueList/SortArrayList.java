package PractiseQueList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(20);
        list.add(10);
        list.add(5);

        Collections.sort(list);

        System.out.println(list);

    }
}
