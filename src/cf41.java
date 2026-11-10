import java.util.Scanner;

public class cf41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if(s.length() != t.length()){
            System.out.println("NO");
            return;
        }
        int i = s.length()-1;
        int j = 0;
        while(i >=0 && j < t.length()){
            if(s.charAt(i)!=t.charAt(j)){
                System.out.println("NO");
                return;
            }
            i--;
            j++;
        }
        System.out.println("YES");
    }
}
