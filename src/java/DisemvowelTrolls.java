import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class DisemvowelTrolls {
    static char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите что-нибудь:");
        String input = reader.readLine();
        System.out.println(sayNoToTrolls(input));
    }

    public static String sayNoToTrolls(String comment){
        StringBuilder sb = new StringBuilder();
        List<Character> charList = comment.chars()
                .mapToObj(c -> (char) c)
                .toList();
        for (Character c : charList) {
            if (isVowel(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static boolean isVowel(char c) {
        for(char vowel : vowels) {
            if (vowel == c) return true;
        }
        return false;
    }
}
