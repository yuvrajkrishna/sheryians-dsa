import java.util.Scanner;

public class cf791 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        if(a == b){
            System.out.println(c+1);
            return;
        }
        else if(a > b){
            System.out.println(c);
            return;
        }
        else{
            while(a <= b){
                a = a*3;
                b = b*2;
                c++;
            }
            System.out.println(c);
        }
    }
}
