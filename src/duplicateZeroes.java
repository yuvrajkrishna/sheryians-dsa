import java.util.Arrays;

public class duplicateZeroes {
    static void main() {
        int arr[] = {0,4,1,0,0,8,0,0,3};
        int i = 0;
        int j = 1;
        while(j < arr.length) {
            if(arr[i] == 0 ) {
                for(int index = arr.length-1; index > j; index--) {
                    arr[index] = arr[index-1];
                }
                arr[j] = 0;
                i+=1;
                j = i+1;
            }
                i++;
                j++;

        }
        System.out.println(Arrays.toString(arr));
    }
}

