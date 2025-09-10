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
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
    }

    public static double multiply(double a, double b) {
        double result = a * b;
		return result;
    }

    public static String clearFrom(String text, String trash) {
        String result = "";
        int i = 0;
        do {
            if (!text.substring(i, i + 1).equals(trash)) {
                result += text.substring(i, i + 1);
            }
				i++;
        } while (i < text.length());

        return result;
    }

    public static String tryRandomWord(String text) {
        Random random = new Random();
        int begin = random.nextInt(text.length());
        int end = begin + random.nextInt(text.length() - begin);


        int wordStart = text.substring(0, begin).lastIndexOf(" ");
		
		if (wordStart < 0) {
			wordStart = 0;
		}
		
        int wordEnd = text.indexOf(" ", end);
		
		if (wordEnd < 0) {
			wordEnd = text.length();
		}

        String word = text.substring(wordStart + 1, wordEnd);
		return word;
    }
}