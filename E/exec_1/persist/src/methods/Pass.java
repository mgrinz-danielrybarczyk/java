package methods;

public class Pass {

    public static void main(String[] args) {

        // Metoda showCalculations powinna wyświetlić przekazane wartości oraz wykonać na nich obliczenia
        // z użyciem przekazanego operatora. Całość powinna zostać wyświetlona w jednej linii.
        showCalculations("+", 10, 20, 30);     // Oczekiwany wynik: 60
        showCalculations("-", 50, 15, 10);     // Oczekiwany wynik: 25
        showCalculations("*", 5, 5, 5);        // Oczekiwany wynik: 125
        showCalculations("/", 100, 5, 10);     // Oczekiwany wynik: 2

        // Metoda askQuestion powinna wyświetlić pytanie oraz zestaw odpowiedzi. Numer poprawnej odpowiedzi
        // wskazywany jest przez drugi argument metody. Odpowiedź powinien wybrać użytkownik.
        // Metoda powinna wyświetlić informację czy użytkownik dobrze odpowiedział.
        askQuestion("Jakie miasto jest stolicą Polski?", 3, "Kraków", "Wrocław", "Warszawa");
        askQuestion("Jakie Państwo jest najludniejsze?", 4, "Polska", "Rosja", "Hiszpania", "Anglia");
        askQuestion("Który język programowania jest najpopularniejszy?", 1, "Java", "Python", "JavaScript", "C", "C++");
    }
}
