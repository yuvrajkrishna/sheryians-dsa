import java.util.Scanner;

public class l2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(0);
        String result = Character.toUpperCase(c) + s.substring(1);
        System.out.println(result);
    }
}