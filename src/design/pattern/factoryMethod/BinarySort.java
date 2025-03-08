package design.pattern.factoryMethod;

public class BinarySort {

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int reverseArray[]={50,40,30,20,10};
        int target =10;
        //int ans = binarySearch(arr,target);
        int ans = reverseBinarySearch(reverseArray,target);
        if(ans==-1)
        System.out.println("Not found");
        else{
            System.out.println(target +" Found at " + ans);
        }
    }

    static int binarySearch(int[] arr, int x) {
        int start = 0;
        int end = arr.length-1;
        int ans=-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                ans = mid;
                break;
            } else if (arr[mid] < x) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return ans;
    }

    static int reverseBinarySearch(int arr[], int target){
        int start =0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                ans = mid;
                break;
            } else if (arr[mid]< target) {
                end = mid -1;
            }else{
                start = mid + 1;
            }

        }
        return ans;
    }
}
