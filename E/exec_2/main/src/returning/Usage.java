package returning;

public class Usage {

    public static void main(String[] args) {

        // Wykorzystaj metodę `sum`, aby:
        // - obliczyć sumę liczb 3 i 7 i ją wyświetlić,
        // - obliczyć sumę dwóch losowych liczb i wyświetlić ją jeżeli jest parzysta

        // Wykorzystaj metodę `reverse`, aby:
        // - uzyskać odwrócony tekst "Java" i go wyświetlić,
        // - pobrać od użytkownika dwa słowa i wyświetlić informację czy są pierwsze słowo jest równe drugiemu odwróconemu

        // Wykorzystaj metodę `getSquareGraphics`, aby:
        // - uzyskać kwadrat o rozmiarze 4 i go wyświetlić
        // - uzyskać kwadrat o rozmiarze 6, zamienieć w nim symbol `*` na `#` oraz wyświetlić zmodyfikowany kwadrat

        // Wykorzystaj metodę `isFullage`, aby pobrać od użytkownika wiek i zaproponować mu piwo,
        // gdy jest pełnoletni lub orenżadę gdy nie jest
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
