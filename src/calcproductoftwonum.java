public class calcproductoftwonum {
    static void main() {
        int n1 = 20;
        int n2 = 20;
        int ans = product(n1,n2,0);
        System.out.println(ans);
    }
    static int product(int num1, int num2, int times){
        if (num1 == 0) {
            return times;
        }
        return product(num1-1,num2,times+num2);
    }
}
