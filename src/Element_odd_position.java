public class Element_odd_position {
    public static void main(String[] args) {
        //Initializing an array
        int []arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        //loop for odd positions element using i=i+2
        System.out.println("Element at odd Position");
        for (int i=1;i<arr.length;i=i+2) {
            System.out.println( arr[i]);
        }
    }
}
