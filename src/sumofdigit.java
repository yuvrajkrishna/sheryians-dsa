public class sumofdigit {
    static void main() {
        int n = 12;
        int sum = sumofdigit(n,0);
        System.out.println(sum);
    }
    static int sumofdigit(int n,int i){
        if(n == 0){
            return i;
        }
        int ls = n %10;
        return sumofdigit(n/10,i+ls);
    }
}
