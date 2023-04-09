package www.lycoris.random;

import java.util.Random;

public class Homework01 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i]=-1;
        }
        int index = 0;
        while (index < arr.length) {
            //index++;
            int num = random.nextInt(5);
            if(!Homework01.contains(arr,num)){
                arr[index++] = num;
            }
        }
        Homework01.print(arr);
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * 单独写个方法来判断数组中是否包含某个元素
     * @param arr 数组
     * @param key 元素
     * @return ture表示包含，false表示不包含
     */
    public static boolean contains(int[] arr,int key){
        //Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }
}
