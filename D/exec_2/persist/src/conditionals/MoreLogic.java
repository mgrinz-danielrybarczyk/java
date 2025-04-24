package conditionals;

import java.util.Random;

public class MoreLogic {

    public static void main(String[] args) {

        Random r = new Random();

        /*
            Oblicz wynagrodzenie pracownika składające się z wynagrodzenia podstawowego oraz premii.

            Wynagrodzenie zasadnicze obliczane jest jako iloczyn przepracowanych godzin i stawki godzinowej.

            Premia w wysokości 5% przysługuje od całości wynagrodzenia jeżeli pracownik przepracował
            120 godzin lub więcej.

            Zaimplementuj fragment kodu, w którym określisz wysokość wynagrodzenia pracownika.
         */
        System.out.println("\n--- Wynagrodzenie pracownika w wersji 1 ---");
        double employeeSalary = 0.0;
        {
            double hourlyPay = 10.0 + (10 * r.nextDouble());
            int workedHours = 100 + r.nextInt(100);
			if (workedHours >= 120) {
				employeeSalary = hourlyPay * workedHours * 1.05;
			} else {
				employeeSalary = hourlyPay * workedHours;
			}
            System.out.println("Stawka godzinowa: " + hourlyPay);
            System.out.println("Przepracowane godziny: " + workedHours);
        }
        System.out.println("Wynagrodzenie pracownika: " + employeeSalary);


        /*
            Ponownie oblicz wynagrodzenie pracownika.

            Sposób obliczania wynagrodzenia pracownika nie zmienia się.

            Premia obliczana jest według poniższych zasad:
            - kiedy przepracował od 120 do 159 godzin jego premia wynosi 10% zasadniczego wynagrodzenia.
            - kiedy przepracował od 160 do 179 godzin jego premia wynosi 7% zasadniczego wynagrodzenia.
            - kiedy przepracował 180 godzin i więcej jego premia wynosi %5 zasadniczego wynagrodzenia.

            Zaimplementuj fragment kodu, w którym określisz wysokość wynagrodzenia pracownika.
         */
        System.out.println("\n--- Wynagrodzenie pracownika w wersji 2 ---");
        employeeSalary = 0.0;
        {
            double hourlyPay = 10.0 + (10 * r.nextDouble());
            int workedHours = 100 + r.nextInt(100);
			if (workedHours >= 120 && workedHours <= 159) {
				employeeSalary = hourlyPay * workedHours * 1.1;
			} else if (workedHours >= 160 && workedHours <= 179) {
				employeeSalary = hourlyPay * workedHours * 1.07;
			} else if (workedHours >= 180) {
				employeeSalary = hourlyPay * workedHours * 1.05;
			} else {
				employeeSalary = hourlyPay * workedHours;
			}
            System.out.println("Stawka godzinowa: " + hourlyPay);
            System.out.println("Przepracowane godziny: " + workedHours);
        }
        System.out.println("Wynagrodzenie pracownika: " + employeeSalary);


        /*
            Ponownie obliczymy wynagrodzenie pracownika, ale algorytmem, który bardziej promuje
            ciężką pracę.

            Wynagrodzenie zasadnicze obliczane jest w ten sam sposób, ale premia jak poniżej:
            - kiedy przepracował od 120 do 159 godzin jego premia wynosi 5% zasadniczego wynagrodzenia,
            - kiedy przepracował od 160 do 179 godzin jego premia wynosi 5% zasadniczego wynagrodzenia
            ze 159 godzin oraz 7% zasadniczego wynagrodzenia z godzin powyżej 159,
            - kiedy przepracował 180 godzin i więcej jego premia wynosi 5% zasadniczego wynagrodzenia
            ze 159 godzin, 7% zasadniczego wynagrodzenia z 20 godzin oraz 10% zasadniczego wynagrodzenia
            z godzin powyżej 179.

            Zaimplementuj fragment kodu, w którym określisz wysokość wynagrodzenia pracownika.
         */
        System.out.println("\n--- Wynagrodzenie pracownika w wersji 3 ---");
        employeeSalary = 0.0;
        {
            double hourlyPay = 10.0 + (10 * r.nextDouble());
            int workedHours = 100 + r.nextInt(100);
			if (workedHours >= 120 && workedHours <= 159) {
				employeeSalary = hourlyPay * workedHours * 1.05;
			} else if (workedHours >= 160 && workedHours <= 179) {
				employeeSalary = (hourlyPay * 159 * 1.05) + (workedHours - 159) * hourlyPay * 1.07;
			} else if (workedHours >= 180) {
				employeeSalary = (hourlyPay * 159 * 1.05) + (hourlyPay * 20 * 1.07) + (workedHours - 179) * hourlyPay * 1.1;
			} else {
				employeeSalary = hourlyPay * workedHours;
			}
            System.out.println("Stawka godzinowa: " + hourlyPay);
            System.out.println("Przepracowane godziny: " + workedHours);
        }
        System.out.println("Wynagrodzenie pracownika: " + employeeSalary);
    }
}
