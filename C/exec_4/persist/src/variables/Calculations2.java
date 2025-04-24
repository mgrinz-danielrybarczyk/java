package variables;
import java.util.Scanner;

public class Calculations2 {

    public static void main(String[] args) {

        // Algorytm obliczania zapotrzebowania kalorycznego według wzoru BMR metodą Mifflin-St Jeor,
        // z uwzględnieniem współczynnika aktywności fizycznej.

        // 1. Pomnóż wagę wyrażoną w kilogramach przez 9,99
        // 2. Pomnoż wzrost wyrażony w centrymetrach prezz 6,25
        // 3. Pomnóż wiek wyrażony w latach przez 4,92
        // 4. Wynik z pkt 1. dodaj do wyniku z pkt 2. i odejmij wynik z pkt 3.
        // 5. Wynik z pkt 4. zmodyfikuj o współczynnik płci (dodaj 5 dla mężczyzny, lub odejmij 161 dla kobiety)
        // 6. Wynik z pkt. 5 pomnóż przez współczynnik aktywności fizycznej, aby uzyskać docelowe
        //    zapotrzebowanie kaloryczne
        //
        //    Współczynniki aktywności fizycznej:
        //
        //      1.2     - przy pracy siedzącej i braku aktywności fizycznej
        //      1.4     - przy pracy siedzącej i niskiej aktywności fizycznej (1-2 treningi w tygodniu)
        //      1.6     - przy pracy siedzącej i średniej aktywności fizycznej (3-4 treningi w tygodniu)
        //      1.8     - przy pracy fizycznej i średniej aktywnosci fizycznej (3-4 treningi w tygodniu)
        //      2.0     - przy bardzo wysokiej aktywności fizycznej (codzienne treningi, sportowcy)


        double height = 175;
        double weight = 69.5;
        double age = 27;
        double sexFactorM = 5;
        double sexFactorF = -161;
        double fitValue = 1.6;
        
        String currentSex = "M";
        
        System.out.println("Wzrost w centymetrach: " + height);
        System.out.println("Waga w kilogramach: " + weight);
        System.out.println("Wiek w latach: " + age);
        
        if(currentSex.equals("M")){
            System.out.println("Współczynnik płci: " + sexFactorM);
        }
        else{
             System.out.println("Współczynnik płci: " + sexFactorF);
         }
        
        System.out.println();
        System.out.println("Rozpoczynamy obliczenia...");
        System.out.println();
        
        
        
        // 1. Pomnóż wagę wyrażoną w kilogramach przez 9,99
                
           double weightX = weight * 9.99;
        System.out.println("Waga pomnożona przez 9,99: " + weightX);

        // 2. Pomnoż wzrost wyrażony w centrymetrach prezz 6,25
  
            double heightX = height * 6.25;
            System.out.println("Wzrost pomnożony przez 6,25:" + heightX);

        // 3. Pomnóż wiek wyrażony w latach przez 4,92
        
            double ageX=age * 4.92;
            System.out.println("Wiek pomnożony przez 4,92: " + ageX);

        // 4. Wynik z pkt 1. dodaj do wyniku z pkt 2. i odejmij wynik z pkt 3.
        
        double whaValue = weightX + heightX - ageX; 
        System.out.println("Wynik nie uwzględniająćy płci: " + whaValue);

        // 5. Wynik z pkt 4. zmodyfikuj o współczynnik płci (dodaj 5 dla mężczyzny, lub odejmij 161 dla kobiety)

        double sexValueM = whaValue + sexFactorM;
        double sexValueF = whaValue + sexFactorF;
          
        if(currentSex.equals("M")){
        System.out.println("Wynik z uwzględnieniem płci: " + sexValueM);
        }
        else{
            System.out.println("Wynik z uwzględnieniem płci: " + sexValueF);
        }

        // 6. Wynik z pkt. 5 pomnóż przez współczynnik aktywności fizycznej, aby uzyskać docelowe
        //    zapotrzebowanie kaloryczne
        
        double kcal;
        if(currentSex.equals("M")){
         kcal = sexValueM * fitValue;
        }
        else{
         kcal = sexValueF * fitValue;
        }
        System.out.println();
        System.out.println("Docelowe zapotrzebowanie kaloryczne: " + kcal);
    }
}

