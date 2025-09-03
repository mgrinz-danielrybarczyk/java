package methods;

import java.util.Scanner;

public class Pass {

    public static void main(String[] args) {
        // Metoda showCalculations powinna wyświetlić przekazane wartości oraz wykonać na nich obliczenia
        // z użyciem przekazanego operatora. Całość powinna zostać wyświetlona w jednej linii.
        showCalculations("+", 10, 20, 30);     // Oczekiwany wynik: 60
        showCalculations("-", 50, 15, 10);     // Oczekiwany wynik: 25
        showCalculations("*", 5, 5, 5);        // Oczekiwany wynik: 125
        showCalculations("/", 100, 5, 10);     // Oczekiwany wynik: 2
		showCalculations("@", 100, 5, 10);     // Oczekiwany wynik: Nieprawidłowa zmienna
        // Metoda askQuestion powinna wyświetlić pytanie oraz zestaw odpowiedzi. Numer poprawnej odpowiedzi
        // wskazywany jest przez drugi argument metody. Odpowiedź powinien wybrać użytkownik.
        // Metoda powinna wyświetlić informację czy użytkownik dobrze odpowiedział.
        askQuestion("Jakie miasto jest stolicą Polski?", 3, "Kraków", "Wrocław", "Warszawa");
        askQuestion("Jakie Państwo jest najludniejsze?", 4, "Polska", "Rosja", "Hiszpania", "Anglia");
        askQuestion("Który język programowania jest najpopularniejszy?", 1, "Java", "Python", "JavaScript", "C", "C++");
    }
	
	public static void showCalculations(String operator, int a, int b, int c) {
		int result;
		switch (operator) {
			 case "+":
			 result = a + b + c;
			 break;
			 case "-":
			 result = a - b - c;
			 break;
			 case "*":
			 result = a * b * c;
			 break;
			 case "/":
			 result = a / b / c;
			 break;
			 default:
			 System.out.println("Nieprawidłowa zmienna");
			 return;
		}
			 System.out.printf("%d %s %d %s %d = %d%n", a, operator, b, operator, c, result);
	}

		public static void askQuestion(String question, int correctAnswer, String firstAnswer, String secondAnswer, String thirdAnswer) {
			askQuestion(question, correctAnswer, firstAnswer, secondAnswer, thirdAnswer, null, null);
	}
	
		public static void askQuestion(String question, int correctAnswer, String firstAnswer, String secondAnswer, String thirdAnswer, String fourthAnswer) {
			askQuestion(question, correctAnswer, firstAnswer, secondAnswer, thirdAnswer, fourthAnswer, null);
		}
	
		public static void askQuestion(String question, int correctAnswer, String firstAnswer, String secondAnswer, String thirdAnswer, String fourthAnswer, String fifthAnswer) {
			printQuestion(question);
			printAnswer(1, firstAnswer);
			printAnswer(2, secondAnswer);
			printAnswer(3, thirdAnswer);
			printAnswer(4, fourthAnswer);
			printAnswer(5, fifthAnswer);
			userAnswerMethod(correctAnswer);
		}
		
		private static void printQuestion(String question) {
			System.out.println(question);		
		}
	
		private static void printAnswer(int answerNumber, String answerText) {
			if (answerText != null && !answerText.isEmpty()) {
				System.out.println("\t" + answerNumber + "." + answerText);
			}				
		}
	
		private static void userAnswerMethod(int correctAnswer) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Wprowadź numerek prawidłowej odpowiedzi: ");
			int userAnswer = scanner.nextInt();
			if (userAnswer == correctAnswer) {
				System.out.println("BRAWO! PRAWIDŁOWA ODPOWIEDŹ!");
			} else if(userAnswer != correctAnswer) {
				System.out.println("Buuuuuuu... Zła odpowiedź!");
			} else {
				System.out.println("Coś ty wprowadził?");
			}
	}
}
