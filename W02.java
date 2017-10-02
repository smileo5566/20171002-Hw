import java.util.Scanner;

public class W02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char a = scn.next().charAt(0);
        int b = (int)a;
        if (b >= 65 && b <= 90){
            b = b + 32;
            char c = (char)b;
            System.out.println(c);
        }
        else if (b >= 97 && b <= 122){
           b = b -32;
           char c = (char)b;
            System.out.println(c);
        }


    }
}

