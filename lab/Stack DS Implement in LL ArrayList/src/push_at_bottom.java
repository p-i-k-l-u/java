import java.util.*;
public class push_at_bottom {
    public static void pushAtBottom(int data, Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data,s);// recursion call
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(3);
        s.push(4);
        s.push(5);

        pushAtBottom(7,s);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
