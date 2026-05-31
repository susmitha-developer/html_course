import java.util.*;

public class My4 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // add()
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // add(index, element)
        
        // size()
        int[] ar={1,2,3,4};
      
        // iteration
        for (String s : list) {
            System.out.println(s);
        }
        
        for(int i=0;i<list.size();i=i+1){
            System.out.println(list.get(i));
        }

         for(int i=0;i<ar.length;i=i+1){
            System.out.println(ar[i]);
        }

        // clear()
        list.clear();
        System.out.println("After clear: " + list);
    }
}