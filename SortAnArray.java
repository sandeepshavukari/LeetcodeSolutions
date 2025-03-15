public class SortAnArray  {
    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }
    public static void merge(int[] arr, int[] leftArray, int[] rightArray) {
        int a = arr.length; 
        int leftSide = a/2;
        int rightSide = a-leftSide;
        int l=0, r=0, k=0;
        while(l<leftSide && r<rightSide){
            if(leftArray[l] < rightArray[r]){
                arr[k] = leftArray[l];
                k++;
                l++;
            }else 
            {
                arr[k] = rightArray[r];
                k++;
                r++;
            }
        }
        while(l<leftSide){
            arr[k] = leftArray[l];
                k++;
                l++;
        }
        while (r<rightSide){
                arr[k] = rightArray[r];
                k++;
                r++;
        }
    }

    public static void mergeSort(int[] arr) {
        int length = arr.length;
        if(length<=1) return; 
        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        int i=0, j=0;
        for(; i<length; i++){
            if(i<middle){
                leftArray[i] = arr[i];
            }
            else {
                rightArray[j] = arr[i];
                j++;
            }
        }
            mergeSort(leftArray);
    mergeSort(rightArray);
    merge(arr, leftArray, rightArray);
    }  
}

