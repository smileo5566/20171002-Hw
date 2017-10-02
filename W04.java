import java.util.Scanner;

public class W04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if (a > b || b > c || a > c){
            System.out.println("False");
        }
        else if (a + b > c && a + c > b && b + c > a) {
            System.out.println("True");
        }

        else if (a + b < c || a + c < b || b + c < a) {
            System.out.println("False");
        }
    }
}

