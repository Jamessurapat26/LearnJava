import java.util.Scanner;
public class DisplayTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] month = new int[12];
        String[] dd ={"January","February","March","April","May","June","July","August","September","October","November","December"};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int indexMax = -1;
        int indexMin = -1;

        for (int i = 0 ;i < 12 ;i++){
            System.out.print("Please enter temp of "+dd[i] + ": ");
            month[i]=sc.nextInt();
            if(max<month[i]){
                max = month[i];
                 indexMax = i;
            }if(min>month[i]){
                min = month[i];
                 indexMin = i;
            }
        }
              
        System.out.println("Maximum temp is "+max+" and "+max+" is a temp of "+ dd[indexMax]);
        System.out.println("Maximum temp is "+min+" and "+min+" is a temp of "+ dd[indexMin]);
        




    }
}
