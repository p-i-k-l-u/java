package P2;// package2

import P1.*;//A; // package1 access in package2 using import

public class B {// class2
    public static void main(String[] args) {
        A obj = new A("Piklu");// creating a object
        obj.Display();// print the message
    }
}
