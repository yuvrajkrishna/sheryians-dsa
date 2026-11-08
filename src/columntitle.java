import java.util.Scanner;

public class columntitle {
    static void main(){
        int arr[][] = {{1,1},{3,4},{-1,0}};
        int x = arr[0][0];
        int y = arr[1][0];
        int step = 0 ;
        for(int i = 1 ; i < arr[0].length ; i++){
            while(x < arr[0][i] && y < arr[1][i]){
                if(x < arr[0][i] && y < arr[1][i]){
                    x++;
                    y++;
                    step++;
                }
                else if(x > arr[0][i] && y > arr[1][i]){
                    x--;
                    y--;
                    step++;
                }
                else if(x == arr[0][i] && y < arr[1][i]){
                    y++;
                    step++;
                }
                else if(x == arr[0][i] && y > arr[1][i]){
                    step++;
                    y--;
                }
                else if(x < arr[0][i] && y == arr[1][i]){
                    step++;
                    x++;
                }
                else if(x > arr[0][i] && y == arr[1][i]){
                    step++;
                    x--;
                }
            }
            System.out.println(step);
        }
    }
}
