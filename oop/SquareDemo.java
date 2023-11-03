import java.util.Scanner;
public class SquareDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Square s1 = new Square();
        Square s2 = new Square();

        System.out.println("Enter width of 1st square : ");
        int w1 = sc.nextInt();
        System.out.println("Enter width of 2st square : ");
        int w2 = sc.nextInt();

        s1.setWidth(w1);
        s2.setWidth(w2);

        System.out.println("Display Square Information");
        System.out.println(s1.toString());
        System.out.println(s2.toString());

       

        System.out.println("Enter new width of 1st square : ");
        w1 = sc.nextInt();
        System.out.println("Enter new width of 2st square : ");
        w2 = sc.nextInt();

        s1.setWidth(w1);
        s2.setWidth(w2);

        System.out.println("Display Square Information");
        System.out.println(s1.toString());
        System.out.println(s2.toString());

    

    }
}
