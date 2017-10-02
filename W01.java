import java.util.Scanner;

public class W01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char a = scn.next().charAt(0);
        int b = (int)a;
        if (b >= 65 && b<=90){
            System.out.println("uppercase");
        }
        else if (b >= 97 && b <= 122){
            System.out.println("lowercase");
        }
        else {
            System.out.println("special character");
        }

    }
}
