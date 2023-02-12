import  java.util.Scanner ;
public class squareArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        int sum;
        System.out.println("Enter the number of elements you want to store: ");
        num = sc.nextInt();
        System.out.println("Elements are: ");
        int arr[] = new int[10];//obj
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
            arr[i] = arr[i]*arr[i];



        }

        System.out.println("After squaring the elements the array will be :");
        for(int i= 0;i<num;i++){
            System.out.println( " Square is  " + arr[i]);
        }



        sc.close();
    }
}
