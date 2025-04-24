package conditionals;

import java.util.Random;
import java.util.Scanner;

public class MoreDecisions {

    public static void main(String[] args) {

        Random r = new Random();

        // -----------------------------------------------------------------------------------------
        // Zapisz poniższe linie korzystając z odpowiednich instrukcji warunkowych

        int number = -100 + r.nextInt(201);
		if (number > 0) {
			System.out.println("Liczba " + number + " jest dodania");
		} else if (number < 0) {
			System.out.println("Liczba " + number + " jest ujemna");
		} else
        System.out.println("Liczba " + number + " jest zerem");

        // -----------------------------------------------------------------------------------------
        // Zapisz poniższe linie korzystając z odpowiednich instrukcji warunkowych
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj numer miesiąca (0 - Styczeń, 11 - Grudzień): ");
        int monthNumber = scanner.nextInt();
		if (monthNumber == 0) {
			System.out.println("Styczeń");
		} else if (monthNumber == 1) {
			System.out.println("Luty");
		} else if (monthNumber == 2) {
			System.out.println("Marzec");
		} else if (monthNumber >= 3 && monthNumber <= 5) {
			System.out.println("Kwiecień lub Maj lub Czerwiec");
		} else if (monthNumber >= 6 && monthNumber <= 8) {
			System.out.println("Lipiec lub Sierpień lub Wrzesień");
		} else if (monthNumber >= 9 && monthNumber <= 11)
			System.out.println("Październik lub Listopad lub Grudzień");
		else {
			System.out.println("Niepoprawne dane");
		}

        // -----------------------------------------------------------------------------------------
        // Zapisz poniższe linie korzystając z odpowiednich instrukcji warunkowych
        //
        // TIP: W zadaniu skorzystaj z dodatkowych zmiennych typu boolean określających wystąpienie
        // danej pory roku
        System.out.println("Podaj dzień miesiąca (0 - pierwszy dzien miesiąca): ");
        int dayOfMonth = scanner.nextInt();
		
		boolean spring = (monthNumber == 2 && dayOfMonth >= 20 && dayOfMonth <= 30) || monthNumber == 3 || monthNumber == 4 || (monthNumber == 5 && dayOfMonth >= 0 && dayOfMonth < 20);
		boolean summer = (monthNumber == 5 && dayOfMonth >= 20 && dayOfMonth <= 29) || monthNumber == 6 || monthNumber == 7 || (monthNumber == 8 && dayOfMonth >= 0 && dayOfMonth < 22);
		boolean autumn = (monthNumber == 8 && dayOfMonth >= 22 && dayOfMonth <= 29) || monthNumber == 9 || monthNumber == 10 || (monthNumber == 11 && dayOfMonth >= 0 && dayOfMonth < 20);
		boolean winter = (monthNumber == 11 && dayOfMonth >= 20 && dayOfMonth <= 30) || monthNumber == 0 || monthNumber == 1 || (monthNumber == 2 && dayOfMonth >= 0 && dayOfMonth < 20);
		
		if (spring) {
			System.out.println("Wiosna");
		} else if (summer) {
			System.out.println("Lato");
		} else if (autumn) {
			System.out.println("Jesień");
		} else if (winter) {
			System.out.println("Zima");
		} else {
			System.out.println("Nieprawidłowe dane");
		}
    }
}
