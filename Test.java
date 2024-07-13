
package test;

import java.util.Iterator;
import java.util.LinkedList;

public class Test {

public static void main(String[] args){

LinkedList linkedist = new LinkedList<>();

linkedist.add(10);
linkedist.add(20);
linkedist.add(30);
linkedist.addFirst(-10);

Iterator iterator = linkedist.iterator();

while(iterator.hasNext()){

       System.out.print(iterator.next() + " ");

            }

       }


}