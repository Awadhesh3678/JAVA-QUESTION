import java.util.*;
public class SumAndAverageOfArray {
   
    public static void main(String[] args) {
        int[] numArray= ArrayInput.Awa();
        long sum=sum(numArray);
        int avg=average(numArray);
        System.out.println("sum opf array is : "+sum);
        System.out.println("averfage of arreay is : "+avg);

    }




    public static long sum(int[] numArray){
        long sum=0;
        int i=0;
        while(i<numArray.length){
            sum=sum+numArray[i];
            i++;
        }
        return sum;
    } 
    public static int average(int[] numArray){
        long sum=sum(numArray);
        long average= sum / numArray.length;
        return (int) average;
    } 

}