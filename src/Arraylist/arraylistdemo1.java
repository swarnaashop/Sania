
package Arraylist;
import java.util.ArrayList;
import java.util.Iterator;
public class arraylistdemo1 {
    public static void main(String[]args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
       System.out.println("size = " + number.size());
       //adding elements
       number.add(10);
       number.add(20);
       number.add(30);
       number.add(3,40);
     //for(int x : number) {
         //System.out.print(x);
       Iterator itr = number.iterator();
       while(itr.hasNext()){
       System.out.print(" "+itr.next());
       }
       System.out.println("ArrayList contains : "+number);
       System.out.println();
         
       System.out.println("size = " + number.size());
       
       //Removing elements
       number.remove(2);
            System.out.println("after removing ArrayList contains :");
    }
}

