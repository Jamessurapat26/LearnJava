import java.util.Scanner;

public class GradeSummary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number of student : ");
        int n = sc.nextInt();
        char[] gg ={'A','B','C','D','F'};
        
        char []grade = new char[n];
        for(int i = 0;i < grade.length ; i++){
            System.out.println("Please enter grade of student No."+(i+1)+ " : ");
            grade[i] = sc.next().charAt(0);
        }

        

        int []arr = new int [5];
        for(int i = 0;i<gg.length;i++){
            for(int j =0;j<grade.length;j++)
            if(grade[j]==gg[i]){
                arr[i]+=1;
            
            }
        }
        System.out.println("Grade Summary");
        System.out.print("A \t B \t C \t D \t F \t \n");
        for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i] +"\t" );
        }
    
        
    }
}
