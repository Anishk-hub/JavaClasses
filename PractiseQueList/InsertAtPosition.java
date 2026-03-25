package PractiseQueList;

import java.util.LinkedList;

class InsertAtPosition {
     public static void main(String[] args) {
         LinkedList<Integer> list = new LinkedList<>();

         list.add(15);
         list.add(20);
         list.add(25);
         list.add(30);
         list.add(2,10);

         System.out.println(list);
     }
}
