package Array;

public class Array {

    public static void movNTimes(Object[] arr, int N){
        for(int indext = 0; indext < N; indext++) {
            for (int ind = arr.length / 2 - 1; ind > 0; ind--) {
                Object temp = arr[ind];
                arr[ind] = arr[ind-1];
                arr[ind-1] = temp;
                Object temp1 = arr[ind + arr.length/2];
                arr[ind + arr.length/2] = arr[ind + arr.length/2 -1];
                arr[ind + arr.length/2 - 1] = temp1;
            }
        }
    }

    public static void printArray(Object[] arr){
        for (Object object : arr) {
            System.out.println(object);
        }
    }
}
