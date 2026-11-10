import java.util.Scanner;

public class cf677 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int c = 0 ;
        for(int i = 0; i < n; i++){
            int p = sc.nextInt();
            int count = 0;
            while(p > 0){
                count++;
                p -= h;
            }
            c += count;
        }
        System.out.println(c);
    }
}
