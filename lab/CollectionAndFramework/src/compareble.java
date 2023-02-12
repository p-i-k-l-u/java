import java.util.ArrayList;
import java.util.List;

public class compareble {
    private String com ;
    private int memory;
    private int cost;
//constructor
   public compareble(String com , int memeory, int cost)
   {
       super();
       this.com = com;
       this.cost = cost;
       this.memory = memeory;
   }

   public String getCom()
   {
       return com;
   }
   public void setCom(String com)
   {
       this.com = com;
   }

   public int getMemory()
   {
       return memory;
   }
   public void setMemory(int memory)
   {
       this.memory = memory;
   }

   public int getCost()
   {
       return cost;
   }
   public void setCost(int cost)
   {
       this.cost = cost;
   }
   @Override
   public String toString ()
   {
       return "Laptop [com"+ com + "ram ="+ memory + "cost " + cost ;
   }


    public int compareTo(compareble ob)
   {
       if(this.getCost() > ob.getCost())
           return 1;
       else
           return -1;
   }








}
