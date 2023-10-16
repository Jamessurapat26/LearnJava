import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        int number=0 ;
        do{
            do{
                System.out.print("number[1 to 12] : ");
                number=sc.nextInt();
                if(number>12||number<2){
                    System.out.println("invalid");
                }
            }while(number>12||number<2);
            
            for(int i = 1;i<=12;i++){
                System.out.println(number + " X " + i + " = "+(number*i));
            }
            System.out.print("Do you want to continue [y/n] : ");
            ch=sc.next().charAt(0);

        }while(ch =='y');
        System.out.print("Bye Bye ");
    }
}
