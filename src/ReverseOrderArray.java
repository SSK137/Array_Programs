public class ReverseOrderArray {
    public static void main(String[] args) {
        //Initializing an array
        int arr[] =new int[]{10,20,30,40,50};
        //loop for printing original array
        System.out.println("Normal Array");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("After Reverse Array ");
        for (int j =arr.length-1; j>=0; j--)
        {
            System.out.println(arr[j] );
        }
    }
}
