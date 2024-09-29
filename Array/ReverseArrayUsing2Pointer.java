public class ReverseArrayUsing2Pointer {
    //reversing an array in single array using two pointer
    public static void main(String[] args) {
        int[] arr=ArrayInput.Awa();
        System.out.print("Original Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        reverse(arr);

    }
    public static void reverse(int[] arr){
        //swapping
        int b=arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int a=0 ;
            a=arr[i];
            arr[i]=arr[b];
            arr[b]=a;
            b--;

        }
        System.out.println(" ");
        System.out.print("Reversed array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

