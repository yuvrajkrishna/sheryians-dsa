import java.util.Arrays;

public class findsmallest {
    static void main() {
        int arr[] = {1,1,2,3,2,1,5};
        Arrays.sort(arr);
        if(arr[0] == arr[arr.length-1]){
            System.out.println("Not Min");
        }
        else{
            System.out.println("Min = " + arr[0]);
        }
    }
}
