public class Recursion5 {
    public static boolean isSorted(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;
        }


//        if(arr[index] < arr[index + 1])
//        {
//            return isSorted(arr, index + 1);
//        }
//        else
//        {
//            return false;
//        }
        if (arr[index] >= arr[index + 1])
       {
            return false;
        }
          return isSorted(arr, index +1);

}



    public static void main(String[] args) {
        int arr[] = {1,3,55};
        System.out.println(isSorted(arr,0));
    }
}
