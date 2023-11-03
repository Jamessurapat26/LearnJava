import java.util.Scanner;
public class DisplayOddAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Start number : ");
        int start = sc.nextInt();
        System.out.print("End number : ");
        int end = sc.nextInt();

        displayEven(start, end);
        displayOdd(start, end);
    }

    public static void displayEven(int n1,int n2){

        System.out.print("Even Number ");
        while(n1%2 != 0){
            n1++;
        }
        for(int i = n1;i <= n2;i += 2){
            System.out.print(i+" ");
        }

    }

    public static void displayOdd(int n1,int n2){
        System.out.println();
        System.out.print("Odd Number ");
        while(n1%2 == 0){
            n1++;
        }
        for(int i = n1;i <= n2;i += 2){
            System.out.print(i+" ");
        }
    }
}
