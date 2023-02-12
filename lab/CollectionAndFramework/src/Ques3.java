
import java.util.*;
public class Ques3 {
    public static void main(String args[])
    { HashSet<Integer> hs1=new HashSet<Integer>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        System.out.println("Original Hashset-"+hs1);
        ArrayList<Integer> hs2=new ArrayList<Integer>();
        hs2.add(4);
        hs2.add(5);
//(a) Copy another collection object to the HashSet object
        hs1.addAll(hs2);
        System.out.println("After Copying another collection object to the HashSet object-"+hs1);
//(c) Search user-defined objects from HashSet
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter element you want to search in Hashset-");
        int s=sc.nextInt();
        if(hs1.contains(s)){
            System.out.println("Element is present");
        }
        else{
            System.out.println("Element is not present");
        }
//(b) Delete all entries at one call from HashSet
        hs1.clear();
        System.out.println("After deleting all entries at one call -"+hs1);
    }}
