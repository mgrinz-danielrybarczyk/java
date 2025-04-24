package iterations;

import java.util.Random;
import java.util.Scanner;

public class Transform {

    public static void main(String[] args) {

        // ----------------------------------------------------------------------------------------
        // Wykorzystaj instrukcje iteracyjne i warunkowe, aby wyświetlić wszystkie liczby
        // z podanego zakresu, które są podzielne przez 2 (liczby parzyste). Wartość 0 przyjmij za
        // liczbę parzystą

        int start = 0;
        int end = 10;
        
        System.out.println("Liczby parzyste z zakresu od " + start + " do " + end);
		
		/*while (number <= end) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
			number = number + 1;
		}
		*/
		
		for (int number = start; number <= end; number = number + 1) {
				if (number % 2 == 0) {
				System.out.println(number);
			}
		}

        // -----------------------------------------------------------------------------------------
        // Wykorzystaj TYLKO instrukcje iteracyjne, aby wylosować liczbę, która jest podzielna przez 3
        // i jednocześnie nie jest podzielna przez 4

        Random r = new Random();
        int randomNumber;
		int counter = 0;
		do {
			randomNumber = r.nextInt(100);
			counter = counter + 1;
		}
		while (!(randomNumber % 3 == 0 && randomNumber % 4 != 0));
			
		
        System.out.println("Liczba podziena przez 3 i niepodzielna przez 4: " + randomNumber);
        System.out.println("Test: " + randomNumber + " % 3 == 0? " + (randomNumber % 3 == 0));
        System.out.println("Test: " + randomNumber + " % 4 != 0? " + (randomNumber % 4 != 0));
		System.out.println("Losowanie odbyła się: " + counter + " razy");
		
		System.exit(0);

        // ----------------------------------------------------------------------------------------
        // Wykorzystaj instrukcje interacyjne, aby zgadnąć tą samą liczbę co komputer.
        // Liczba jest z zakresu od 1 do 10. Komputer przy każdej Twojej próbie losuje nową liczbe.

        Scanner scanner = new Scanner(System.in);
        int computerNumber, userGuess;

		do {
        computerNumber = 1 + r.nextInt(10);
        System.out.print("Zgadnij moją liczbę (od 1 do 10): ");
        userGuess = scanner.nextInt();
		if (userGuess == computerNumber) {
			System.out.print("Sukces :)");
		} else {
			System.out.print("Porażka.. Moja liczba to była: " + computerNumber  + " Losuję nową liczbę...");
			}
		}
		while (computerNumber != userGuess);
		
        System.out.println("Zgadłeś! Oboje pomyśleliśmy o " + computerNumber);
        System.out.println("(Czy na pewno? Moja liczba: " + computerNumber + ", Twoja liczba: " + userGuess);
    }
}
