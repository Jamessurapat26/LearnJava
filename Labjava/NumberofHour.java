import java.util.Scanner;
public class NumberofHour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours,minutes,time;

        System.out.print("Number of second = ");
        time = sc.nextInt();
        
        hours = time /3600;
        time %= 3600;

        minutes = time /60;
        time %= 60;

        System.out.println("seconds is approximately "+(hours)+"hours, "+(minutes)+" minute and"+time+" seconds");

        sc.close();


    }
}
