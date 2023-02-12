public class outer {


    //------------- example for static nested-------------------
//  private int a = 10;
//    static int b = 10;
//
//    void add()
//    {
//        System.out.println("Piklu");
//    }
//
//    public static void main(String[] args) {
//        outer obj = new outer();
//        obj.add();
//       // System.out.println("Private value = "+a);//error
//
//        System.out.println("Static value = "+b);
//
//    }
    private int a = 15;
    static int b = 30;

    void greet()//function definition
    {
        System.out.println("outer and inner class ");
    }

    class inner {

        void display() {
            System.out.println("Static value = " + a);
            System.out.println("Private value = " + b);
            greet();//call

        }

    }

    public static void main(String[] args) {
        outer obj = new outer();
        outer.inner obj1 = obj.new inner();// depends on the outer class
        obj1.display();
    }


}





