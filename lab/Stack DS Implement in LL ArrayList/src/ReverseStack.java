import  java.util.*;
public class ReverseStack
{
    public static void pushAtBottom(int data , Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data,s);//recursion call
        s.push(top);
    }

    public static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top = s.pop();// find out top
        reverse(s);// another reverse and create a empty stack
        pushAtBottom(top,s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);


        while (!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println("--------------------");
        s.push(1);
        s.push(2);
        s.push(3);

        reverse(s);


        while (!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
