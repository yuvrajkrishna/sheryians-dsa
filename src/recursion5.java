public class recursion5 {
    static void main() {
        int n = 1234;
        int r = reversenum(n,0);
        System.out.println(r);
    }
    static int reversenum(int n, int r){
        if(n == 0){
            return r;
        }
        int ls = n % 10;
        return reversenum(n/10,r*10+ls);
    }
}
