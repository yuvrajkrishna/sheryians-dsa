public class mountainarray {
    static void main() {
        int arr[] = {0,3,2,1};
        if(arr.length < 3){
            System.out.println(false);
            return;
        }
        int i = 0;
        while(i < arr.length-2 && arr[i]<arr[i+1]){
            i++;
        }
        int peak = arr[i];
        if(arr[i+1] == peak || arr[i-1] == peak){
            System.out.println(false);
            return;
        }
        i++;
        while(i < arr.length && arr[i]<peak && arr[i-1] > arr[i]){
            i++;
        }
        if(i == arr.length){
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
}
