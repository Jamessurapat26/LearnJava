import java.util.Scanner;
public class SmsDemo {
    public static void main(String[] args) {
        

        SMS s1 = new SMS("4888051");
        SMS s2 = new SMS("494999");
        SMS s3 = new SMS("4880851");

    
        System.out.println("SMS Number : " + s1.toString());
        s1.readAs();
        System.err.println();


        System.out.println("SMS Number : "+s2.toString());
        s2.readAs();
        System.err.println();
        

        System.out.println("SMS Number : " + s3.toString());
        s3.readAs();
        System.err.println();

        if (s1.getNumber().equals(s2.getNumber())) {
            System.out.println("Sms number 1 is equal to sms number 2");
            
        }else{
            System.out.println("Sms number 1 is not equal to sms number 2");
            
        }

        if (s1.getNumber().equals(s3.getNumber())) {
            System.out.println("Sms number 1 is equal to sms number 3");
            
        }else{
            System.out.println("Sms number 1 is not equal to sms number 3");
            
        }


    }
}
