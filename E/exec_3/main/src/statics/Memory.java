package statics;

import java.util.Scanner;
/*
    Przykładowa interakcja z użytkownikiem:

    > Podaj kolejne słowo ('quit' aby zakończyć): koń
    > Podaj kolejne słowo ('quit' aby zakończyć): pies
    > Podaj kolejne słowo ('quit' aby zakończyć): maczuga
    > Podaj kolejne słowo ('quit' aby zakończyć): wierzchołek
    > Podaj kolejne słowo ('quit' aby zakończyć): quit
    >
    > -----------------------------------------------------
    >
    > Naciskaj enter aby wyświetlać kolejne zapamiętane słowa
    > koń
    > pies
    > maczuga
    > wierzchołek

 */
public class Memory {

    private static String wordsMemory = "";
    private static String wordSeparator = ";";
    private static int currentWordIndex = 0;

    public static void main(String[] args) {

        while (true) {
            System.out.print("Podaj kolejne słowo ('quit' aby zakończyć): ");
            String word = getUserWord();
            if ("quit".equals(word)) {
                break;
            }
            if ("".equals(word.trim())) {
                continue;   // Ignorujemy puste teksty, bo szkoda je zapamiętywać
            }
            memorizeWord(word);
        };

        System.out.println("\n-----------------------------------------------------\n");

        System.out.print("Naciskaj enter aby wyświetlać kolejne zapamiętane słowa");
        while (true) {
            waitForEnter();
            String word = nextWord();
            if ("".equals(word)) {
                break;
            }
            System.out.print(word);
        }
    }

    /*
        Metoda zwraca następne słowo. Każde jej wywołanie powoduje zwrócenie nowego słowa.
        Kiedy nie ma kolejnego słowa, to metoda zwraca pusty tekst
     */
    private static String nextWord() {
		
		if (currentWordIndex >= wordsMemory.length()) {
			return ""; // nie ma więcej słów
		}
		
		int separatorIndex = wordsMemory.indexOf(wordSeparator, currentWordIndex);
		
		if (separatorIndex == -1) {
			return ""; // nie ma już separatorów -> brak słów
		}
		
		String word = wordsMemory.substring(currentWordIndex, separatorIndex);
		currentWordIndex = separatorIndex + 1;
        return word;
    }

    /*
        Metoda odczytuje kolejną linię z konsoli, aby wymusić działanie użytkownika
     */
    private static void waitForEnter() {
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
    }

    /*
        Metoda rozszerza dotychczas zapamiętane słowa o nowe słowo. Po każdym zapamiętanym słowie
        umieszczany jest symbol separatora
     */
    public static void memorizeWord(String word) {
        wordsMemory += word + wordSeparator;
    }

    /*
        Metoda odczytuje pojedyncze słowo z konsoli i je zwraca do dalszego przetwarzania
     */
    public static String getUserWord() {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
        return word;
    }
}
