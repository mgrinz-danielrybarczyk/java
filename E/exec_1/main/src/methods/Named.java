package methods;

import java.util.Random;
import java.util.Scanner;

public class Named {

    public static void main(String[] args) {
     someLogicMethod();
         /*
            1. Przekształć poniższy fragment kodu w metodę, aby dało się jej użyć do wyświetlenia
            10 linii myślników o losowej długości (z przedziału od 10 do 100 znaków)
		*/
		minusGenerator();
		

         /*
            2. Przekształć poniższy fragment kodu w metodę, aby użytkownik mógł podać 5 razy słowo,
            dla którego zostanie wyświetlone tyle gwiazdek, ile słowo ma znaków

         */
		for (int j = 0; j < 5; j++) {
			asterisksFromWordGenerator();
		}
		

     
         /*
            3. Napisz metodę, która wylosuje dwie liczby. Pierwsza liczba ma być z zakresu od 1 do 100.
            Druga liczba ma być z zakresu od 1 do 101, ale też większa od pierwszej liczby. Metoda ma wyświetlać
            kolejne liczby od pierwszej (włącznie) do drugiej (włącznie).

            Wykorzystaj metodę 3 razy.

         */
		 for (int j = 0; j < 3; j++) {
			valuesGenerator();
		 }	

     
         /*
            4. Napisz metodę, która wylosuje wartość procentową z zakresu od 1% do 100% i wyświetli
            symbol kropki tyle, ile procent zostało wylosowanych. Po kropkach powinna być wyświetlona
            odpowiednia wartość procentowa.

            Przykładowo, dla wylosowanej wartości 13% wynik powinien wyglądać jak niżej:

            ............. 13%

            Wykorzystaj metodę 3 razy.

         */
		 for (int j = 0; j < 3; j++) {
			dotsGenerator();
		 }

    }
		public static void minusGenerator() {
			Random r = new Random();
			int minusCount = 10 + r.nextInt(91);
			for (int i = 0; i < minusCount; i++) {
				System.out.print("-");
			}
			System.out.println();
		}
		
		public static void asterisksFromWordGenerator() {
			Scanner scanner = new Scanner(System.in);
			
				System.out.println("Podaj słowo: ");
				String word = scanner.next();
				System.out.print(word + ": ");
				for(int i = 0; i < word.length(); i++) {
					System.out.print("*");
				}
				System.out.println();		
		}
		
		public static void valuesGenerator() {
			Random r = new Random();
		
				int firstValue = 1 + r.nextInt(99);		 
				int secondValue = 0;
			 
				 while (secondValue <= firstValue) {
					 secondValue = 1 + r.nextInt(100);
				 }
				 System.out.println("Pierwsza wartosć: " + firstValue);
				 System.out.println("Druga wartosć: " + secondValue);
				 
				 int currentValue;
				 for (int i = 0; i <= (secondValue-firstValue); i++) {
					currentValue = firstValue + i;
					System.out.print(currentValue + " ");
				 }
		}
		
		public static void dotsGenerator() {
			 Random r = new Random();
			 
			 int dots = 1 + r.nextInt(99);
			 for (int i = 0; i < dots; i++) {
				 System.out.print(".");
			 }
			 System.out.println(dots + "%");
		}
		
		
		public static void someLogicMethod() {
            String text = "Narzędzia;Wierzchołki;Horyzont;Dym;Tarcza;Szkoła podstawowa;Gra w słowa;Koniequitt;Eukaliptus";
			
			String fragment;
			int separatorIndex = -1;
			int previousSeparatorIndex = separatorIndex;
			
			while (true) {
				separatorIndex = text.indexOf(";", separatorIndex + 1);
				if (separatorIndex == -1) {
					separatorIndex = text.length();
				}
				fragment = text.substring(previousSeparatorIndex + 1, separatorIndex);
				if (fragment.length() <= 5) {
					System.out.println(fragment + "(" + fragment.length() + ")");
				} else {
					String separatedFragment = "";
					for (int i = 0; i < fragment.length(); i++) {
						if (i % 5 == 0 && i != 0) {
							separatedFragment += '-';
						}
						char c = fragment.charAt(i);
						separatedFragment += c;
					}
					System.out.println(separatedFragment + "(" + fragment.length() + ")");
					
				}
				previousSeparatorIndex = separatorIndex;
				if (separatorIndex >= text.length()) {
					break;
				}
			}
        }

}