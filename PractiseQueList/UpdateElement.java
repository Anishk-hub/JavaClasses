package PractiseQueList;

import java.util.ArrayList;

public class UpdateElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(10);
        list.add(7);
        list.set(0, 409);
        System.out.println(list);
    }
}
