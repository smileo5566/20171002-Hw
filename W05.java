import java.util.Scanner;

public class W05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = a%10;
        int c = (a/10)%10;
        int d = (a/100)%100;
        System.out.println(d+"\t"+"Hundred"+"\t"+c+"\t"+"Ten"+"\t"+b+"\t"+"dollar");
    }
}
