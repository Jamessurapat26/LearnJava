public class calFreq {
    public static void main(String[] args) {
        
        PhoneNumber []ph = new PhoneNumber[2];
        int []arr = new int[10];

        ph[0] = new PhoneNumber("0819866339");
        ph[1] = new PhoneNumber("0868884561");

        System.out.println("We have 2 Phone number ");
        System.out.println("Phone number 1 is " + ph[0].getNumber());

        System.out.println("Digit summary ");
        arr = ph[0].calFreq();
        disPlay(arr);

        System.out.println("Phone number 2 is " + ph[1].getNumber());

        System.out.println("Digit summary ");
        arr = ph[1].calFreq();
        disPlay(arr);
    }
    public static void disPlay(int []arr){
        for(int i = 0 ; i < arr.length ;i++){
            if(arr[i]>0){
                System.out.print(i + " ");
            for(int j = 0 ;j < arr[i];j++){
                System.out.print(" *");
            }
            System.err.println();
            }
            
            
        }
    }
}
