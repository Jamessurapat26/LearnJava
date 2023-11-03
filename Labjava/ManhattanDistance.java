import java.util.Scanner;
public class ManhattanDistance {
    public static void main(String[] args) {
        int x1,x2,y1,y2;

        Scanner sc = new Scanner(System.in);

        System.out.print("P1 (x,y) : ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();

        System.out.print("P2 (x,y) : ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        System.out.println("Manhattan Distance = "+(Math.abs(x1-x2)+Math.abs(y1-y2)));

    }
}
