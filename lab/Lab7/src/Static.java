public  class Static {

    private int a = 10;
    static int b = 40;

    void print()
    {
        System.out.println("Only static value is print ");
    }

    static class inner
    {

        void display()
        {
//            print();// error
//            System.out.println("private  value is ="+a);//error
            System.out.println("Static value is ="+b);// not error
        }
    }

    public static void main(String[] args) {
        Static.inner obj = new inner();
        obj.display();
    }


}
