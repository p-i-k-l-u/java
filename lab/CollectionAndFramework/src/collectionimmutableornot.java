import java.util.*;

public class collectionimmutableornot
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);

        List<Integer> immutableList = Collections.unmodifiableList(new ArrayList<>(list));
        for (int i: immutableList
             ) {

            System.out.println(i);

        }

        System.out.println();

        Set<Integer> immutableSet = Collections.unmodifiableSet(new HashSet<>(list));
        for (int i:immutableSet
             ) {
            System.out.println(i);
        }

//        System.out.println();
//
//        Map<Integer,String> immutableMap = Collections.unmodifiableMap(new HashMap<>(8,0.6f));
//        for (int i:immutableMap
//             ) {
//
//        }
    }
}
