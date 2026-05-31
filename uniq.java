import java.util.*;

public class uniq {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
       //list=["A","B"]
        // add()
       // list.add("A");
       // list.add("B");

        //addFirst(), addLast()
      // list.addFirst("Start");
      //  list.addLast("End");

        // getFirst(), getLast()
        //System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        // removeFirst(), removeLast()
       // list.removeFirst();
       // list.removeLast();

        // offer(), offerFirst(), offerLast()
       // list.offer("X");
        //list.offerFirst("Y");
        //list.offerLast("Z");

        // peek()
        //System.out.println("Peek: " + list.peek());

        // poll()
        //System.out.println("Poll: " + list.poll());

        // iteration
        /*for (String s : list) {
            System.out.println(s);
        }*/
       System.out.println(list);
    }
}