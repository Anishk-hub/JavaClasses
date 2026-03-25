package PractiseQueList;

import java.util.ArrayList;
import java.util.Vector;

class CopyList {
     public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
         list.add(20);

         Vector<Integer> v = new Vector<>(list);
         System.out.println(v);
     }
}
