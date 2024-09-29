import java.util.Scanner;

public class MinMaxElement {
    public static void main(String[] args) {
       int[] arr1=ArrayInput.Awa();
       int max1=max(arr1);
       int min1=min(arr1);
       System.out.println("max term is : "+max1);
       System.out.println("minimum term is : "+ min1);

    }
    public static int max(int[] arr1){
        int maximum=arr1[0];
        //int minimum=0;
        int i=0;
        while (i<arr1.length  ) {
            if(maximum<arr1[i]){
                maximum=arr1[i];
               
            }
            
            i++;
            
        }
        return maximum;
    }    
    public static int min(int[] arr1){
        //int maximum=0;
        int minimum=arr1[0];
        int i=0;
        while (i<arr1.length  ) {
            if(minimum>arr1[i]){
                minimum=arr1[i];
               
            }
            
            i++;
            
        }
        return minimum;
    }    

    
    
}
