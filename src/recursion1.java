public class recursion1 {
    static void main() {
        int n = 5;
        int factorail = fact(n);
        System.out.println(factorail);
    }
    static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
