public class largestelem {
    static void main() {
        int arr[] = {10,30,20,50,30};
        System.out.println(max(arr,0,arr[0]));
    }
    static int max(int arr[],int i ,int max){
        if(i == arr.length){
            return max;
        }
        if(arr[i]>max){
            max  = arr[i];
        }
        return max(arr,i+1,max);
    }
}
