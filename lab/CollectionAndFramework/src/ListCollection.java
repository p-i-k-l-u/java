import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListCollection
{
    public static void main(String[] args) {

        //Collection values = new ArrayList();

        List<Integer> values = new ArrayList<>();

        values.add(400);
        values.add(55);
        values.add(8);
        values.add(6);
        values.add(1,5);// it can't throw error because  List collection have a features
        // List extends collection and indirectly ArrayList implements collection

        Collections.sort(values);// Collection interface  doesn't support sort. List interface is support
        Collections.reverse(values);// reverse the Value

        values.forEach(System.out::println);// Stream API ... Lambda Expression

//        for(int i: values)
//        {
//            System.out.println(i);
//        }


    }
}
