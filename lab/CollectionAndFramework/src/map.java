import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map
{
    public static void main(String[] args) {
        Map<Integer,String> v = new HashMap<>();

        v.put(1,"Mahadev");
        v.put(2,"Ram");
        v.put(3,"Krishna");

       //1 methode to print all the key
        // System.out.println(v);
        // 2) get method
       // System.out.println(v.get(1));// change 2 and 3

        Set<Integer> keys =  v.keySet();// store the value in set
        /*for(map.keySet())
        {
            System.out.println(v.get());
        }
        */

        for(Integer key: keys)
        {
            System.out.println(key+ " " +v.get(key));
        }

    }
}


