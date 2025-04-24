package iterations;

public class GoTo {

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
            2: !(number <= 10) goto 6;
            3: System.out.println(number);
            4: number = number + 1;
            5: goto 2;
            6:
        }
        */

        // Twój kod do 1. Fragmentu:
        {
			for (int number = 1; number <= 10; number += 1) {
				System.out.println(number);
			}				
			
			for (int number = 10; number >= 1; number += -1) {
				System.out.println(number);
			}	
		}

        /* 2. Fragment (dla pętli do-while)
        {
            1: int sum = 0;
            2: int number = 1;
            3: sum = sum + number;
            4: number = number + 1;
            5: !(sum <= 1_000_000) goto 7;
            6: goto 3;
            7: System.out.println("Uzyskana suma: " + sum);
        }
        */

        // Twój kod do 2. Fragmentu:
        {
			int sum = 0;
			int number = 1;
			do {
				sum = sum + number;
				number = number +1;
			} while (sum <= 1000000);
			System.out.println("Uzyskana suma: " + sum);
        }
		

        /* 3. Fragment (dla pętli for)
        {
            1: String word = "Some sample word";
            3: System.out.print("[");
            2: int charIndex = 0;
            4: !(charIndex < word.length()) goto 9;
            5: char c = word.charAt(charIndex);
            6: System.out.print(c + " ");
            7: charIndex = charIndex + 1;
            8: goto 4;
            9: System.out.print("]");
        }
        */

        // Twój kod do 3. Fragmentu:
        {
			String word = "Some sample word";
			System.out.print("[");
			for(int charIndex = 0; charIndex < word.length(); charIndex = charIndex + 1) {
					char c = word.charAt(charIndex);
					System.out.print(c + " ");
			}
			System.out.print("]");
        }
    }
}
