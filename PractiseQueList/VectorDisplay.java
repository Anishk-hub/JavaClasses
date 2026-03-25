package PractiseQueList;

import java.util.Vector;

public class VectorDisplay {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        v.add(30);

        for(int num : v){
            System.out.println(num);
        }
    }
}
