import java.util.*;
public class ArrayInput {
    public static int[]  Awa() {
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int i=0;
        while(i<size){
            System.out.println("enter the elemnt "+(i+1)+":");
            arr[i]=sc.nextInt();
            i++;
        }
        return arr;


    }
    
}
