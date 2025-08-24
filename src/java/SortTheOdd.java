import java.util.*;

public class SortTheOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(sortTheOdd(arr)));
    }

    public static int[] sortTheOdd(int[] arr) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int el : arr) {
            if (el % 2 == 0) even.add(el);
            else odd.add(el);
        }
        Collections.sort(odd);
        odd.addAll(even);
        return odd.stream().mapToInt(Integer::intValue).toArray();
    }
}
