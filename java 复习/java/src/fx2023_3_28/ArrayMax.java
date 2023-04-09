package fx2023_3_28;

public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {1,5,3,4,7,3,7,10,222,316,679,2};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> max) {
                max = arr[i];
            }
        }
        System.out.println("max is "+max);
    }
}
