package fx2023_3_28;

public class GoldTown {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 1; i <= 9 ;i++){
            for (int j = 10; j >= i; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
