package iterations;

import java.util.Scanner;
import java.time.LocalDateTime; // Klasa do pobierania daty i czasu
import java.time.format.DateTimeFormatter; // Klasa do formatowania daty i czasu



public class MoreGoTo {

    public static void main(String[] args) {

        /*
            Poniżej znajdują się zakomentowane bloki kodu z instrukcjami goto.
            Przeanalizuj działanie każdego z bloków kodu i zapisz pod nim analogiczny fragment kodu.
            Korzystaj z tych samych nazw zmiennych i operacji, ale wykorzystaj instrukcje iteracyjne
            `while`, `do while` albo `for`
         */

        /* 1. Fragment (dla pętli while)
        {
            1: int number = 1;
            2: long power = 1;
            3: power = power * number;
            4: number += 1;
            5: !(number <= 10) goto 7;
            6: goto 3;
            7: System.out.println("Silnia z 10, to: " + power);

        }
        */

        // Twój kod do 1. Fragmentu:
        {
			int number = 1;
			long power = 1;
			while (number <= 10) {
				power = power * number;
				number += 1;
			}
			System.out.println("Silnia z 10, to: " + power);
        }
		
		{
			long power = 1;
			for (int number = 1; number <= 10; number += 1) {
				power = power * number;
			}
			System.out.println("Silnia z 10, to: " + power);
		}

        /* 2. Fragment (dla pętli do-while)
        {
            1:  Scanner scanner = new Scanner(System.in);
            2:  int userChoice;
            3:  System.out.println("Wybierz opcje: ");
            4:  System.out.println("\t1. Wyświetl bieżącą datę");
            5:  System.out.println("\t2. Wyświetl bieżącą godzinę");
            6:  System.out.println("\t3. Wyświetl bieżącą datę i godzinę");
            7:  System.out.println("\t0. Zakończ");
            8:  System.out.println();
            9:  System.out.print("\tTwój wybór: ");
            10: userChoice = scanner.nextInt();
            11: System.out.println("Wybrałeś " + userChoice + ", wykonuje...");
            12: !(userChoice != 0) goto 14;
            13: goto 3;
            14: System.out.println("Zakończyłeś pracę z programem. Dziękujemy");
        }
        */

        // Twój kod do 2. Fragmentu:
        {
			
			Scanner scanner = new Scanner(System.in);
			int userChoice;
			LocalDateTime now = LocalDateTime.now(); // Pobierz obecną datę i godzinę
			do {
				System.out.println("Wybierz opcje: ");
				System.out.println("\t1. Wyświetl bieżącą datę");
				System.out.println("\t2. Wyświetl bieżącą godzinę");
				System.out.println("\t3. Wyświetl bieżącą datę i godzinę");
				System.out.println("\t0. Zakończ");
				System.out.println();
				System.out.print("\tTwój wybór: ");	
				
				userChoice = scanner.nextInt();
				
				System.out.println("Wybrałeś " + userChoice + ", wykonuje...");
				
				if (userChoice == 1) {
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Sformatuj datę i godzinę
					// Wyświetl datę i godzinę
					System.out.println("Obecna data: " + now.format(formatter));
				} else if (userChoice == 2) {
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
					System.out.println("Obecna godzina: " + now.format(formatter));
				} else if (userChoice == 3) {
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
					System.out.println("Obecna data i godzina: " + now.format(formatter));
				} else if (userChoice != 1 || userChoice != 2 || userChoice != 3) {
					System.out.println("Błędne dane...");
				}
			} while (userChoice != 0);
			System.out.println("Zakończyłeś pracę z programem. Dziękujemy");
        }

        /* 3. Fragment (dla pętli for)
        {
            1: int number = 0;
            2: int i;
            3: i = 0
            4: !(i < 100) goto 9;
            5: System.out.println("Kolejna liczba parzysta: " + number);
            6: number += 2;
            7: i += 1;
            8: goto 4;
            9: System.out.println("\n---- Wyświetlono " + i + " liczb parzystych! ----");
        }
        */

        // Twój kod do 3. Fragmentu:
        {
			int number = 0;
			int i;
			for (i = 0; i < 100; i++) {
				System.out.println("Kolejna liczba parzysta: " + number);
				number += 2;
			}
			System.out.println("\n---- Wyświetlono " + i + " liczb parzystych! ----");
        }
    }
}
