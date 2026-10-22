public class fibonaccinum {
    static void main() {
        int n = 3;
        int a = 0 ;
        int b = 1;
        int c = 0;
        if(n == 0){
            System.out.println(0);
        }
        int i = 2;
        while(i <= n){
            int sum = a + b;
            a = b ;
            b = sum;
            i++;
        }
        System.out.println(b);
    }
}
