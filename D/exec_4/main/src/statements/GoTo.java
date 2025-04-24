package statements;
import java.util.Scanner;

public class GoTo {

    public static void main(String[] args) {

        /*
            Poniżej znajdują się zakomentowane bloki kodu z instrukcjami goto.
            Przeanalizuj działanie każdego z bloków kodu i zapisz pod nim analogiczny fragment kodu.
            Korzystaj z tych samych nazw zmiennych i operacji, ale wykorzystaj instrukcje iteracyjne,
            instrukcje przełącznika switch oraz skoki bezwarunkowe typu `break` oraz `continue`.
         */

        /* 1. Fragment (dla instrukcji switch)
        {
            1:  Scanner scanner = new Scanner(System.in);
            2:  System.out.print("Podaj numer miesiąca (od 0 do 11): ");
            3:  int monthNumber = scanner.nextInt();
            4:  monthNumber == 0 goto 17;
            5:  monthNumber == 1 goto 19
            6:  monthNumber == 2 goto 21;
            7:  monthNumber == 3 goto 23;
            8:  monthNumber == 4 goto 25;
            9:  monthNumber == 5 goto 27;
            10:  monthNumber == 6 goto 29;
            11: monthNumber == 7 goto 31;
            12: monthNumber == 8 goto 33;
            13: monthNumber == 9 goto 35;
            14: monthNumber == 10 goto 37;
            15: monthNumber == 11 goto 39;
            16: goto 41;
            17: System.out.println("Zima");
            18: goto 43;
            19: System.out.println("Zima");
            20: goto 43;
            21: System.out.println("Wiosna");
            22: goto 43;
            23: System.out.println("Wiosna");
            24: goto 43;
            25: System.out.println("Wiosna");
            26: goto 43;
            27: System.out.println("Lato");
            28: goto 43;
            29: System.out.println("Lato");
            30: goto 43;
            31: System.out.println("Lato");
            32: goto 43;
            33: System.out.println("Jesień");
            34: goto 43;
            35: System.out.println("Jesień");
            36: goto 43;
            37: System.out.println("Jesień");
            38: goto 43;
            39: System.out.println("Zima");
            40: goto 43;
            41: System.out.println("Niepoprawny numer miesiąca");
            42: goto 43;
            43:
        }
        */

        // Twój kod do 1. Fragmentu:
        {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Podaj numer miesiąca:");
			int monthNumber = scanner.nextInt();
			switch (monthNumber) {
				case 1: case 2: case 12:
				System.out.println("Zima");
				break;

				case 3:	case 4:	case 5:
				System.out.println("Wiosna");
				break;

				case 6: case 7: case 8:
				System.out.println("Lato");
				break;

				case 9: case 10: case 11:
				System.out.println("Jesień");
				break;

				default:
				System.out.println("Niepoprawny numer miesiąca");	
			}

        }

        /* 2. Fragment (dla instrukcji switch)
        {
            1:  Scanner scanner = new Scanner(System.in);
            2:  System.out.println("Podaj numer dnia (od 0 do 6): ");
            3:  String dayName;
            4:  int dayNumber = scanner.nextInt();
            5:  (dayNumber == 0) goto 13;
            6:  (dayNumber == 1) goto 15;
            7:  (dayNumber == 2) goto 17;
            8:  (dayNumber == 3) goto 19;
            9:  (dayNumber == 4) goto 21;
            10: (dayNumber == 5) goto 23;
            11: (dayNumber == 6) goto 25;
            12: goto 27;
            13: dayName = "Poniedziałek";
            14: goto 29;
            15: dayName = "Wtorek";
            16: goto 29;
            17: dayName = "Środa";
            18: goto 29;
            19: dayName = "Czwartek";
            20: goto 29;
            21: dayName = "Piątek";
            22: goto 29;
            23: dayName = "Sobota";
            24: goto 29;
            25: dayName = "Niedziela";
            26: goto 29;
            27: dayName = "Niepoprawny numer dnia tygodnia!";
            28: goto 29;
            29: System.out.println("Dzień tygodnia: " + dayName);
        }
        */

        // Twój kod do 2. Fragmentu:
        {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Podaj number dnia tygodnia: ");
			String dayName;
			int dayNumber = scanner.nextInt();
			switch(dayNumber){
				case 1:
					dayName = "Poniedziałek";
				break;
				
				case 2:
					dayName = "Wtorek";
				break;
				
				case 3:
					dayName = "Środa";
				break;
				
				case 4:
					dayName = "Czwartek";
				break;
				
				case 5:
					dayName = "Piątek";
				break;
				
				case 6:
					dayName = "Sobota";
				break;
				
				case 7:
					dayName = "Niedziela";
				break;
				
				default:
				dayName = "Niepoprawny numer dnia tygodnia!";
			}
			System.out.println("Dzień tygodnia: " + dayName);
        }

        /* 3. Fragment (pętla while z instrukcją continue i break)
        {
            1:  Scanner scanner = new Scanner(System.in);
            2:  int sum = 0;
            3:  !(true) goto 14;
            4:  System.out.print("Podaj kolejną liczbę do zsumowania (słowo `quit` kończy);
            5:  (scanner.hasNextInt()) goto 11;
            6:  String input = scanner.next();
            7:  !(input.equals("quit")) goto 9;
            8:  goto 14;
            9:  !(!input.equals("quit"))) goto 11;
            10: goto 3;
            11: int number = scanner.nextInt();
            12: sum += number;
            13: goto 3;
            14: System.out.println("Suma liczb: " + sum);
        */

        // Twój kod do 3. Fragmentu:
        {
			Scanner scanner = new Scanner(System.in);
			int sum = 0;
			while(true) {
				System.out.println("Podaj kolejną wartość do zsumowania (słówko 'quit' kończy sumowanie");
				
				if (scanner.hasNextInt()) {
					int number = scanner.nextInt();
					sum += number;
					continue;
				}
				
				String input = scanner.next();
				if (input.equals("quit")) {
					System.out.println("Koniec sumowania");
					break;
				}
				
				System.out.println("Niepoprawne dane, spróbuj ponownie");
			}
			System.out.println("Suma wynosi: " + sum);
        }
		
		
		{
			Scanner scanner = new Scanner(System.in);
			int sum = 0;
			while (true) {
				System.out.println("Podaj wartość do sumy: ");
				System.out.println("+++");
				
				if(!scanner.hasNextInt()) {
					String input = scanner.next();
					if(input.equals("quit")) {
						System.out.println("----------------");
						System.out.println("Koniec sumowania");
						System.out.println("----------------");
						break;
					} else {
						System.out.println("Niepoprawna wartość");
						System.out.println("*******************");
						continue;
					}				
				}
				
				int number = scanner.nextInt();
				sum += number;
			}
			System.out.println("Suma wynosi: " + sum);
		}
    }
}
