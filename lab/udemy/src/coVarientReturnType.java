public class coVarientReturnType
{
    coVarientReturnType get()
    {
        return this;
    }
}

class B3 extends coVarientReturnType
{
    @Override
    B3 get() {
        //return super.get();
        return this;
    }

        void message()
        {
            System.out.println("welcome");
        }

}
class ch
{
    public static void main(String[] args) {
        //new B3().get().message();

//        coVarientReturnType obj = new B3();// upcasting
//        obj.get();
          B3 obj = new B3();
          obj.message();
    }
}
