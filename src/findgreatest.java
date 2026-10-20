import java.util.Arrays;

public class findgreatest {
    static void main() {
        int arr [] = {1,2,3,5,3,4};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}
