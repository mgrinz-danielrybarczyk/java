package methods;
import java.util.Scanner;

import java.util.Random;

public class Convert {

    public static void main(String[] args) {
        /*
            1. Zamień poniższy fragment kodu na metodę niesparametryzowaną.

            Powstałą metodę użyj 3 razy.

         */
		
		for (int i = 0; i < 3; i++) {
			stairsGenerator();
		 }
		 

        /*
            2. Zamień poniższy fragment kodu na metodę sparametryzowaną.

            Powstałą metodę użyj 3 razy dla różnych wartości.
            Przy pierwszym użyciu wartości podaj metodzie w postaci literałów. Przy drugim użyciu podaj
            w postaci zmiennych. Przy trzecim użyciu odczytaj je od użytkownika.
         */
		 
		 
		wordWithConnectorGenerator("example","~",10);
		
		String word = "test";
		String connector = "=>";
		int counter = 10;
		wordWithConnectorGenerator(word, connector, counter);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj słowo: ");
		String userWord = scanner.nextLine();
		System.out.print("Podaj łącznik: ");
		String userConnector = scanner.nextLine();
		System.out.print("Podaj licznik: ");
		int userCounter = scanner.nextInt();
		wordWithConnectorGenerator(userWord, userConnector, userCounter);
		
		

        /*
            3. Zamień poniższy fragment kodu na zestaw metod sparametryzowanych.

            Cały fragment kodu powinien zostać zamieniony na jedną metodę, która przyjmuje zestaw
            parametrów wyróżnionych komentarzami.

            Cała metoda powinna być wewnętrznie rozbita na użycie dwóch metod:
            1. Metody generującej pojedynczą linię górną lub dolną (będzie trzeba jej użyć dwa razy)
            2. Metodę generującą środek (będzie jej trzeba użyć raz)

            Główną metodę wykorzystaj trzy razy, aby wyświetlić 3 labirynty o różnych wartościach
            sterujących. Skorzystaj z dowolnego sposobu przekazania wartości do metody.

         */
			generateMaze(40, 20, 0.25, 0.70, "\u2591", " ");
			generateMaze(30, 10, 0.20, 0.60, ".", " ");
			generateMaze(Integer.parseInt(args[0]), Integer.parseInt(args[1]),
			Double.parseDouble(args[2]), Double.parseDouble(args[3]), args[4], args[5]);




    }
		public static void stairsGenerator() {
			Random r = new Random();
			int steps = 5 + r.nextInt(15);

			for (int i = 0; i < steps; i++) {
				System.out.println("|__");
				for (int j = 0; j < (i + 1) * 3; j++) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		public static void wordWithConnectorGenerator(String word, String connector, int count) {
			for (int i = 0; i < count; i++) {
				if (i == 0) {
					System.out.print(word);
				}
				else {
					System.out.print(connector);
					System.out.print(word);
				}
			}
			System.out.println();
		}

		public static void generateMaze(int width, int heigth, double exitProbability, double pathProbability, String wallSymbol, String pathSymbol) {
			printWall(width, wallSymbol);
			printMid(width, heigth, exitProbability, pathProbability, wallSymbol, pathSymbol);
			printWall(width, wallSymbol);
		}
		
		private static void printWall(int width, String wallSymbol) {
			// Generujemy górę
			for (int i = 0; i < width; i++) {
            System.out.print(wallSymbol);
        }
			System.out.println();
		}

        private static void printMid(int width, int heigth, double exitProbability, double pathProbability, String wallSymbol, String pathSymbol) {
			// Generujemy środek
			int usedExits = width * heigth / 10;
			for (int i = 1; i < heigth - 1; i++) {
				for (int j = 0; j < width; j++) {
					if (j == 0 || j == width - 1) {
						if (Math.random() > (1 - exitProbability) && usedExits > 0) {
							System.out.print(pathSymbol);
							usedExits--;
						}
						else {
							System.out.print(wallSymbol);
						}
					}
					else {
						if (Math.random() > (1 - pathProbability)) {
							System.out.print(pathSymbol);
						}
						else {
							System.out.print(wallSymbol);
						}
					}
				}
				System.out.println();
			}
		}

}