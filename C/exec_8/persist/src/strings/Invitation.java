package strings;

public class Invitation {

    public static void main(String[] args) {

        String sourceText = "[Its] language is as bare as a monk's cell, and as uninviting";
        String computedText = computeThoughts(sourceText);
        System.out.println(computedText);
    }

    /**
     * Metoda computeThoughts wykonuje przekształcenie przekazanej myśli do nowej, lepszej postaci.
     *
     * UWAGA: Szczegóły implementacyjne metody
     *
     * Krok 1:  Znajduje w przekazanym tekście źródłowym pierwsze słowo zaczynające się na literę 'i'.
     *
     * Krok 2.  Wycina znalezione słowo z tekstu źródłowego do późniejszego użycia. // is
     *
     * Krok 3.  Oblicza długość znalezionego słowa, zwiększa ją czterokrotnie i dodaje do niej 1. Wyliczona wartość
     *          zostaje zapamiętana do późniejszych obliczeń. // 2 * 4 + 1 = 9
     *
     * Krok 4.  Znajduje w tekście źródłowym pierwsze wystąpienie znaku `l` (litera el) i wycina z tekstu źródłowego
     *          fragment od tego znaku (włącznie) i kolejne X znaków (niewłącznie), gdzie X jest równe wartości wyliczonej w Kroku 3.
     *          Wartość zostaje zapamiętana do późniejszego użycia. //language 
     *
     * Krok 5.  Oblicza długość tekstu źródłowego, dzieli ją przez 1.17 i zwiększa o 1. Wyliczona wartość zostaje
     *          zapamiętana do późniejszych obliczeń.
     *
     * Krok 6.  Wycina z tekstu źródłowego fragment zaczynający się od indeksu o wartości Y (gdzie Y to wartość obliczona
     *          w Kroku 5.) oraz kolejnych 2 do potęgi 3-ej znaków. Wartość zostaje zapamiętana do późniejszego użycia
     *
     * Krok 7.  Zwraca połączenie tekstu "Java ", tekstu z Kroku 4., tekstu z Kroku 2., tekstu " ", tekstu z Kroku 6.
                oraz tekstu " \u003B\u0029".
     */
    public static String computeThoughts(String source) {
        // Tutaj uzupełnij implementację, aby była zgodną z algorytmem w dokumentacji metody.
		int indexOfFirstI = source.indexOf(" i");
		int endOfFirstWord = source.indexOf(" ", indexOfFirstI + 1);
		String krok2 = source.substring(indexOfFirstI + 1,endOfFirstWord);
			
			
		int krok3 = krok2.length() * 4 + 1;
		
		String krok4 = source.substring(source.indexOf("l"),source.indexOf("l") + krok3);
		
		int krok5 = (int) (source.length()/1.17 + 1);
		
		String krok6 = source.substring(krok5,krok5 + (int) Math.pow(2,3));
		
		
		
		//System.out.println(krok5);
        return "Java " + krok4 + krok2 + " " + krok6 + " \u003B\u0029";
    }
}
