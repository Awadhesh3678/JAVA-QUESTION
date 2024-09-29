import java.util.Scanner;


//finding an elemnt in 2d array
public class SearchAnElementIn2DArray {
    public static void main(String[] args) {
        //Scanner sc=new Scanner("System .in");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the rows no.");
        int row= sc.nextInt();
        System.out.print("enter the no. of column");
        int column=sc.nextInt();
        int[][] arr= new  int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.println(arr);
                arr[row][column]=sc.nextInt();
            }

        }
        System.out.println("enter the element to be searched");
        int find=sc.nextInt();
        //finding element
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
               if(find==arr[row][column]){
                System.out.println("Element is at location "+ i +" "+j);
               }
            }

        }

    }
    
}
