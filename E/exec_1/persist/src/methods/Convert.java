package methods;

import java.util.Random;

public class Convert {

    public static void main(String[] args) {
        /*
            1. Zamień poniższy fragment kodu na metodę niesparametryzowaną.

            Powstałą metodę użyj 3 razy.

         */
        Random r = new Random();
        int steps = 5 + r.nextInt(15);

        for (int i = 0; i < steps; i++) {
            System.out.println("|__");
            for (int j = 0; j < (i + 1) * 3; j++) {
                System.out.print(" ");
            }
        }

        System.out.println();

        /*
            2. Zamień poniższy fragment kodu na metodę sparametryzowaną.

            Powstałą metodę użyj 3 razy dla różnych wartości.
            Przy pierwszym użyciu wartości podaj metodzie w postaci literałów. Przy drugim użyciu podaj
            w postaci zmiennych. Przy trzecim użyciu odczytaj je od użytkownika.
         */

        String word = "example";
        String connector = "-";
        int count = 7;

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

        // Sekcja parametrów
        int width = 40;
        int heigth = 20;
        double exitProbability = 0.25;
        double pathProbability = 0.70;
        String wallSymbol = "\u2591";
        String pathSymbol = " ";
        // Koniec sekcji parametrów

        // Generujemy górę
        for (int i = 0; i < width; i++) {
            System.out.print(wallSymbol);
        }
        System.out.println();

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

        // Generujemy dół
        for (int i = 0; i < width; i++) {
            System.out.print(wallSymbol);
        }
        System.out.println();

    }
}
