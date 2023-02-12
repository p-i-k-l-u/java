import java.util.Scanner;

public class SinglyLL
{
  Node head;
    class Node
    {
        int data;
        Node next;
        // constructor
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }





    //addfirst
     void addfirts(int data)
    {

        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;// create a newNode

        }

        newNode.next = head;
        head = newNode;
        return;
    }

    //addlast

   void addlast(int data) {



        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }

        Node currNode = head;// create a new node which is point to the head node

        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

     void display()
    {
        Node currNode = head;
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }

        while(currNode!=null)
        {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLL list = new SinglyLL();



        while(true)
        {
            System.out.println("\n press 1 for addfirst\n" +
                    "\npress 2 for addlast\n" +
                    "\npress 3 for print\n ");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:

                    System.out.println("Enter the number ");

                    list.addfirts(sc.nextInt());


                    break;

                case 2:

                    System.out.println("Enter the number ");


                    list.addlast(sc.nextInt());


                    break;

                case 3:
                    list.display();
                    break;

                default:
                    System.out.println("Invalid choice ");
            }
        }
    }
}
