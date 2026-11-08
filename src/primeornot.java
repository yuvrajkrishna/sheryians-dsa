
public class primeornot {
    public static void main(String[] args) {
        int num = 11;
        System.out.println(isPrime(num, 2));
    }

    static boolean isPrime(int num, int i) {
        if (num <= 1) {
            return false;
        }

        if (i == num) {
            return true;
        }

        if (num % i == 0) {
            return false;
        }

        return isPrime(num, i + 1);
    }
}
