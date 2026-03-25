package PractiseQueList;

import java.util.ArrayList;

public class MergeLists {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(30);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(40);
        l1.addAll(l2);
        System.out.println(l1);
    }
}
