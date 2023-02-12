

import java.util.ArrayList;
import java.util.Vector;

public class VectorCollection
{
    // vector not save the memory
    // ArrayList save the memory
    // Vector is Synchronized(Threadsafe)
    //ArrayList is not ThreadSafe

    public static void main(String[] args) {
        //Vector<Integer> v = new Vector<Integer>();
        ArrayList<Integer> v = new ArrayList<Integer>();


//        v.add(3);
//        v.add(33);
//        v.add(22);
//        v.add(3);
//        v.add(33);
//        v.add(22);
//        v.add(3);
//        v.add(33);
//        v.add(22);
//        v.add(3);
//        v.add(33);
//        v.add(22);
//        v.add(3);
//        v.add(33);
//        v.add(22);
       // System.out.println(v.capacity(););

        System.out.println(v.size());
        for(int i : v)
        {
            System.out.println(i);
        }
    }

}
