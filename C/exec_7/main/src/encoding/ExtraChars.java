package encoding;

public class ExtraChars {

    public static void main(String[] args) {

        System.out.println("Symbole do budowania labiryntu:");
        System.out.println("\u2550");   // Pozioma ściana labiryntu
        System.out.println("\u2551");   // Pionowa ściana labiryntu
        System.out.println("\u2554");   // Lewy górny narożnik labiryntu
        // Kolejne symbole reprezentujące ściany labirytnu występują z przesunięciem o 3
        // Wszystkich takich symboli jest jeszcze 8
		System.out.println("\u2557");
		System.out.println("\u255A");
		System.out.println("\u255D");
		System.out.println("\u2560");
		System.out.println("\u2563");


        System.out.println("Symbole do gry w szachy:");
        System.out.println("\u2654");   // Figura białego króla do szachów
        // Wyświetl pozostałe figury - są to kolejne liczby zapisane w notacji Unicode
		System.out.println("\u2655");
		System.out.println("\u2656");
		System.out.println("\u2657");
		System.out.println("\u2658");
		System.out.println("\u2659");
		System.out.println("\u265A");
		System.out.println("\u265B");
		System.out.println("\u265C");
		System.out.println("\u265D");
		System.out.println("\u265E");
		System.out.println("\u265F");

        System.out.println("Symbole reprezentujące emotikony:");
        System.out.println(Character.toChars(0x1F600));  // Uśmiechnięty emotikon
        // Wyświetl kolejne 10 znaków
		System.out.println(Character.toChars(0x1F601));
		System.out.println(Character.toChars(0x1F602));
		System.out.println(Character.toChars(0x1F603));
		System.out.println(Character.toChars(0x1F604));
		System.out.println(Character.toChars(0x1F605));
		System.out.println(Character.toChars(0x1F606));
		System.out.println(Character.toChars(0x1F607));
		System.out.println(Character.toChars(0x1F608));
		System.out.println(Character.toChars(0x1F609));
		System.out.println(Character.toChars(0x1F60A));
		
		System.out.println("\n");
		System.out.println("\t");
		System.out.println("\r");
		System.out.println("\f");
		System.out.println("\"");
		System.out.println("\'");
		System.out.println("\\");
		
		System.out.print((char) 7);
		System.out.print('\u0007');
		System.out.print("\u0007");
		System.out.print(Character.toChars(7));

	
		
    }
}
