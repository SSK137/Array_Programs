public class Element_Even_Position {
    public static void main(String[] args) {
        //Initializing an array
        int []arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        //loop for even positions element using i=i+2
        for (int i=0;i<arr.length;i=i+2) {
            System.out.println("Array elements are " + arr[i]);
        }
    }
}
