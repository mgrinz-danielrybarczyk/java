package methods;

import java.util.Scanner;

public class Parametrized {

    public static void main(String[] args) {
     
         /*
            1. Przekształć poniższy fragment kodu w metodę, aby dało się jej użyć do wyświetlenia
            popularności danego języka. Metoda powinna umożliwiać podanie języka i jego popularności
            w promilach (0,1 procenta).

            Wykorzystaj metodę do wyświetlenia popularności języków: Java (15,0%), Python (8,5%) oraz JavaScript (2,7%).

         */

			//languagePopularity();
			//languagePopularityParametrized("Java", 150);
     
         /*
            2. Przekształć poniższy fragment kodu w metodę, aby dało się jej użyć do wyświetlenia
            kwadratu (z gwiazdek) o wskazanym rozmiarze.

            Wykorzystaj metodę do wyświetlenia 4 kwadratów o różnych rozmiarach.

         */
		/* for(int i = 0; i < 4; i++){
			squareGenerator();
		 }
		*/
		//squareGeneratorParametrized(50);
         /*
            3. Napisz metodę, która poprosi użytkownika o podanie przeciwieństwa do wskazanego słowa.
            Metoda powinna przyjąć jako parametr słowo do wyświetlenia oraz słowo będące przeciwieństwem
            (poprawną odpowiedź). Metoda powinna wyświetlić użytkownikowi czy odpowiedział poprawnie czy nie.

            Wykorzystaj metodę do uzyskania odpowiedzi dla 4 słów.

         */
		 /*
		 
		 for(int i = 0; i < 4; i++){
			antagonistWord();
		 }
		 */
			
			//antagonistWordParametrized("Duzy", "Maly");
			
         /*
            4. Napisz metodę, która wyświetli nagłówek tekstu. Nagłówek powinien mieć ustalony rozmiar,
            np. 100 znaków i składa się z treści nagłówka oraz znaków "estetycznych". Znaki estetyczne,
            to np. znak "=" albo "*". Znaki estetyczne powinny być w równej ilości przed treścią nagłówka
            i po treści nagłówka. Między treścią nagłowka, a znakami estetycznymi musi wystąpić pojedyncza
            spacja.

            UWAGA: Jeżeli treść nagłowka będzie dłuższa od wskazanego rozmiaru nagłówka, to należy przyjąć,
            że rozmiar nagłowka jest równy długości treści powiększonej o 4 znaki. W ten sposób z lewej i z
            prawej strony treści zawsze będzie miejsce na przynajmniej jeden znak estetyczny i pojedynczą spację.

            Metoda jako parametry powinna przyjąć kolejno: rozmiar nagłówka, treść nagłówka oraz pojedynczy
            symbol reprezentujący znak estetyczny.

            Wykorzystaj metodę do wyświetlenia 3 nagłówków o różnej treści, długości i symolu estetycznym.

         */

    }
		public static void languagePopularity() {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Podaj język (Java, Python lub JavaScript): ");
			String language = scanner.next();
			System.out.print("Podaj wskaźnik popularności w promilach: ");
			int popularity = scanner.nextInt();	
			System.out.println(language + ": " + (popularity / 10) + "," + (popularity % 10) + "%");
		}
		
		public static void languagePopularityParametrized(String language, int popularity) {
			System.out.println(language + ": " + (popularity / 10) + "," + (popularity % 10) + "%");
		}
		
		public static void squareGenerator() {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Podaj rozmiar kwadratu: ");
			int size = scanner.nextInt();
			for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == 0 || row == (size - 1)) {
                    System.out.print("*");
                } else if (col == 0 || col == (size - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
				System.out.println();
			}
		}
		
		public static void squareGeneratorParametrized(int size) {
			for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == 0 || row == (size - 1)) {
                    System.out.print("*");
                } else if (col == 0 || col == (size - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
				System.out.println();
			}
		}
		
		public static void antagonistWord() {
		 String word = "Duzy";
		 String wordAntagonist = "Maly";
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Podaj słowo przeciwne: ");
		 String wordUser = scanner.next();
		 if (wordUser.equals(wordAntagonist)){
			 System.out.println("Okej jest git");
		 } else {
			System.out.println("To nie jest przeciwne słowo");
		 }
		}
		
		public static void antagonistWordParametrized(String word, String wordUser) {
		 String wordAntagonist = "Maly";
		 if (wordUser.equals(wordAntagonist)){
			 System.out.println("Okej jest git");
		 } else {
			System.out.println("To nie jest przeciwne słowo");
		 }
		}
		
		

}