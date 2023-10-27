import java.util.Scanner;

public class FindAboveMean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
         char ch   ;
        do {
            System.out.print("Enter number : ");
            n = sc.nextInt();

            int []number = new int[n];
            System.out.println("Enter "+n+ " Numbers : ");
            for(int i = 0;i<number.length;i++){
                number[i]=sc.nextInt();
            }
            double mean = mean(number);
            System.out.println("N0. above mean as : ");
            int j = 0;
            for(int i =0;i<number.length;i++){
                if(number[i]>mean){
                    System.out.print(number[i]+" ");
                    j++;
                }
            }

            System.out.println("Summary : "+j);

           
            System.out.print("Do you continue [y/n] : ");
            ch = sc.next().charAt(0);

        } while (ch == 'y');
    }  
    
    public static double mean(int []array){
        double sum = 0;
        for(int i =0 ; i<array.length;i++){
            sum += array[i];
        }
        System.out.println("Mean : "+(sum/array.length));
        return sum/array.length;
    }
}
