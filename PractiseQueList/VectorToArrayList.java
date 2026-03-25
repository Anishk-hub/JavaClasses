package PractiseQueList;

import java.util.ArrayList;
import java.util.Vector;

class VectorToArrayList {
    public static void main(String[] args) {


     Vector<Integer> v = new Vector<>();
     v.add(10);
     v.add(20);
     v.add(200);

     ArrayList<Integer> list = new ArrayList<>(v);

     System.out.println(list);
}
}
