import java.util.Scanner;
public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,i=0;
        int secretnumber;

        do{
        System.out.println("Key in your guess number : ");
        number = sc.nextInt();
        secretnumber = 50;
        if(number > secretnumber){
            System.out.println("Try lower");
        }else if(number < secretnumber){
            System.out.println("Try higher");
        }else if(number == secretnumber){
            System.out.println("congratulation");
        }

        i++;
        }while(number != secretnumber);

        System.out.println(i);
        
    }
}
