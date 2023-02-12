public class Demo {

        public void add(float...a)// Var-args method
        {
            float sum = 0;
            for(float x:a)// for each loop
            {
                sum = sum +x;
            }
            System.out.println("Sum of the numbers = "+ sum);
        }
    }
    class Main// main method
    {
        public static void main(String[] args)
        {
            /* / creating object */
            Demo obj =new Demo();
            obj.add();
            obj.add(3.4f,3.72f);
            obj.add(3.0f,5.70f,4.80f);

        }
    }

