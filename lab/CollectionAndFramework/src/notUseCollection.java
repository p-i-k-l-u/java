import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class notUseCollection {
    public static void main(String[] args) {

        // we use generics that is for specific type of data store in the stack
        // only Integer,only String, only Double etc.
        Collection<Integer> values = new <Integer> ArrayList();
        //collection is a framework
        // collection is a interface
        // collection is class

        // and search the oracle docs collection api in java there are many thing. set, list,queue we use under List-> ArrayList
        // And also we can say that collectioon is collection object

        values.add(4);
//        values.add("Piklu");
//        values.add(5.7);
//        values.add(9.7f);


        // how to fetch the value there are two waye to fetch the value 1) iterator 2) enhanced for loop
//---------------------------------------------------------------------------------
       // Iterator i = values.iterator();// values is a methode which return the object of collection class
//        while(i.hasNext())// hasNext is check for the next element. do you have a next element or not
//        {
//            System.out.println(i.next());// next -> it is gives us next value of the obj
//
//        }

        //System.out.println(i.next());
    // System.out.println(i.next());
//  System.out.println(i.next());
//----------------------------------------------------------------------------------
// 2) enhanced for loop or for each loop

        for( int i: values)// type of values object
        {
            System.out.println(i);
        }

    }
}