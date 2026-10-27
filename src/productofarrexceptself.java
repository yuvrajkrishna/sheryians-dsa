import java.util.Arrays;

public class productofarrexceptself {
    static void main() {
        int arr[ ] =  {1,2,3,4};
        int prefix[] = new int [arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            int product = 1;
            for(int j = 0; j < arr.length ; j++){
                if(arr[i] != arr[j]){
                    product *= arr[j];
                }
            }
            prefix[i] = product;
        }
        System.out.println(Arrays.toString(prefix));
    }
}
