import java.util.Scanner;

public class cf734 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String s = input.next();
        int a = 0;
        int d = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'A'){
                a++;
            }
            else{
                d++;
            }
        }
        if(a > d){
            System.out.println("Anton");
        }
        else if(a == d){
            System.out.println("Friendship");
        }
        else{
            System.out.println("Danik");
        }
    }
}
