package PractiseQueList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class RemoveDuplicates {
     public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();

         list.add(5);
         list.add(10);
         list.add(15);
         list.add(15);
         list.add(20);

         Set<Integer> set = new HashSet<>(list);
         System.out.println(set);
     }
}
