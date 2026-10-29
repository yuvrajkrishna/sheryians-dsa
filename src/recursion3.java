public class recursion3 {
    static void main() {
        int arr[] = {1,2,3,4,5};
        prt(arr,0);
    }
    static void prt(int arr[], int idx){
        if(idx == arr.length){
            return;
        }
        System.out.println(arr[idx]);
        prt(arr,idx+1);
    }
}
