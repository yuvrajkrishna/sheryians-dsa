public class recursion2 {
    static void main() {
        int n = 5;
        int ans = sum(n);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
}
