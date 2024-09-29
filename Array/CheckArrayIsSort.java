public class CheckArrayIsSort{
   
    public static void main(String[] args) {
        int[] sorted=ArrayInput.Awa();
        int no=sum(sorted);
        if(no==0){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }    
    public static int sum ( int[] sorted){
            int i=0;
            int n=5;
            while(i<sorted.length-1){
                
                if(sorted[i]<sorted[i+1] ){
                    n=0;
                }
                else{
                    n++;
                }
                i++;

            }
            return n;
    }

       
    
}
