package fx2023_3_28;

public class PopSort {
    public static void main(String[] args) {
        int[] arr = {6, 9, 5, 1, 8, 34, 4, 43, 8, 10};
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j]> arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    res[j] = arr[j];
                    res[j+1] = arr[j+1];
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
