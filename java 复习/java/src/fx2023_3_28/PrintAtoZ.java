package fx2023_3_28;

public class PrintAtoZ {
    public static void main(String[] args) {
        //a-z  A-Z
        for (char c = 'a' ;c <= 'z' ;c++){
            System.out.print(c+"\t");
        }
        System.out.println();
        for (char c = 'A' ;c <= 'Z' ;c++){
            System.out.print(c+"\t");
        }
    }
}
