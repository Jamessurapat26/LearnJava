import java.util.Scanner;
public class QueenContest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum1=0,sum2=0;
        
        System.out.print("Enter height : ");
        char c = in.next().charAt(0);
        if(c=='f'){
            double a = in.nextDouble();
            double b = in.nextDouble();
            a = a*12*2.54;
            b = b*2.54;

            sum1 =a+b;
        }else{
            sum1 =in.nextFloat();
        }
        System.out.print("Enter height : ");
        char h = in.next().charAt(0);
        if(h=='f'){
            double e = in.nextDouble();
            double f = in.nextDouble();
            e = e*12*2.54;
            f = f*2.54;

            sum2 = e+ f;
        }else{
            sum2 = in.nextFloat();
        }
        if(sum1<sum2)
            System.out.print("no.2 is tall");
        else if (sum1==sum2)
            System.out.print("equal");
        else if(sum1>sum2)
            System.out.print("no.1 is tall");
    }
}
