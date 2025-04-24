package encoding;
import java.nio.charset.Charset;


public class PolishCharacters {

    public static void main(String[] args) {
		System.out.println(Charset.defaultCharset());
        String polishCharactersTest = "ZaĹĽĂłĹ‚Ä‡ gÄ™Ĺ›lÄ… jaĹşĹ„";

        System.out.println(polishCharactersTest);
		
		System.out.println(System.getProperty("file.encoding"));
		
		System.out.println("Symbole ucieczki: ");
        System.out.println("Symbol \\n: Nowa linia poniżej\nTekst po nowej linii");
        System.out.println("Symbol \\t: Tabulator\tdziała tutaj");
        System.out.println("Symbol \\r: Powrót karetki (często nadpisuje linię)\rNadpisane");
        System.out.println("Symbol \\f: Podział strony (często nie widoczny w konsoli)\fKolejny tekst po \\f");
        System.out.println("Symbol \\\": Cudzysłów \"wewnątrz\" tekstu");
        System.out.println("Symbol \\\': Apostrof 'wewnątrz' tekstu");
        System.out.println("Symbol \\\\: Ukośnik \\ w środku tekstu");
		
		System.out.println(" ");
		
		System.out.println("Cztery dzwonki: ");
		System.out.print((char) 7);
		System.out.print('\u0007');
		System.out.print("\u0007");
		System.out.print(Character.toChars(7));

    }
}
