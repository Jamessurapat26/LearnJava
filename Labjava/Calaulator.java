import java.util.Scanner;
public class Calaulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Calculator (+,-,*,/,%)");
        System.out.println("press + : Add");
        System.out.println("press - : Subtract");
        System.out.println("press * : Multiply");
        System.out.println("press / : Divide");
        System.out.println("press % : Modulo");

        System.out.println("Press operator ");
        char c = in.next().charAt(0);
        System.out.println("Press enter x ");
        int x =in.nextInt();
        System.out.println("Press enter y ");
        int y =in.nextInt();

        if(c=='+'){
            System.out.println(x+" + "+y+" = "+(x+y));
        }else if(c=='-'){
            System.out.println(x+" - "+y+" = "+ (x-y));
        }else if(c=='*'){
            System.out.println(x+" * "+y+" = "+(x*y));
        }else if(c=='/'){
            System.out.println(x+" / "+y+" = "+((float)x/y));
        }else if(c=='%'){
            System.out.println(x+" % "+y+" = "+((float)x%y));
        }

        System.out.println("Bye Bye !!!");





    }
}
