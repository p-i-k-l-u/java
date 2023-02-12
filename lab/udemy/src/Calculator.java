public class Calculator {
    private Floor floor;
    private Carpet carpet;
    public Calculator(Floor floor,Carpet carpet)
    {
       this.floor = floor;
       this.carpet = carpet;
    }
    double a =floor.getArea();
    double b = carpet.getCost();
    public double getTotalCost()
    {
        return a*b;
    }


}
