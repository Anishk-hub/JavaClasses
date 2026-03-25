package PractiseQueList;

import java.util.LinkedList;

public class LinkedListFirstLast {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(15);
        list.add(7);

        System.out.println("1st: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
    }
}
