package conditionals;

import java.util.Random;
import java.util.Scanner;

public class MoreGoTo {

    public static void main(String[] args) {

        Random r = new Random();

        /*
            Poniżej znajdują się zakomentowane bloki kodu z instrukcjami goto.
            Przeanalizuj działanie każdego z bloków kodu i zapisz pod nim analogiczny fragment kodu.
            Korzystaj z tych samych nazw zmiennych i operacji, ale linie z instrukcjami `goto`
            zastąp wykorzystaniem instrukcji if oraz if else
         */

        /* 1. Fragment
        {
            1: int teamAScore = r.nextInt(5);
            2: int teamBScore = r.nextInt(5);
            3: !(teamAScore > teamBScore) goto 5;
            4: System.out.println("Drużyna A wygrała");
            5: !(teamBScore > teamAScore) goto 7;
            6: System.out.println("Drużyna B wygrała");
            7: !(teamAScore == teamBScore) goto 9;
            8: System.out.println("Remis");
            9: System.out.println("Wynik " + teamAScore + ":" + teamBScore);
        }
        */

        // Twój kod do 1. Fragmentu:
        {
			int teamAScore = r.nextInt(5);
			int teamBScore = r.nextInt(5);
			if (teamAScore > teamBScore) {
				System.out.println("Drużyna A wygrała");
			}
			else if (teamBScore > teamAScore) {
				System.out.println("Drużyna B wygrała");
			}
			else {
				System.out.println("Remis");
			}
			System.out.println("Wynik " + teamAScore + ":" + teamBScore);

        }

        /* 2. Fragment
        {
            1:  Scanner scanner = new Scanner(System.in);
            2:  System.out.print("Podaj długość a: ");
            3:  double a = scanner.nextDouble();
            4:  System.out.print("Podaj długość b: ");
            5:  double b = scanner.nextDouble();
            6:  System.out.print("Podaj długość c: ");
            7:  double c = scanner.nextDouble();
            8:
            9:  System.out.println("a = " + a + ", b = " + b + ", c = " + c);
            10: !(a + b > c && a + c > b && b + c > a) goto 14;
            11: System.out.println("Z podanych odcinków można zbudować trójkąt");
            12: !(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) goto 14;
            13: System.out.println("Trójkąt będzie prostokątny");
            14: !(!(a + b > c && a + c > b && b + c > a)) goto 16;
            15: System.out.println("Z podanych odcinków nie można zbuodwać trójkąta");
            16:
        }
        */

        // Twój kod do 2. Fragmentu:
        {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Podaj długość a: ");
			double a = scanner.nextDouble();
			System.out.println("Podaj długość b: ");
			double b = scanner.nextDouble();
			System.out.println("Podaj długość c: ");
			double c = scanner.nextDouble();
			System.out.println("a = " + a + ", b = " + b + ", c = " + c);
			if (a + b > c && a + c > b && b + c > a) {
				System.out.println("Z podanych odcinków można zbudować trójkąt");
			
				if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
					System.out.println("Trójkąt będzie prostokątny");
					}
			} 
			else {
				System.out.println("Z podanych odcinków NIE można zbudować trójkąt");
			}
        }
    }
}
