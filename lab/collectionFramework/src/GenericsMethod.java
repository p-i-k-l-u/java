public class GenericsMethod
{
    <A,B> void add(A var1, B var2)// here A and B is define a type such as String , float, Integer etc
    {
        System.out.println(var1);
        System.out.println(var2);
    }

    public static void main(String[] args) {
        GenericsMethod obj = new GenericsMethod();// create object
        obj.add(23, " nelson sir ");
        obj.add(4.5, "Java");
    }
}
// Generics only works in class like wrapper classes(Integer,Float,Double), not work with datatype(int , float, double etc)