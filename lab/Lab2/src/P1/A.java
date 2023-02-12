package P1;// package 1

public class A { // class 1
    // 4 protected methods
    private String name;
    private int age;
    private String course;
    private int sap_id;

    public A (String name)// constructor
    {
        this.name = name;
        this.age = 20;
        this.course = "B.TECH";
        this.sap_id = 500096448;
    }
    public void Display()// function
    {
        //message wil be print
        System.out.println("Name of the Student = "+name  +
                "\nAge = "+ age +
                "\nCourse is " + course  +
                "\nSAP_ID is " +sap_id);
    }
}
