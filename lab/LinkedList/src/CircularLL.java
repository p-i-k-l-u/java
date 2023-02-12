import java.util.Scanner;

public class CircularLL
{
    // you can use Private
    Node head ;
     Node tail;

     int size ;

     public CircularLL()
    {
        this.head = null;
        this.tail = null;
    }

    public void insertFirst(int data)

    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }

        tail.next = newNode;
        newNode.next = head ;

        tail = newNode;
    }
     public void delete()
     {
//         Node newNode = head ;
//         if(newNode ==null)
//         {
//             return;
//         }
//         if(newNode.data == data)
//         {
//             head = head.next;
//             tail.next = head;
//         }
//
//         do{
//             Node n = newNode.next;
//             if(n.data == data)
//             {
//                 newNode.next = n.next;
//                 break;
//             }
//             newNode = newNode.next;
//         }while(newNode != head);

         Node currNode = head;
         if(currNode == null)
         {
             return;
         }
         head = head.next;
         tail.next = head;
         currNode.next = null;


     }

     public Node nodeFind(int data)
     {
         Node currNode = head;
         while(currNode !=null)
         {
             if(currNode.data == data)
             {
                 return currNode;
             }
             currNode = currNode.next;
         }
         return null;// nothing
     }

     public void insertAfter(int after , int data)
     {
         Node p = nodeFind(after);

         Node newNode = new Node(data);
         newNode.next = p.next;
         p.next = newNode;


     }
     public void deleteLast()
     {
//         Node pre = null;
//         Node currNode = tail.next ;
//
//
//         if(tail==null)
//         {
//             System.out.println("List is empty");
//         }
//
//         if(currNode.next == currNode)
//         {
//             tail = null;
//         }
//         while(currNode.next != tail.next)
//         {
//             pre = currNode;
//             currNode = currNode.next;
//         }
//         pre.next = tail.next;
//         tail = pre;
         Node currNode = head;

         if(tail == null)
         {
             System.out.println("List is empty");
         }

         if(currNode.next == currNode)
         {
             tail = null;
         }

         while(currNode.next != tail)
         {
             currNode = currNode.next;

         }
         tail.next = null;

         currNode.next = head;
         tail = currNode;


     }

     public void deleteAtPos(int index)
     {
//
//         Node currNode = head;
//         if(index == 0)
//         {
//             delete();
//         }
////         if(index == size -1)
////         {
////             deleteLast();
////         }
//         for(int i=0;i<index -1 ;i++)
//         {
//             currNode = currNode.next ;
//         }
//         currNode.next = currNode.next.next;
   }



    public void display()
    {
        Node currNode = head ;

        if(head !=null)
        {
            do{
                System.out.print(currNode.data + "->");
                currNode = currNode.next;
            }while(currNode != head);


            System.out.println("Head");

        }


    }




    class Node
    {
        int data ;
        Node next;

        public Node (int data) //constructor
        {
            this.data = data;
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        CircularLL list = new CircularLL();

        while(true)
        {
            System.out.println("1 Insert First ");
            System.out.println("2 Delete First ");
            System.out.println("3 Insert After ");
            System.out.println("4 Delete Last  ");
            System.out.println("5 Delete at Certain Position ");
            System.out.println("6 Display the data ");

            System.out.println(" Enter your choice : ");
            int choice = sc.nextInt() ;
            switch (choice)
            {
                case 1:
                    System.out.println("Enter the data ");
                    list.insertFirst(sc.nextInt());
                    break;

                case 2:
                    list.delete();
                    break;

                case 3:
                    System.out.println("Enter the posititon and data :");
                    list.insertAfter(sc.nextInt(),sc.nextInt());
                    break;

                case 4:
                    list.deleteLast();
                    break;

                case 5:
                    System.out.println("Enter the position where you ant to delete");
                    list.deleteAtPos(sc.nextInt());

                case 6:
                    list.display();
                    break;


                default:
                    System.out.println("Invalid Input ");
            }
        }


//
//        list.insertFirst(88);
//        list.insertFirst(99);
//        list.insertFirst(777);
//        list.insertFirst(66);
//        list.insertFirst(946);
//
//
//        list.insertAfter(88,8888);
//
//
//
////        list.display();
////
////        list.delete();
//        list.display();
//
//        list.deleteLast();
//
//        list.display();
//
//        list.deleteAtPos(3);
//
//
//        list.display();
    }


}
