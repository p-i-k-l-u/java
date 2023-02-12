import javax.sound.midi.Soundbank;
import java.util.*;
public class mainclass
{
    public static void main(String[] args)
    {
//        //List<Integer> list = new ArrayList<>();//= Collections.checkedList(new ArrayList<>(),Integer.class);
//        //List <Integer> list = Collections.unmodifiableList(new ArrayList<Integer>());
//        List <Integer> list= Collections.synchronizedList(new ArrayList<Integer>());
//        list.add(10);
//        list.add(80);
//        list.add(9990);
//        list.add(83640);
//        list.add(220);
//        list.add(876520);
//        list.add(9824360);
//
//
////        List list2 = list;
////        list2.add("PiKlu");
//
//        for (int i : list
//             ) {
//
//            System.out.println(i);
//
//        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);

        List<Integer> immutableList = Collections.unmodifiableList(new ArrayList<>(list));
        for (int i: immutableList
             ) {
            System.out.println(i);
        }

        List<Integer> immutableListCheck = List.of(1,3,5);
        for (int i: immutableListCheck
             ) {
            System.out.println(i);
        }
        Map<Integer,String> immutableMap = Map.of(1,"one",3,"three",5,"five");
//


    }
}