import java.util.Scanner;
public class RGBColorDifference {
    public static void main(String[] args) {
        int r1,g1,b1,r2,g2,b2;

        Scanner sc =new Scanner(System.in);
        System.out.print("RGB Color1 : ");
        r1 = sc.nextInt();
        g1 = sc.nextInt();
        b1 = sc.nextInt();

        System.out.print("RGB Color2 : ");
        r2 = sc.nextInt();
        g2 = sc.nextInt();
        b2 = sc.nextInt();

        System.out.println("Color Different = "+Math.sqrt(Math.pow(r2-r1,2)+Math.pow(g2-g1,2)+Math.pow(b2-b1,2)));



    }
}
