import java.util.Scanner;

public class FindTheParityOutlier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(getOutlier(arr));
    }

    public static int getOutlier(int[] arr) {
        int firstThreeEvenCount = 0;
        for (int i = 0; i < Math.min(3, arr.length); i++) {
            if (arr[i] % 2 == 0) {
                firstThreeEvenCount++;
            }
        }
        boolean mostAreEven = firstThreeEvenCount >= 2;
        for (int j : arr) {
            if ((j % 2 == 0) != mostAreEven) {
                return j;
            }
        }
        return 0;
    }
}
