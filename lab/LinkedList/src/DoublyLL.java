public class DoublyLL
{
    Node head;
   private  class Node {
       int data;
       Node next;
       Node pre;


       public Node(int data) {
           this.data = data;

       }

       public Node(int data, Node next, Node pre) {
           this.data = data;
           this.next = next;
           this.pre = pre;
       }

   }

   public void insertFirst(int data)
        {
            Node newNode = new Node(data);

            newNode.next =head;
            newNode.pre = null;
            if(head!=null)
            {
                head.pre = newNode;

            }

            head = newNode;

        }
        public void insertLast(int data)
        {
            Node newNode = new Node (data);
            Node currNode = head;

            newNode.next = null;
            if(head == null)
            {
                newNode.pre = null;
                head = newNode;

            }


            while(currNode.next!=null)
            {
                //System.out.print(currNode.data + "-> ");
                currNode = currNode.next;
            }
            currNode.next = newNode;
            newNode.pre = currNode;
        }

        //Find the node where it's present
        public Node find(int data)
        {
            Node newNode = head;
            while(newNode !=null)
            {
                if(newNode.data == data)
                {
                    return newNode;
                }
                newNode = newNode.next;
            }
            return null;
        }

        public void insertAfter(int after , int data)
        {
            Node p =find(after);

            if(p==null)
            {
                System.out.println("Does not exist");
            }
            Node newNode = new Node(data);

            newNode.next = p.next;
            p.next = newNode;
            newNode.pre = p;
            if(newNode.next != null) {
                newNode.next.pre = newNode;
            }


        }









        public void Display()
        {
            Node currNode = head;
            Node last = null;
            while(currNode!=null)
            {
                System.out.print(currNode.data + "->");
                last = currNode;
                currNode = currNode.next;
            }

            System.out.println("Null");

            System.out.println("Print Reverse List ");
            while(last!=null)
            {

                System.out.print(last.data + "->");
                last = last.pre;
            }
            System.out.println("Null");
        }




    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(12);
        list.insertFirst(45);
        list.insertFirst(4);
        list.insertFirst(488);
        list.insertLast(900);
        list.insertAfter(45,899);


        list.Display();

    }



}


