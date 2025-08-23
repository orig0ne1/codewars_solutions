import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SquareEveryDigit {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        System.out.println(squareEveryDigit(str));
    }

    public static String squareEveryDigit(String str) {
        StringBuilder sb = new StringBuilder();
        for (String element : str.split("")) {
            sb.append(square(element));
        }
        return sb.toString();
    }

    public static int square(String num) {
        return Integer.parseInt(num) ^ 2;
    }

}
