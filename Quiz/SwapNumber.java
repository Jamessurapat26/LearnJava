import java.util.Scanner;
public class SwapNumber {
    public static void main(String[] args) {
        int x,y,temp;

        System.out.println("Enter X and Y");

        Scanner in= new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();

        System.out.println("Before Swapping\nx="+x+"\ny="+y);

        temp=x;
        x=y;
        y=temp;

        System.out.println("After Swapping\n x="+x+"\ny="+y);

    }
}
