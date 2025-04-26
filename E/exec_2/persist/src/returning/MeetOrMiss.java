package returning;

public class MeetOrMiss {

    public static void main(String[] args) {

        // Zacznij od napisania implementacji metody `timeToMeet`, która obsłuży przypadek z pierwszego kodu.
        // Nie oznacza to, że zwróci na sztywno wartość `0`. Zaimplementuj algorytm, ale bez zbędnego
        // zastanawiania się czy zadziała zawsze czy nie. Ważne, aby sobie poradził z pierwszym przypadkiem.

        // Kiedy pierwszy test przejdzie przejdź do testu, który nie przechodzi o popraw/rozrzesz swoją
        // implementację, aby i ten test przeszedł.

        // Powtarzaj tak długo, aż wszystkie testy nie zakończą się sukcesem

        boolean pass;
        System.out.print("Test : 'timeToMeet(0, 1, 2, -1) == 1' przeszedł? ");
        pass = (timeToMeet(0, 1, 2, -1) == 1);
        System.out.println(pass);

        System.out.print("Test : 'timeToMeet(-2, 1, 2, -1) == 2' przeszedł? ");
        pass = (timeToMeet(-2, 1, 2, -1) == 2);
        System.out.println(pass);

        System.out.print("Test : 'timeToMeet(0, 1, 0, -1) == 0' przeszedł? ");
        pass = (timeToMeet(0, 1, 0, -1) == 0);
        System.out.println(pass);

        System.out.print("Test : 'timeToMeet(0, 0, 8, -1) == 8' przeszedł? ");
        pass = (timeToMeet(0, 0, 8, -1) == 8);
        System.out.println(pass);

        System.out.print("Test : 'timeToMeet(-7, -2, 5, -4) == 6' przeszedł? ");
        pass = (timeToMeet(-7, -2, 5, -4) == 6);
        System.out.println(pass);

        System.out.print("Test : 'timeToMeet(5, -1, 8, 1) == -1' przeszedł? ");
        pass = (timeToMeet(5, -1, 8, 1) == -1);
        System.out.println(pass);

        System.out.print("Test : 'timeToMeet(5, 1, 8, 1) == -1' przeszedł? ");
        pass = (timeToMeet(5, 1, 8, 1) == -1);
        System.out.println(pass);
    }

    /**
     * Metoda na podstawie pozycji początkowych oraz prędkości określa ile "ruchów" musi minąć, aby
     * spotkać się (lub minąć). Jeżeli prędkość jest dodania, to pozycja rośnie. Jeżeli prędkość jest
     * ujemna do pozycja maleje. Za spotkanie się uznajemy sytuację gdy obie pozycje będą miały tą samą
     * wartość lub gdy pozycje znajdą się po swoich "przeciwnym stronach".
     *
     * @param firstPosition pierwsza pozycja
     * @param firstSpeed zmiana pierwszej pozycji w każdym kroku
     * @param secondPostiion druga pozycja
     * @param secondSpeed zmiana drugiej pozycji w każdym kroku
     *
     * @return ilość kroków do wykonania aby się spotkać lub minąć
     */
    private static int timeToMeet(int firstPosition, int firstSpeed, int secondPostiion, int secondSpeed) {
        return Integer.MIN_VALUE;
    }
}
