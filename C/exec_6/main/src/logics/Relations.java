package logics;
import java.util.Scanner;

public class Relations {

    public static void main(String[] args) {

        /*
            W pierwszej części Twoim zadaniem jest zapisanie w kodzie wartości (literałów) i użycie
            ich do poprawnego zamodelowania wyrażeń logicznych. Wyniki wyrażeń powinny być wyświetlone
            na konsoli.

            W tej części nie używasz zmiennych.
         */
		 
		int a = 1;
boolean b = true || 2 > (a = 3);

		System.out.println("a jest równe: " + a);
		System.out.println("b jest równe: " + b);
		
        System.out.print("Czy liczba " + 3 + " jest większa od zera? ");
        System.out.println(3 > 0);

        System.out.print("Czy liczba " + 12 + " jest liczbą ujemną? ");
        System.out.println(12<0);

        System.out.print("Czy liczba " + 120 + " jest równa wynikowi mnożenia 6 i 20? ");
        System.out.println(120==6*20);

        System.out.print("Czy jesteś osobą pełnoletnią? ");
        System.out.println(27>=18);

        System.out.print("Czy liczba " + 131 + " jest liczbą parzystą? ");
        System.out.println(131%2==0);

        System.out.print("Czy litera " + 'A' + " jest przed literą H? ");
        System.out.println('A'<'H');
		
		System.out.print("Czy litera " + 'b' + " jest większa od litery Z? ");
        System.out.println('b'>'Z');

        System.out.print("Czy urodziłeś się przed " + 2000 + " rokiem i po " + 1980 + " roku? ");
        System.out.println(2000>1997 && 1997>1980);

        System.out.print("Czy liczba " + 12 + " jest podzielna przez " + 2 + " i jest podzielna przez " + 3 + "? ");
        System.out.println(12%2==0 && 12%3==0);

        System.out.print("Czy jest przed " + 5 + " rano albo po " + 7 + "? ");
        System.out.println(5>13 ^ 7<13);

        // Analogicznie jak we wcześniejszych przykładach zapisze teraz dwa własne warunki, które
        // chcesz wyświetlić i sprawdzić.
        System.out.print("Czy jesteś w związku dłużej niż " + 2 + " lata? ");
        System.out.println(3.5 > 2);
        
        System.out.print("Czy pierwsza litera Twojego imienia to " + 'A' + "? ");
        System.out.println('D' == 'A');
        /*
            W drugiej części Twoim zadaniem jest pobranie od użytkownika wartości (z konsoli), zapisanie
            ich do zmiennych oraz przy pomocy tych zmiennych wyrażenie zdań logicznych. Wyniki zdań logicznych
            musisz przypisać do zmiennych.
         */
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Podaj swój wiek: ");
        double age=Prompt.promptInt("Podaj swój wiek: ");
        boolean adult = age>=18;
        System.out.println("Czy jesteś pełnoletni? " + adult);

        System.out.print("Podaj swój rok urodzenia: ");
        int yearOfBirth=scanner.nextInt();
        // Wprowadź odpowiednią zmienną typu `boolean`, która będzie reprezentowała poprawnie
        // prawdę wyrażoną w zdaniu wyświetlanym na konsoli
        boolean genZ=yearOfBirth>2000;
        System.out.println("Czy urodziłeś się po 2000 roku? " + genZ);

        System.out.print("Ile zarabiasz miesięcznie brutto? ");
        double monthlySallary=scanner.nextDouble();
        boolean averageSallary=monthlySallary>7155.48; 
        System.out.println("Czy zarabiasz powyżej średniej krajowej? " + averageSallary);

        System.out.print("Ile godzin śpisz każdego dnia? ");
        double amountOfSleepInHours=scanner.nextDouble();
        boolean properSleepDuration=(amountOfSleepInHours>=6 && amountOfSleepInHours<=8);
        System.out.println("Czy śpisz między 6 a 8 godzin każdego dnia? " + properSleepDuration);


        System.out.print("W którym miesiącu się urodziłeś? ");
        String monthOfBirth=scanner.next();
        boolean mayOrDecember=(monthOfBirth.equalsIgnoreCase("may") ^ monthOfBirth.equalsIgnoreCase("december")); 
        System.out.println("Czy urodziłeś się w maju albo w grudniu? " + mayOrDecember);

        System.out.print("Podaj dzień miesiące Swoich urodzin: ");
        int dayOfMonthOfBirth=scanner.nextInt();
        boolean springBirth=
            ((monthOfBirth.equalsIgnoreCase("march") && (dayOfMonthOfBirth>=20 && dayOfMonthOfBirth<=31))  ^ 
              monthOfBirth.equalsIgnoreCase("april") ^ 
                monthOfBirth.equalsIgnoreCase("may") ^
                (monthOfBirth.equalsIgnoreCase("june") && (dayOfMonthOfBirth>=1 && dayOfMonthOfBirth<=21))); 
        System.out.println("Czy urodziłeś się w wiosnę? " + springBirth);

        System.out.print("Który jest dzisiaj dzień roku? ");
        int currentDayOfYear=scanner.nextInt();
        System.out.print("W który dzień roku masz urodziny? ");
        int birthDayOfYear=scanner.nextInt();
        boolean hundredDaysToBirthdayOrFiftyAfter=(currentDayOfYear+100==birthDayOfYear ^ currentDayOfYear-50==birthDayOfYear);
        System.out.println("Czy masz urodziny za 100 dni albo miałeś urodziny 50 dni temu? " + hundredDaysToBirthdayOrFiftyAfter);

        //System.out.print("Jaka jest ostatnia litera Twojego imienia? ");
        char lastLetterOfFirstName=Prompt.promptChar("Jaka jest ostatnia litera Twojego imienia? ");
        boolean lastLetterOfName=(lastLetterOfFirstName=='a');
        System.out.println("Czy Twoje imię kończy się na literę 'a'? " + lastLetterOfName);

        System.out.print("Jaką literą zaczyna się Twoje imię? ");
        char firstLetterOfFirstName=scanner.next().charAt(0);
        System.out.print("Jaką literą zaczyna się Twoje nazwisko? ");
        char firstLetterOfLastName=scanner.next().charAt(0);
        boolean sameLetterForFirstAndSecondName=(firstLetterOfFirstName==firstLetterOfLastName);
        System.out.println("Czy Twoje imię i nazwisko zaczyna się na tą samą literę? " + sameLetterForFirstAndSecondName);

        // Analogicznie jak we wcześniejszych przykładach zapisz teraz dwa własne warunki i zdania
        // logiczne.
    }
}
