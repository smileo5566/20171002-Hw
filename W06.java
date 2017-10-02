import java.util.Scanner;

public class W06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sc1 = 0, sc2 = 0, sc3 = 0;
        int a = scn.nextInt();
        if(a > 0){
            sc1++;
        }
        else if (a < 0){
            sc2++;
        }
        else{
            sc3++;
        }
        int b = scn.nextInt();
        if(b > 0){
            sc1++;
        }
        else if (b < 0){
            sc2++;
        }
        else{
            sc3++;
        }
        int c = scn.nextInt();
        if(c > 0){
            sc1++;
        }
        else if (c < 0){
            sc2++;
        }
        else{
            sc3++;
        }
        int d = scn.nextInt();
        if(d > 0){
            sc1++;
        }
        else if (d < 0){
            sc2++;
        }
        else{
            sc3++;
        }
        int f = scn.nextInt();
        if(f > 0){
            sc1++;
        }
        else if (f < 0){
            sc2++;
        }
        else{
            sc3++;
        }
        int g = scn.nextInt();
        if(g > 0){
            sc1++;
        }
        else if (g < 0){
            sc2++;
        }
        else{
            sc3++;
        }

        System.out.println("+="+sc1);
        System.out.println("-="+sc2);
        System.out.println("0="+sc3);


    }
}
