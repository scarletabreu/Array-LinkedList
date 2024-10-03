package Array;

public class Array {

    public static void movNTimes(Object[] arr, int N){
        for(int indext = 0; indext < N; indext++) {
            if(indext%2==0)
            for (int ind = arr.length / 2 - 1; ind > 0; ind--) {
                Object temp = arr[ind];
                arr[ind] = arr[ind-1];
                arr[ind-1] = temp;
            }
            else
            for (int ind = arr.length - 1; ind > arr.length/2; ind--) {
                Object temp = arr[ind];
                arr[ind] = arr[ind-1];
                arr[ind-1] = temp;
            }
        }
    }

    public static void printArray(Object[] arr){
        for (Object object : arr) {
            System.out.println(object);
        }
    }
}
