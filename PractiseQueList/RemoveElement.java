package PractiseQueList;

import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(7);
        list.add(9);
        list.add(10);
        list.add(11);

        list.remove(Integer.valueOf(10));

        System.out.println(list);
    }
}
