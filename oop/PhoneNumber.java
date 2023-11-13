public class PhoneNumber {
    private String number;

    public PhoneNumber(){

    }

    public PhoneNumber(String number){
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public int[] calFreq(){
        int []arr = new int[10];
        char ch ;
        for(int i = 0;i < number.length();i++){
            ch = number.charAt(i);
            switch (ch) {
                case '0': arr[0]+=1;
                    break;
                case '1': arr[1]+=1;
                    break;
                case '2': arr[2]+=1;
                    break;
                case '3': arr[3]+=1;
                    break;
                case '4': arr[4]+=1;
                    break;
                case '5': arr[5]+=1;
                    break;
                case '6': arr[6]+=1;
                    break;
                case '7': arr[7]+=1;
                    break;
                case '8': arr[8]+=1;
                    break;
                case '9': arr[9]+=1;
                    break;
            }
        }

        return arr;
    }

    // public String toString(){
        
    // }


}
