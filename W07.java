import java.util.Scanner;

public class W07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if(a > 1){
            System.out.println(2 * a + 3);
        }
        else if(a < 1){
            System.out.println(3 * Math.pow(a , 2));
        }
        else{
            System.out.println(Math.pow(a , 3) + 3 * a - 3);
        }
    }
}
