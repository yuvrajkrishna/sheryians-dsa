import java.util.Scanner;

public class one {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] a = new int[t];

            for (int i = 0; i < t; i++) {
                a[i] = sc.nextInt();
            }

            int [] b = new int[t];
            for (int i = 0; i < t; i++) {
                b[i] = a[i]*2;
            }
            
        }
    }
}