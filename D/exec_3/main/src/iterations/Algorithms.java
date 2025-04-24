package iterations;

public class Algorithms {

    public static void main(String[] args) {

        /*
            Mając wskazaną dodatnią wartość początkową wyświetl kolejne liczby,
            aż do jej wartości ujemnej.
        */
        {
            int start = 1;
			int limit = -start;
			
			while (start >= limit) {
				System.out.println(start);
				start = start - 1;
			}
        }


        /*
            Mająć podaną godzinę oraz minutę wyświetl kolejne minuty (każdą w osobnej linii)
            aż do następnej, pełnej godziny.
            Dane wyświetlaj w formacie: HH:MM, np. 07:31
         */
        {
            int hour = 12;
            int minute = 58;
			while (minute < 60) {
				minute = minute + 1;
				
				if (minute == 60) {
					if (hour < 10) {
						System.out.println("0" + (hour + 1) + ":00");
					} else {
						System.out.println((hour + 1) + ":00");
					}
				}else {
					if (hour < 10) {
					if (minute < 10) {
						System.out.println("0" + hour + ":" + "0" + minute);
					} else {
						System.out.println("0" + hour + ":" + minute);
					}
						} else if (minute < 10) {
							System.out.println(hour + ":" + "0" + minute);
						} else {
							System.out.println(hour + ":" + minute);
						}
				}
			}
			
        }

        /*
            Mając podany tekst wyświetl każde słowo w tym tekście w osobnej linii.
            Słowa są rozdzielone znakiem `,` (przecinka). Samych znaków `,` (przecinka)
            nie wyświetlaj.
         */

        {
            String text = "Jeden,dwa,trzy,cztery,pięć,sześć,siedem";
			char c = '\u0000';
			String word = "";
			
			/*
			int i = 0;
			
			while (i < text.length()) {
			c = text.charAt(i);
				if (c != ',') {
					word += c;
				}
				
				if(c == ',' || (i == text.length() - 1 && !word.isEmpty())) {
					
					System.out.println("[" + word + "]");
					word = "";
				}
				i=i+1;
			}
			*/		
			
			for (int i = 0; i < text.length(); i += 1) {
				c = text.charAt(i);
				if (c != ',') {
					word += c;
				}
				
				if(c == ',' || (i == text.length() - 1 && !word.isEmpty())) {
					
					System.out.println("[" + word + "]");
					word = "";
				}
			}

        }

        /*
            Mająć podany tekst wyświetl każde słowo w tym tekście w osobnej linii.
            Słowa rozdzielone są wskazanym znakiem. Samych znaków nie wyświetlaj.
            Spacje przed i po słowie również nie powinny być wyświetlane.
         */
        {
            String text = "Słowo; słowa; więcej  ;słów;ale;nie;każde;słowo;jest-samodzielne";
            char separator = ';';
			
			/*
			char space = ' ';
			char c = '\u0000';
			String word = "";
			int i = 0;
			
			while (i < text.length()) {
				c = text.charAt(i);
				if (c != separator && c != space) {
					word += c;
				}
				if (c == separator || i == text.length() - 1) {
					System.out.println(word);
					word = "";
				}
				if (c == space && word.length() == 0) {
					word = "";
				}
				i = i + 1;
				
			}
			*/
			
			char c = '\u0000';
			String word = "";
			int i = 0;
			
			while (i < text.length()) {
			c = text.charAt(i);
				if (c != separator) {
					word += c;
				}
				
				if(c == separator || (i == text.length() - 1 && !word.isEmpty())) {
					
					System.out.println("'" + word.trim() + "'");
					word = "";
				}
				i=i+1;
			}
			
        }

        /*
            Mając podany wymiar w postaci parzystej liczby całkowitej wyświetl symbol X.
            Przykładowo, dla wymiaru o wartości 6, wynik powinien być następujący:

            *    *
             *  *
              **
              **
             *  *
            *    *

         */
        {
            int size = 60;
		//	int charNumber = 1;
		//	int lineNumber = 1;
			
			
			
			/*
			while (lineNumber <= size) {
				
				while (charNumber <= size) {
					
					if (charNumber == lineNumber || charNumber == size - (lineNumber - 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					charNumber += 1;
				}
				System.out.println();
				charNumber = 1;
				lineNumber += 1;
			}
			*/
			
			for (int lineNumber = 1; lineNumber <= size; lineNumber += 1) {
				for (int charNumber = 1; charNumber <= size; charNumber += 1) {
					if (charNumber == lineNumber || charNumber == size - (lineNumber - 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
			

        }
    }
}
