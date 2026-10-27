import java.util.Arrays;

public class dutchnationalflag {
    static void main() {
        int arr[] = {0,1,1,0,0,2,2,0,1};
        int mid =0 ;
        int low = 0;
        int high = arr.length-1;
        while(mid <= high){
            if(arr[mid] == 0){
                if(arr[low] == 0){
                    mid++;
                    low++;
                }
                else{
                    int temp = arr[mid];
                    arr[mid] = arr[low];
                    arr[low] = temp;
                    low++;
                    mid++;
                }
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else if(arr[mid] == 2 ){
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    mid++;
                    high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
