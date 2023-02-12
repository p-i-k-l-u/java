package pack2;
import pack1.subpack.*;
import pack1.*;


public class Main {
    public static void main(String[] args) {
        Arithmetic a = new Arithmetic();
        Subtraction s = new Subtraction();
        Multiplication m = new Multiplication();
        System.out.println("Sum = "+a.add());
        System.out.println("Difference = "+s.sub());
        System.out.println("Product = "+m.mul());
    }
}
