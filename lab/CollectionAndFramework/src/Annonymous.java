public class Annonymous
{
    public void display()
    {
        System.out.println("class 1");
    }
}

//class b extends Annonymous
//{
//    public void display()
//    {
//        System.out.println("Class 2");
//    }
//}

class Main
{
    public static void main(String[] args) {
        Annonymous ob = new Annonymous()
        {
            public void display()
            {
                System.out.println("Class 2");
            }
        };

        ob.display();// it's show Annonymous class context print -> class 2
        // print class 1 because of method overriding class b override the class Annonymous
    }
}