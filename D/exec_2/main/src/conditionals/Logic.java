package conditionals;

import java.util.Random;
import java.util.Scanner;

public class Logic {

    public static void main(String[] args) {

        Random r = new Random();

        /*
            Mając podany dzień tygodnia wyświetl komunikat mówiący, czy jest to:
            - dzień ood poniedziałku do czwartku,
            - piątek
            - weekend.

            Przyjmij, że dni numerujemy od 0 (poniedziałek)
         */
        {
            int weekDay = r.nextInt(7);
			if (weekDay <=3) {
				System.out.println("Dzisiaj jest nr dnia od poniedziałku do czwartku, a dokładnie: " + weekDay);
			}
			else {
				if (weekDay == 4) {
					System.out.println("Dzisiaj jest nr dnia piątku, czyli:  " + weekDay);
				}
				else {
					System.out.println("Dzisiaj jest nr dnia weekendowy, czyli:  " + weekDay);
				}
			}
        }

        /*
            Mając podany dzień tygodnia oraz godzinę wyświetl komunikat mówiący, że trzeba już
            wstać. Przyjmij, że trzeba wstać gdy:
            - jest od wtorku do czwartku po 7 rano,
            - jest poniedziałek po 8 rano,
            - jest weekend po 10 rano.
         */
        {
            int weekDay = r.nextInt(7);
            int hour = 4 + r.nextInt(8);
			if (weekDay == 0 && hour > 8) {
				System.out.println("Wstawaj jest dzień: " + weekDay + "poniedziałek i jest godzina " + hour);
			}
			else {
				if (weekDay > 0 && weekDay < 4 && hour > 7) {
					System.out.println("Wstawaj jest dzień: " + weekDay + " i jest godzina " + hour);
				}
				else {
					if (weekDay > 3 && hour > 10) {
						System.out.println("Wstawaj jest dzień: " + weekDay + " weekendowy i jest godzina " + hour);
					}
					else {
						System.out.println("Śpij spokojnie");
					}
				}
			}
        }

        /*
            Mając trzy liczby określ, która z liczb jest największa. Wynik przypisz do zmiennej
            result
         */
        int result = -1;
		int a = r.nextInt(10);
        int b = r.nextInt(10);
        int c = r.nextInt(10);
        {

			if (a > b && a > c) {
				result = a;
			}
			else {
				if (b > a && b > c) {
					result = b;
				}
				else {
					if (c > a && c > b) {
						result = c;
					}
				}
			}
        }
        System.out.println("Największa z liczb: " + result);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);

        /*
            Odczytaj imię i wiek użytkownika. Określ ile lat brakuje do emerytury lub od ilu lat
            użytkownik jest już na emeryturze:

            TIP: Do określenia płci użytkownika wykorzystaj uproszczony algorytm, że jest kobietą,
            gdy imię kończy się na literę `a`.
         */
        Scanner scanner = new Scanner(System.in);
        {
            System.out.print("Podaj imię: ");
            String firstName = scanner.nextLine();

            System.out.print("Podaj wiek: ");
            int age = scanner.nextInt();
			
			if (firstName.charAt(firstName.length() - 1) == 'a' && age >= 65) {
				System.out.println("Jesteś kobietą na emeryturze od: " + (age - 65) + " lat");
			}
			else {
				if (firstName.charAt(firstName.length() - 1) == 'a' && age < 65) {
					System.out.println("Jesteś kobietą, która idzie na emeryture za: " + (65 - age) + " lat");
				}
				else {
					if (firstName.charAt(firstName.length() - 1) != 'a' && age >= 65) {
						System.out.println("Jesteś męzczyzną na emeryturze od: " + (age - 65) + " lat");
					}
					else {
						System.out.println("Jesteś męzczyzną, który idzie na emeryture za: " + (65 - age) + " lat");
					}
				}
			}
			

        }
    }
}
