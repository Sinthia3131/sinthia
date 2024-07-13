package listoperations;
import java.util.*;
    public class ListOperations {
        public static void main(String[] args) {
            List<Integer> arrayList = new ArrayList<>();
            List<Integer> linkedList = new LinkedList<>();

            arrayList.add(10);
            arrayList.add(20);
            arrayList.add(30);

            linkedList.add(40);
            linkedList.add(50);
            linkedList.add(60);

            int arrayListSize = arrayList.size();
            int linkedListSize =  linkedList.size();

            int arrayListElement = arrayList.get(1);
            int linkedListElement = linkedList.get( 2);

            arrayList.set(1, 25);
            linkedList.set( 2, 55);

            arrayList.remove(0);
            linkedList.remove( 1);

            Collections.sort(arrayList);
            Collections.sort(linkedList);

           System.out.println( "ArrayList:");
           for (int num: arrayList) {
           
               System.out.println(num);
            }
           System.out.println("LinkedList:");
          for (int num : linkedList) {
            System.out.println(num);
    }
  }
}




