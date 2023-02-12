import java.util.Scanner;
interface StackInterface {
    void pop();// ABSTRACT FUNCTION
    void push();// ABSTRACT FUNCTION
    void Show();// ABSTRACT FUNCTION
    int stack[] = new int[15];
}
class StackClass implements StackInterface { //INHERITANCE
    Scanner sc = new Scanner(System.in);
    int top = -1;
    public void push() {// DEFINING ABSTRACT FUNCTION
        System.out.println("Enter data you want to insert-");
        int data = sc.nextInt();
        if (top == 14) {
            System.out.println("Stack Overflow");
        } else {
            top += 1;
            stack[top] = data;
        }
    }
    public void pop() {// DEFINING ABSTRACT FUNCTION
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            stack[top] = 0;
            top -= 1;
        }
    }
    public void Show() {// DEFINING ABSTRACT FUNCTION
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i] + "\n");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StackClass stk = new StackClass();// OBJECT INSTANTIATION OF CHILD CLASS
        while (true) {
            System.out.println("\npress 1 for push\n" +
                    "press 2 for traverse\n" +
                    "press 3 for pop\n ");
            System.out.print("Enter choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    stk.push();// INVOKING OVERRIDDEN METHOD
                    break;
                case 2:
                    stk.Show();// INVOKING OVERRIDDEN METHOD
                    break;
                case 3:
                    stk.pop();// INVOKING OVERRIDDEN METHOD
                    break;
                default:
                    System.out.println("Invalid  input");
            }
        }}}