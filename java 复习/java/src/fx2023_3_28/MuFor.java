package fx2023_3_28;

public class MuFor {
    public static void main(String[] args) {
        for(int i = 1; i <= 9 ;i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j+"*"+i + "=" + i*j +"\t");
            }
            System.out.println();
        }
    }
}
