package logics;
import java.util.Scanner;


public class Relations2 {

    public static void main(String[] args) {

        /*
            W pierwszej części Twoim zadaniem jest zapisanie w kodzie wartości (literałów) i użycie
            ich do poprawnego zamodelowania wyrażeń logicznych. Wyniki wyrażeń powinny być wyświetlone
            na konsoli.

            W tej części nie używasz zmiennych.
         */
        System.out.print("Czy liczba " + 7 + " jest mniejsza od zera? ");
        System.out.println(7 < 0);

        System.out.print("Czy liczba " + -20 + " jest liczbą dodatnią? ");
        System.out.println(-20>0);

        System.out.print("Czy liczba " + 75 + " jest równa wynikowi mnożenia 5 i 15? ");
        System.out.println(75==5*15);

        System.out.print("Czy jesteś po czterdziestce? ");
        System.out.println(27>40);

        System.out.print("Czy liczba " + 144 + " jest liczbą nieparzystą? ");
        System.out.println(144%2==1);

        System.out.print("Czy litera " + 'W' + " jest po literą J? ");
        System.out.println('W'>'J');

        System.out.print("Czy urodziłeś się między " + 2000 + " a " + 2020 + " rokiem? ");
        System.out.println(1997>2000 && 1997<2020);

        System.out.print("Czy liczba " + 18 + " jest nie podzielna przez " + 4 + " i jest podzielna przez " + 6 + "? ");
        System.out.println(18%4==0 && 18%6==0);

        System.out.print("Czy jest między " + 5 + " a " + 7 + " rano lub między " + 17 + " a " + 19 + " wieczorem? ");
        System.out.println(5<18 && 7>18 || 17<18 && 19>18);

        // Analogicznie jak we wcześniejszych przykładach zapisze teraz dwa własne warunki, które
        // chcesz wyświetlić i sprawdzić.


        /*
            W drugiej części Twoim zadaniem jest pobranie od użytkownika wartości (z konsoli), zapisanie
            ich do zmiennych oraz przy pomocy tych zmiennych wyrażenie zdań logicznych. Wyniki zdań logicznych
            musisz przypisać do zmiennych.
         */

        int populationOfYourCity=Prompt.promptInt("Podaj ilość mieszkańców Twojego miasta: ");
        boolean liveInBigCity = populationOfYourCity>500000;
        System.out.println("Czy mieszkasz w dużym mieście (powyżej 500 tyś. mieszkańców) ? " + liveInBigCity);

			Scanner scanner = new Scanner(System.in);

		System.out.print("Podaj rok urodzenia Mamy: ");
        int myMumYearOfBirth=scanner.nextInt();
        int myDadYearOfBirth=Prompt.promptInt("Podaj rok urodzenia Taty: ");
		boolean parentsBornBeforeWar=myMumYearOfBirth<1939 && myDadYearOfBirth<1939;
        System.out.println("Czy Twoi rodzice urodzili się przed II Wojną Światową? " + parentsBornBeforeWar);

        int yourAge=Prompt.promptInt("Podaj swój wiek: ");
		boolean thirtyYearsInNextTenYears=yourAge+10==30;
        System.out.println("Czy będziesz mieć 30 lat za 10 lat? " + thirtyYearsInNextTenYears);

        boolean retirmentIn35Years=yourAge+35>=65;
        System.out.println("Czy będziesz na emeryturze za 35 lat? " + retirmentIn35Years);

        int numberOfForeignLanguages=Prompt.promptInt("Ile znasz języków obcych? ");
		boolean moreThanOneForeignLanguage=numberOfForeignLanguages>1;
        System.out.println("Czy znasz więcej niż jeden język obcy? " + moreThanOneForeignLanguage);

        int lastDayWakeHour=Prompt.promptInt("Jaka była godzina twojego ostatniego przebudzenia bez minut: ");
        int lastDayWakeMinutes=Prompt.promptInt("Ile było na wskazówce minutowej przy Twoim ostatnim przebudzeniu? ");
		boolean wakeUpBetween5And630=(lastDayWakeHour==5 && lastDayWakeMinutes>0 && lastDayWakeMinutes<60) || (lastDayWakeHour==6 && lastDayWakeMinutes>=0 && lastDayWakeMinutes<30);
        System.out.println("Czy wstałeś wczoraj między 5:00 a 6:30? " + wakeUpBetween5And630);

        int myFavouriteNumber1=Prompt.promptInt("Podaj pierwszą ulubioną liczbę wariacie: ");
        int myFavouriteNumber2=Prompt.promptInt("Podaj drugą ulubioną liczbę wariacie: ");
        int myFavouriteNumber3=Prompt.promptInt("Podaj trzecią ulubioną liczbę wariacie: ");
		boolean firstAndSecondNumberIsHigherThanThird=myFavouriteNumber1>myFavouriteNumber3 && myFavouriteNumber2>myFavouriteNumber3;
        System.out.println("Czy Twoje dwie ulubione liczby są większe od Twojej trzeciej ulubionej liczby? " + firstAndSecondNumberIsHigherThanThird);

        // Analogicznie jak we wcześniejszych przykładach zapisz teraz dwa własne warunki i zdania
        // logiczne.
    }
}
