class Adder{

    public static int a,b,c;

    int add(int a,int b){return this.a=a+b;}

    int add(int a,int b,int c){return this.a=this.a+b+c;}

}

public class TestOverloading1{

    public static void main(String[] args){

        Adder ob=new Adder();

        System.out.println(ob.add(12,11));

        System.out.println(ob.add(11,13,11));

    }}