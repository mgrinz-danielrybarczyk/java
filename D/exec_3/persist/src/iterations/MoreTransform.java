package iterations;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class MoreTransform {

    public static void main(String[] args) {

        // ----------------------------------------------------------------------------------------
        // Wykorzystaj instrukcje iteracyjne, aby wyświetlić liczby z podanego zakresu,
        // które są dwa razy większe od ostnio wyświetlonej liczby.

        int start = 0;
        int end = 1000000;
		
        int number = start;
		int previousNumber = 0;
		
		
		while(number <= end) {
			if (number >= previousNumber * 2) {
				System.out.println(number);
				previousNumber = number;
			}
			number = number + 1;
		}

        // -----------------------------------------------------------------------------------------
        // Wykorzystaj TYLKO instrukcje iteracyjne, aby wylosować 6 liczb, z których każda będzie różna.
        //

        Random r = new Random();
		
			int upperBound = 70;
			int lowerBound = 1;
		
			int n1 = lowerBound + r.nextInt(upperBound);
			
			int n2 = lowerBound + r.nextInt(upperBound);
			while (n2 == n1) {
				n2 = lowerBound + r.nextInt(upperBound);
			}
			
			int n3 = lowerBound + r.nextInt(upperBound);
			while (n3 == n2 || n3 == 1) {
				n3 = lowerBound + r.nextInt(upperBound);
			}
			
			int n4 = lowerBound + r.nextInt(upperBound);
			while (n4 == n3 || n4 == n2 || n4 == n1) {
				n4 = lowerBound + r.nextInt(upperBound);
			}
			
			int n5 = lowerBound + r.nextInt(upperBound);
			while (n5 == n4 || n5 == n3 || n5 == n2 || n5 == n1) {
				n5 = lowerBound + r.nextInt(upperBound);
			}			
			
		
		
        System.out.printf("Wylosowane liczby: %d, %d, %d, %d, %d, %n", n1, n2, n3, n4, n5);

        // ----------------------------------------------------------------------------------------
        // Wykorzystaj instrukcje interacyjne, aby zgadnąć tą samą liczbę co komputer.
        // Liczba jest z zakresu od 1 do 1000. Masz 10 prób.

        Scanner scanner = new Scanner(System.in);
        int computerNumber = 1 + r.nextInt(10);
        int userGuess = 0;
		
		for (int i = 0; i < 10 && userGuess != computerNumber; i ++) {
			System.out.print("Zgadnij moją liczbę (od 1 do 10), masz " + (10 - i) + " prób: ");
			userGuess = scanner.nextInt();
			if (userGuess == computerNumber) {
				System.out.println("Zgadłeś!");
				System.out.println("Udało Ci się zgadnąć, gratuluję!");
			} else if (userGuess < computerNumber) {
				System.out.println("Nie zgadłeś, za mało");
				
			} else {
				System.out.println("Nie zgadłeś, za dużo");
			}
		}
		if (userGuess != computerNumber) {
			System.out.println("Niestety zużyłeś wszystkie próby i nie zgadłeś. Moją liczbą było: " + computerNumber);
		}
		
        
    }
	
	
}
