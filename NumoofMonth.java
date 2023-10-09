import java.util.Scanner;
public class NumoofMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter month number : ");
        int number = in.nextInt();

        if(number==2){
            System.out.println("28");
        }else if(number==4||number==6||number==9||number==11){
            System.out.println("30");
        }else System.out.println("31");
    }
}
