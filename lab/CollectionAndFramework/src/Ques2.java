import java.util.*;
public class Ques2 {
    Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
        hm1.put(1, "OOPs ");
        hm1.put(2, "Teacher ");
        hm1.put(3, "Christalin");
        hm1.put(4, "Nelson");
        System.out.println("Hashmap-" + hm1);
//(a) Find whether the specified key exists or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key you want to search-");
        int n = sc.nextInt();
        if (hm1.containsKey(n)) {
            System.out.println("Key is present");
        } else {
            System.out.println("Key is not present");
        }
//(b) Find whether the specified value exists or not,
        System.out.print("Enter value you want to search-");
        String s = sc.next();
        if (hm1.containsValue(s)) {
            System.out.println("Value is present");
        } else {
            System.out.println("Value is not present");

        }
//(c) Get all keys from the given HashMap
        System.out.println("All keys from hm1 HashMap-");
        for(Integer m:hm1.keySet()){
            System.out.println(m);
        }
//(d) Get all key-value pair as Entry objects
        System.out.println("All key-value pair as Entry objects-");
        for (Map.Entry<Integer, String> entries : hm1.entrySet()) {
            System.out.println(entries.getKey() + "-" + entries.getValue());
        }
    }
}

