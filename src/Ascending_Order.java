public class Ascending_Order {
    public static void main(String[] args) {
        //Initialization of array
        int []arr = new int[] {1,3,9,0,5,7,2,4,8};
        int temp = 0;

        //Displaying elements of original array
        System.out.println(" original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Sort the array in ascending order
        for (int i = 0; i<arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //Displaying elements of array after sorting
        System.out.println("\nAarray sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
