import java.util.Scanner;
public class CountNoOfGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number of student : ");
        int n = sc.nextInt();
        char[] gg ={'A','B','C','D','F'};
         int []arr = new int [5];
        char []grade = new char[n];
        for(int i = 0;i < grade.length ; i++){
            System.out.println("Please enter grade of student No."+(i+1)+ " : ");
            grade[i] = sc.next().charAt(0);
            for(int j = 0;j<gg.length;j++){
                if(grade[i]==gg[j]){
                arr[j]+=1;
                }
            }
        }

        System.out.println("Grade Summary");
        for(int i = 0;i<arr.length;i++){
            System.out.print(gg[i]);
            printChar(arr[i]);
        }
    }
    public static void printChar (int n){
        for(int i = 0;i<n;i++){
            System.out.print(" * ");
        }
        System.out.println();
    }
    

}
