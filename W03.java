import java.util.Scanner;

public class W03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if (a % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
