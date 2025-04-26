package statics;

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

    public static String wordsMemory = "";
    public static String wordSeparator = ";";
    public static int currentWordIndex = 0;

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
        return "";
    }

    /*
        Metoda odczytuje kolejną linię z konsoli, aby wymusić działanie użytkownika
     */
    private static void waitForEnter() {
        ;
    }

    /*
        Metoda rozszerza dotychczas zapamiętane słowa o nowe słowo. Po każdym zapamiętanym słowie
        umieszczany jest symbol separatora
     */
    public static void memorizeWord(String word) {
        ;
    }

    /*
        Metoda odczytuje pojedyncze słowo z konsoli i je zwraca do dalszego przetwarzania
     */
    public static String getUserWord() {
        return "";
    }
}
