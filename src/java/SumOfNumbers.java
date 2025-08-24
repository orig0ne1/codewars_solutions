import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int last = scan.nextInt();
        System.out.println("Res: " + sumOfNumbers(first, last));
    }

    public static int sumOfNumbers(int first, int last) {
        int sum = 0;
        for(int i = first; i <= last; i++) {
            sum += i;
        }
        return sum;
    }
}
