public class MergeTwoArray {
    // Merge two sorted arrays
    public static void main(String[] args) {
        // Example sorted arrays
        int[] arr1 = ArrayInput.Awa();
        int[] arr2 = ArrayInput.Awa();
    

        int[] merging = merge(arr1, arr2);

        // Print merged array
        for (int i = 0; i < merging.length; i++) {
            System.out.print(merging[i]);
        }
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        // Merge arrays
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }
}
