package statements;
import java.util.Scanner;

public class Logic {

    public static void main(String[] args) {

        /*
            Napisz fragment kodu, który dla kodu waluty, ustawi jej pełną nazwę.
            Przyjmij, że obsługujemy następujące kody walut: PLN, USD, EUR, GBP.

            Dla waluty poza tym kodem powinna zostać ustawiona wartość: "Nieznany kod".
        */
        {
			Scanner scanner = new Scanner(System.in);
			
            String currencyFullName = "";
			String currencyCode = "";
			
			while (currencyFullName.isEmpty()) {
				System.out.println("Podaj kod waluty: ... bądź wpisz 'exit'");
				currencyCode = scanner.next().toUpperCase();
				
				if (currencyCode.equals("EXIT")) {
					System.out.println("Konniec programu");
					break;
				}
				
				switch (currencyCode) {
					case "PLN":
						currencyFullName = "Złoty";
						break;
					
					case "USD":
						currencyFullName = "Dolar";
						break;
					
					case "EUR":
						currencyFullName = "Euro";
						break;
					
					case "GBP":
						currencyFullName = "Funt";
						break;
					
					default:
						System.out.println("Nieznany kod");
					
				}
			}
			if (!currencyFullName.isEmpty()) {
            System.out.println("Pełna nazwa waluty dla kodu " + currencyCode + ": " + currencyFullName);
			}
        }

        /*
            Napisz fragment kodu, która dla wskazanego kraju ustawi jego stolicę. Obsłuż następujące kraje:
            Polska, Niemcy, Rosja, Anglia, Francja, Holandia, Czechy.

            Dla kraju poza wskazaną listą powinna zostać ustawiona wartość "Stolica nieznana".
        */
        {
			Scanner scanner = new Scanner(System.in);
			
            String country = "";
            String capital = "";
			
			while (capital.isEmpty()) {
				System.out.println("Podaj kraj: ... bądź wpisz 'exit'");
				
				country = scanner.next();
				
				if(country.equals("exit")) {
					System.out.println("Koniec programu...");
					break;
				}
				
				switch(country) {
					
					case "Polska":
					capital = "Warszawa";
					break;
					
					case "Niemcy":
					capital = "Berlin";
					break;
					
					case "Rosja":
					capital = "Moskwa";
					break;
					
					case "Anglia":
					capital = "Londyn";
					break;
					
					case "Francja":
					capital = "Paryż";
					break;
					
					case "Holandia":
					capital = "Amsterdam";
					break;
					
					case "Czechy":
					capital = "Praga";
					break;
					
					default:
					System.out.println("Stolica nieznana");
				}
				
				
			}
			if(!capital.isEmpty()) {
				System.out.println("Stolica dla " + country + ": " + capital);
			}
        }

        /*
            Napisz fragment kodu, który dla wskazanego kraju ustawi nazwę największego kraju sąsiadującego.
            Wielkość kraju określamy na podstawie ilości jego mieszkańców (populacji). Obsłuż przypadki dla
            krajów: Polska, Niemcy, Litwa, Ukraina, Czechy, Słowacja, Łotwa, Estonia.

            Dla krajów poza wskazaną listą powinna zostać ustawiona wartość "Brak informacji".

            HINT: Postaraj się tak ułożyć instrukcję switch, aby powtórzyć jak najmniej kodu.
        */
        {
			Scanner scanner = new Scanner(System.in);
            String country = "";
            String largestNeighbour = "";
			while(largestNeighbour.isEmpty()) {
				System.out.println("Podaj kraj z Europy... bądź wpisz 'exit'");
				country = scanner.next();
				
				if(country.equals("exit")) {
					System.out.println("Wyjście z programu");
					break;
				}
				
				switch(country) {
					case "Polska": case "Litwa": case "Łotwa": case "Estonia": case "Ukraina":
					largestNeighbour = "Rosja";
					break;
					
					case "Niemcy":
					largestNeighbour = "Francja";
					break;				
					
					case "Czechy":
					largestNeighbour = "Niemcy";
					break;		
					
					case "Słowacja":
					largestNeighbour = "Ukraina";
					break;		

					default:
					System.out.println("Brak informacji");
				}
			}
			if(!largestNeighbour.isEmpty()) {
				System.out.println("Największy sąsiad dla " + country + ": " + largestNeighbour);
				
			}
        }

        /*
            Napisz fragment kodu, który będzie odczytywał kolejne słowa od użytkownika. Każde odczytane
            słowo powinno być skonwertowane i wyświetlone. Jeżeli pierwsza litera jest duża,
            to słowo należy skonertować do małych liter. Jeżeli pierwsza litera nie jest duża, to słowo
            należy skonwertować do dużyćh liter.
            Pętla ma zostać przerwana gdy użytkownik poda słowo `quit`, słowo `end`, słowo `finish`
            lub dwa razy pod rząd poda to samo słowo (bez rozróżniania wielkości liter).

            HINT: Wykorzystaj pętle typu while(true) oraz połączenie instrukcji if oraz break dla różnych
            warunków wewnątrz pętli.
        */
        {
			Scanner scanner = new Scanner(System.in);
			String word = "";
			String previousWord = "";
			while (true) {
				System.out.println("Podaj słowo: ... ");
				word = scanner.next();
				
				if(word.equals("quit") || word.equals("end") || word.equals("finish")) {
					System.out.println("... koniec programu ...");
					break;
				}
				
				if(word.equalsIgnoreCase(previousWord)) {
					System.out.println("Powtórzyłeś słówka... koniec programu...");
					break;
				}
				

				
				if(Character.isUpperCase(word.charAt(0))) {
					word = word.toLowerCase();
					System.out.println("Skonwertowane słówka: " + word);
				}
				else if (!Character.isUpperCase(word.charAt(0))) {
					word = word.toUpperCase();
					System.out.println("Skonwertowane słówka: " + word);
				}
				
				previousWord = word;
			}
			
        }
    }
}
