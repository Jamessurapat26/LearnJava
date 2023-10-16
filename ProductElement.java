import java.util.Scanner;
public class ProductElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        System.out.print("Enter matrix row and column : ");
        int row = sc.nextInt();
        int column = sc.nextInt();
        System.out.print("Start number : ");
        int start = sc.nextInt();
        int j;
        int sum=1;
        for(int i = 0;i<row;i++){
            for(j = 0 ; j < (column);j++,start++){
                System.out.print(start+" ");
                sum *= start;
            }

            System.out.println();
        }
        System.out.println(sum);
    }
}
