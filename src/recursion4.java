public class recursion4 {
    static void main() {
        int n = 4;
        int dig = countdigit(n,0);
        System.out.println(dig);
    }
    static int countdigit(int n,int i){
        if(n == 0){
            return i;
        }
        return countdigit(n/10,i+1);
    }
}
