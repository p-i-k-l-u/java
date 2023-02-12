

public interface test2{//declare interface
    int number =100;
}
class AB implements test2{
    public static void main(String args[]){
        AB obj =new AB();
      // System.out.println(obj.number=200);//this will give error because by default variable declared in interface is final
}}
