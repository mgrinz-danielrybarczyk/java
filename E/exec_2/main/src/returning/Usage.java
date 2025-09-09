package returning;

import java.util.Random;
import java.util.Scanner;

public class Usage {

    public static void main(String[] args) {

        // Wykorzystaj metodę `sum`, aby:
        // - obliczyć sumę liczb 3 i 7 i ją wyświetlić,
        // - obliczyć sumę dwóch losowych liczb i wyświetlić ją jeżeli jest parzysta
		
		System.out.println("Wynik metody sum dla parametrów 3 i 7: " + sum(3,7));
		
		Random rand = new Random();
		
		int firstRandom = rand.nextInt(100);
		int secondRandom = rand.nextInt(100);
		System.out.println("Wynik metody sum dla parametrów losowych: " + firstRandom + " i " + secondRandom + " = " + sum(firstRandom,secondRandom));

        // Wykorzystaj metodę `reverse`, aby:
        // - uzyskać odwrócony tekst "Java" i go wyświetlić,
        // - pobrać od użytkownika dwa słowa i wyświetlić informację czy są pierwsze słowo jest równe drugiemu odwróconemu
		
		System.out.println("Java od tyłu: " + reverse("Java"));
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj słówko: ");
		String userWord = scanner.next();
		System.out.print("A teraz to samo słówko od tyłu: ");
		String reverseWord = scanner.next();
		
		if (reverseWord.equals(reverse(userWord))) {
			System.out.println("Jest OK, faktycznie podałeś to samo słówko, ale od tyłu");
		} else {
			System.out.println("Błąd. To słówko od tyłu to: " + reverse(userWord));
		}
		

        // Wykorzystaj metodę `getSquareGraphics`, aby:
        // - uzyskać kwadrat o rozmiarze 4 i go wyświetlić
		System.out.println(getSquareGraphics(4));
		
        // - uzyskać kwadrat o rozmiarze 6, zamienieć w nim symbol `*` na `#` oraz wyświetlić zmodyfikowany kwadrat
		String square = getSquareGraphics(6);
		square = square.replace('*', '#');
		System.out.println(square);
		

        // Wykorzystaj metodę `isFullage`, aby pobrać od użytkownika wiek i zaproponować mu piwo,
        // gdy jest pełnoletni lub orenżadę gdy nie jest
		System.out.println("Ile masz lat? ... ");
		int age = scanner.nextInt();
		if(isFullage(age)) {
			System.out.println("Chodźmy na piwo ... ;)");
		} else {
			System.out.println("Chodźmy na orenżadę ... ;)");
		}
		
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static String getSquareGraphics(int size) {
        String squareGraphics = "";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1) {
                    squareGraphics += "*";
                }
                else if (j == 0 || j == size - 1) {
                    squareGraphics += "*";
                }
                else {
                    squareGraphics += " ";
                }
            }
            squareGraphics += "\n";
        }
        return squareGraphics;
    }

    public static boolean isFullage(int age) {
        if (age >= 18) {
            return true;
        }
        else {
            return false;
        }
    }
}
