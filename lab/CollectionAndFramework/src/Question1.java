
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();//CREATING ArrayList OBJECT
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
//(a) Read all elements from ArrayList by using Iterator
        Iterator i1 = l1.iterator();
        System.out.println("Original Arraylist-");
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
//(b) Create a duplicate object of an ArrayList instance
        ArrayList copy = new ArrayList();
        copy = (ArrayList)l1.clone();
        System.out.println("Duplicate ArrayList instance-"+copy);
        ArrayList l2=new ArrayList();
// (c) Reverse ArrayList content
        System.out.print("Reversed Arraylist-");
        for(int i=l1.size()-1;i>=0;i--){
            l2.add(l1.get(i));
        }

        System.out.println(l2);
    }
}

