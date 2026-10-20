public class findsecondlargest {
    static void main() {
        int arr[] = {1,2,1,1,3,4};
        int max = arr[0];
        int sec = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                sec = max;
                max = i;
            }
            else if (i < max && i != max) {
                sec = i;
            }
        }
        System.out.println(sec);
    }
}
