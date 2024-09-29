public class Palindrome {
    //check palindrom array
    public static void main(String[] args) {
        int[] arr=ArrayInput.Awa();
        int c=palindrom(arr);
        if(c==1){
            System.out.println("Array is palindrome");

        }
        else{
            System.out.println(" Array is not palindrom");
        }
    }

    public static int palindrom(int[] arr){
        int size=arr.length-1;
        int n=0;
       for(int i=0;i<arr.length/2;i++){
        if(arr[i]==arr[size]){
            n=1;
            size--;
        }

       }
       return n;
    }   
}
