import java.util.HashSet;
import java.util.Iterator;

public class set
{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();

        //add value
        set.add(3);
        set.add(7);
        set.add(4);
        set.add(4);
        set.add(7);

        //print all set
        System.out.println(set);

        //search

        if(set.contains(3))
        {
            System.out.println("3 is present in the set");
        }
        if(!set.contains(8))
        {
            System.out.println("does not present in the set");
        }

        //delete

        set.remove(7);

        //using iterator to print sorted set

        Iterator it = set.iterator();

        // using hasNext and next

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
