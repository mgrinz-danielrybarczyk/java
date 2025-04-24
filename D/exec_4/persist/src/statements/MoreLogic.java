package statements;
import java.util.Scanner;
import java.util.Locale;

public class MoreLogic {

    public static void main(String[] args) {

        /*
            Napisz fragment kodu, który dla podanej kwoty w PLN oraz kodu waluty,
            wyświetli wartość tej kwoty w podanej walucie.

            Przyjmij następujące przeliczniki:

            1 USD = 3.7989
            1 EUR = 4.2599
            1 GBP = 4.7821
            1 CHF = 3.8013

            Przykładowo, dla kwoty w PLN 37.989, i kodzie waluty USD, powinna zostać wyświetlona
            kwota wynikową 10.000.

            Dla kodu nieobsługiwanej waluty powinna zostać zwrócona oryginalna kwota, ale ze znakiem minus.
        */
		
        /*{
			Scanner scanner = new Scanner(System.in);
			
			double convertedValue = 0.0;

				System.out.println("Podaj kwotę w PLN: ...");
				double plnValue = scanner.nextInt();
				System.out.println("Do jakiej waluty mam przekonwertować? ...");
				String currencyCode = scanner.next();
				
				
				switch(currencyCode) {
					case "USD":
					convertedValue = plnValue / 3.7989;
					break;
					
					case "EUR":
					convertedValue = plnValue / 4.2599;
					break;
					
					case "GBP":
					convertedValue = plnValue / 4.7821;
					break;
					
					case "CHF":
					convertedValue = plnValue / 3.8013;
					break;
					
					default:
					convertedValue = plnValue * (-1);
					
				}
				System.out.println("Wartość " + plnValue + " PLN w " + currencyCode + " = " + convertedValue);
			

            
        }*/

        /*
            Napisz fragment kodu, który dla podanej nazwy miesiąca oraz podanego dnia w miesiącu wyświetli
            informacje o porze roku. Informacje o dniu wykorzystaj tylko w tych przypadkach, gdy ma on znaczenie dla określenia pory
            roku (np. w marcu lub w czerwcu).

            Nazwa miesiąca powinna być poprawną nazwą miesiąca. Wielkość liter nie ma znaczenia.
            Numer dnia danego miesiąca powinien być z zakresu od 1 (włącznie) do 31 (włącznie).

            W przypadku niepoprawnej nazwy miesiąca powinna być wyświetlona informacja "Nie można określić pory roku".

        */
        /*{
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Podaj miesiąc: ...");
            String monthName = scanner.next().toLowerCase(new Locale("pl"));
			
			System.out.println("Podaj nr dnia: ...");
            int dayOfMonth = scanner.nextInt();

            String season = "";
			
			
				
				switch (monthName) {
					case "styczeń": case "luty":
					season = "zima";
					break;
					
					case "marzec":
					if (dayOfMonth < 21 && dayOfMonth > 0) {
						season = "zima";
					} else {
						season = "wiosna";
					}
					break;
					
					case "kwiecien": case "maj":
					season = "wiosna";
					break;
					
					case "czerwiec":
					if (dayOfMonth < 21 && dayOfMonth > 0) {
						season = "wiosna";
					} else {
						season = "lato";
					}
					break;
					
					case "lipiec": case "sierpień":
					season = "lato";
					break;
					
					case "wrzesień":
					if (dayOfMonth < 23 && dayOfMonth > 0) {
						season = "lato";
					} else {
						season = "jesien";
					}
					break;
					
					case "październik": case "listopad":
					season = "jesien";
					break;
					
					case "grudzień":
					if (dayOfMonth < 22 && dayOfMonth > 0) {
						season = "jesien";
					} else {
						season = "zima";
					}
					break;
					
					default:
					System.out.println("Nie można określić pory roku...");
				}
				System.out.println("Dla miesiąca " + monthName + " oraz dnia " + dayOfMonth + " mamy porę roku: " + season);
			
			

            
        }*/

        /*
            Napisz fragment kodu, który wyświetli osobno napisy z podanego tekstu. Napisy są rozdzielone
            średnikiem. Dla każdego napisu powinna być również wyświetlona informacja o jego długości
            Jeżeli napis jest dłuższy niż 5 znaków, to powinny być wyświetlone wszystkie, kolejne jego
            5 znakowe fragmenty, np. rozdzielone znakiem myślnika.
            Jeżeli któryś z 5 znakowych członów będzie słowem `quitt`, to kod ma się zakończyć.
        */
        {
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
}
