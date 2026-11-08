import java.util.Arrays;
import java.util.Scanner;

public class boyorgirl {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int c = 0;
        for(int i=0;i<arr.length;i++) {
            boolean isDistinct = true;
            for(int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if(isDistinct) {
                c++;
            }
        }
        if(c% 2 == 0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}
