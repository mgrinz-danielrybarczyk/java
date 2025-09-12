package returning;

import java.util.Scanner;

public class Write {

    public static void main(String[] args) {

        // Dostarcz poniżej po trzy różne przypadki użycia wskazanych metod
		System.out.println(countNumbers(4,8));
		System.out.println(countNumbers(2,6));
		System.out.println(countNumbers(3,7));
		
		System.out.println(addValues(5,3,17));
		System.out.println(addValues(5,3,18));
		System.out.println(addValues(5,3,16));
		
		System.out.println(giveMeNumber("Cześć! Podaj mi liczbę z zakresu: ",3,16));
		
		
		
		
		
    }

    /*
        Tutaj dostarcz kod pierwszej metody.

        Metoda powinna przyjąć dwa parametry liczbowe. Wynikiem działania metody powinien być tekst, który
        zawiera kolejne liczby od mniejszej wartości z podanych (włacznie) aż do większej wartości.
        Liczby powinny być rozdzielone od siebie znakiem przecinka. Po ostatniej liczbie nie powinno
        być przecinka.
     */
	 public static String countNumbers(int firstNumber, int secondNumber) {
		 String numbers = "";
		 /*
		 if (firstNumber < secondNumber) {
			 for(int i = firstNumber; i <= secondNumber; i++) {
				if (i != secondNumber) {
				 numbers += firstNumber + ",";
				 firstNumber += 1;
				} else {
				 numbers += firstNumber;
				}		 
			 }
		 } else if (firstNumber > secondNumber) {
			 for(int i = secondNumber; i <= firstNumber; i++) {
				if (i != firstNumber) {
				 numbers += secondNumber + ",";
				 secondNumber += 1;
				} else {
				 numbers += secondNumber;
				}		 
			 }	 
		} else {
			numbers += firstNumber;
		}
		return numbers;
	 }
	 */
		 int i = firstNumber;
		 while (i <= secondNumber) {
			 numbers += i;
			 if (i != secondNumber) {
				 numbers += ",";
			 }
			 i++;
		 }
		return numbers;
}

    /*
        Tutaj dostarcz kod drugiej metody.

        Metoda powinna przyjąć trzy parametry liczbowe: wartość początkową, zmianę wartości oraz wartość graniczną.
        Wynikiem działania metody powinnna być suma wszystkich wartości od wartości początkowej
        aż po pierwszą wartość większą od wartości granicznej. Ta pierwsza wartość też jest uwzględniana w wyniku.
        Kolejne wartości określamy korzystając ze zmiany wartość.

        Przykład:
        Wartość początkowa: 5
        Zmiana wartośći: 3
        Wartość graniczna: 17

        Wynik: 5 + 8 + 11 + 14 + 17 + 20 = 75
     */
	 
		 public static int addValues(int startNumber, int add, int endNumber) {
			 int result = startNumber;
			 int sum = startNumber;
			 while (result <= endNumber) {
				 result += add;
				 sum += result;
			 }
			 return sum;
		 }

    /*
        Tutaj dostarcz kod trzeciej metody.

        Metoda powinna przyjąć jako parametr tekst zachęty dla użytkownika oraz dwa parametry typu int
        określające przedział wartości. Tekst zachęty zostanie wyświetlony na konsoli, a użytkownik będzie musiał podać wartość.
        Użytkownik powinien podać wartość liczbową w zakresie zgodnym z przekazanymi parametrami, ale nie możemy być tego pewni.
        Metoda powinna zagwarantować, że użytkownik będzie proszony tyle razy o podanie wartości aż nie poda wartości liczbowej
        w ustalonym zakresie.

        Metoda powinna zwrócić poprawną wartość podaną przez użytkownika
     */
	 public static int giveMeNumber(String text, int firstValue, int secondValue) {
		Scanner scanner = new Scanner(System.in);
		int userValue;
		do {
			System.out.println(text + firstValue + " - " + secondValue);
			userValue = scanner.nextInt();
		}
		while (userValue < firstValue || userValue > secondValue);
		System.out.print("Świetnie! Podałeś prawidłową wartość: ");
		return userValue;
	 }
	 

	 
	 
}
