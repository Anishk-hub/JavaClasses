package PractiseQueList;

import java.util.LinkedList;

public class SearchElement {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        int index = list.indexOf(300);
        System.out.println(index);
    }
}
