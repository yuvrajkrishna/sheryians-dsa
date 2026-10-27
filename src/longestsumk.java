import java.util.HashMap;

public class longestsumk {
    static void main() {
        int arr[] = {2,0,0,-1,2,0,3};
        int k = 3;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int maxlen = 0;
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
            if(sum == k){
                maxlen = i+1;
            }
            int rem = sum - k;
            if(map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxlen = Math.max(maxlen,len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        System.out.println(maxlen);
    }
}
