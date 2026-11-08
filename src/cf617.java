import java.util.Scanner;

public class cf617 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if( n <= 5){
            System.out.println(1);
        }
        else {
            int num = 0;
            int i = 0;
            while(num < n){
                num+=5;
                i++;
            }
            System.out.println(i);
        }
    }
}
