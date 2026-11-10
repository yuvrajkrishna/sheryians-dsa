import java.util.Scanner;

public class cf59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int u = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                u = u + 1;
            }
        }
        if(u <= s.length()-u){
            System.out.println(s.toLowerCase());
        }
        else{
            System.out.println(s.toUpperCase());
        }
    }
}
