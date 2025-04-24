package variables;

public class Calculations2 {

    public static void main(String[] args) {

        // Algorytm obliczania zapotrzebowania kalorycznego według wzoru BMR metodą Mifflin-St Jeor,
        // z uwzględnieniem współczynnika aktywności fizycznej.

        // 1. Pomnóż wagę wyrażoną w kilogramach przez 9,99
        // 2. Pomnoż wzrost wyrażony w centrymetrach prezz 6,25
        // 3. Pomnóż wiek wyrażony w latach przez 4,92
        // 4. Wynik z pkt 1. dodaj do wyniku z pkt 2. i odejmij wynik z pkt 3.
        // 5. Wynik z pkt 4. zmodyfikuj o współczynnik płci (dodaj 5 dla mężczyzny, lub odejmij 161 dla kobiety)
        // 6. Wynik z pkt. 6 pomnóż przez współczynnik aktywności fizycznej, aby uzyskać docelowe
        //    zapotrzebowanie kaloryczne
        //
        //    Współczynniki aktywności fizycznej:
        //
        //      1.2     - przy pracy siedzącej i braku aktywności fizycznej
        //      1.4     - przy pracy siedzącej i niskiej aktywności fizycznej (1-2 treningi w tygodniu)
        //      1.6     - przy pracy siedzącej i średniej aktywności fizycznej (3-4 treningi w tygodniu)
        //      1.8     - przy pracy fizycznej i średniej aktywnosci fizycznej (3-4 treningi w tygodniu)
        //      2.0     - przy bardzo wysokiej aktywności fizycznej (codzienne treningi, sportowcy)

        System.out.println("Wzrost w centymetrach: " + 170);
        System.out.println("Waga w kilogramach: " + 98);
        System.out.println("Wiek w latach: " + 36);
        System.out.println("Współczynnik płci: " + 5);

        System.out.println();
        System.out.println("Rozpoczynamy obliczenia...");
        System.out.println();

        // 1. Pomnóż wagę wyrażoną w kilogramach przez 9,99
        System.out.println("Waga pomnożona przez 9,99: " + 0);

        // 2. Pomnoż wzrost wyrażony w centrymetrach prezz 6,25
        System.out.println("Wzrost pomnożony przez 6,25:" + 0);

        // 3. Pomnóż wiek wyrażony w latach przez 4,92
        System.out.println("Wiek pomnożony przez 4,92: " + 0);

        // 4. Wynik z pkt 1. dodaj do wyniku z pkt 2. i odejmij wynik z pkt 3.
        System.out.println("Wynik nie uwzględniająćy płci: " + 0);

        // 5. Wynik z pkt 4. zmodyfikuj o współczynnik płci (dodaj 5 dla mężczyzny, lub odejmij 161 dla kobiety)
        System.out.println("Wynik z uwzględnieniem płci: " + 0);

        // 6. Wynik z pkt. 6 pomnóż przez współczynnik aktywności fizycznej, aby uzyskać docelowe
        //    zapotrzebowanie kaloryczne
        System.out.println();
        System.out.println("Docelowe zapotrzebowanie kaloryczne: " + 0);
    }
}