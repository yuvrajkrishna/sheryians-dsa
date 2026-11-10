import java.util.Scanner;

public class cf266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int i = 0;
        int j = 1;
        int c = 0;
        while(j < s.length()){
            if(s.charAt(i) == s.charAt(j)){
                c++;
            }
            j++;
            i++;
        }
        System.out.println(c);
    }
}
