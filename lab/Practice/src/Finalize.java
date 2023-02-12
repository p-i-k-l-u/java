public class Finalize {

    public static void main(String[] args) {
        String s = new String("Piklu");
        Finalize a = new Finalize();
        a = null;

        //Requesting JVM to call Garbage collector
        System.gc();
        System.out.println("MAin Complete ");
    }

     public void finalize()
    {
        System.out.println("finalize methode overridden ");
    }
}
