import java.util.Arrays;

public class findsmallest {
    static void main() {
        int arr[] = {1,1};
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        if(min == arr[0]) {
            System.out.println("no smallest");
        }
        else  {
            System.out.println("smallest = " + min);
        }
    }
}
