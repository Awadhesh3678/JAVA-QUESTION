import java.util.*;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no.of row in array");
        int row=sc.nextInt();
        System.out.println("enter the no.of column in array");
        int col=sc.nextInt();

        int[][] arr=new int[row][col];
        System.out.println("enter the elements : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
                arr[i][j]=sc.nextInt();
            }
        }
        //printing an array

        System.out.println("Array is : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                //arr[i][j]=sc.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

        // summing  diagonal
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    sum +=arr[i][j];
                }
            }
            
        }
        System.out.println("sum of main diagonal is : "+ sum);

        int sum1=0;
        for(int i=row;i>=0;i--){
            for(int j=0;j<col;j++){
                if(i==j){
                    sum1 +=arr[i][j];
                }
            }
            
        }
        System.out.println("sum of main diagonal is : "+ sum1);
    }

}
