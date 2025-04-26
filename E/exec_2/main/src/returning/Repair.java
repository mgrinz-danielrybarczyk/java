package returning;

import java.util.Random;

public class Repair {

    public static void main(String[] args) {

        // Poniżej znajduje się kilka przypadków użycia 3 różnych metod.
        // Popraw implementacje lub deklaracje metod tak, aby dało się ich
        // użyć w poniższy sposób i przede wszystkim aby kod się kompilował

        double dProduct1 = multiply(1.0, 8.0);
        double dProduct2 = multiply(1, 8);
        int iProduct3 = (int) multiply(2.0, 16.);

        System.out.println("Kolejne wyniki: " + dProduct1 + ", " + dProduct2 + ", " + iProduct3);

        String cleared = clearFrom("J-a%-%v-%a", "%");
        clearFrom(cleared, "-");
        System.out.println(cleared);
        System.out.println(clearFrom("Hu$$ra$gan$", "$"));

        String word1 = tryRandomWord("Entliczek pentliczek czerwony guziczek");
        String word2 = tryRandomWord("Entliczek pentliczek czerwony koszyek");
        String word3 = tryRandomWord("Wpadła bomba do piwnicy");
    }

    public static void multiply(int a, double b) {
        double result = a * b;
    }

    public static String clearFrom(String text, String trash) {
        String result = "";
        int i = 0;
        do {
            if (text.substring(0, i + 1).equals(trash)) {
                result += text.charAt(i);
                return result;
            }
            else {
                return result;
            }
        } while (i < text.length());

        return result;
    }

    public static void String tryRandomWord(String text) {
        Random random = new Random();
        int begin = random.nextInt(text.length());
        int end = random.nextInt(text.length());

        if (begin > end) {
            return "";
        }
        int wordStart = text.substring(0, begin).lastIndexOf(" ");
        int wordEnd = text.indexOf(" ", end);

        String word = text.substring(wordStart + 1, wordEnd);
    }
}
