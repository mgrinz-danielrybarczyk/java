package variables;

public class Calculations {

    public static void main(String[] args) {

        // Algorytm obliczania koniecznego spadku wagi ciała, w celu uzyskania docelowego wyniku BMI

        // 1. Oblicz wartość wzorstu wyrażoną w metrach na podstawie wzrostu wyrażonego w centymetrach.
        // 2. Oblicz wartość wzrostu wyrażoną w metrach i podniesioną do kwadratu.
        // 3. Oblicz obecne BMI poprzez podzielenie wagi w kilogramach przez wzrost wyrażony w metrach
        //    i podniesiony do kwadratu.
        // 4. Oblicz różnicę między BMI obecnym, a BMI docelowym.
        // 5. Oblicz potrzebną zmianę wagi jako wynik mnożenia różnicy BMI i wzrostu wyrażonego w metrach
        //    i podniesionego do kwadratu.
        
        double heightCm = 175;
        double weight = 70;
        double bmi = 25;


        System.out.println("Wzrost w centymetrach: " + heightCm);
        System.out.println("Waga w kilogramach: " + weight);
        System.out.println("Docelowe BMI: " + bmi);

        System.out.println();
        System.out.println("Rozpoczynamy obliczenia...");
        System.out.println();

        // 1. Oblicz wartość wzorstu wyrażoną w metrach na podstawie wzrostu wyrażonego w centymetrach.
        double heightM = heightCm/100;
        System.out.println("Wzrost wyrażony w metrach: " + heightCm);

        // 2. Oblicz wartość wzrostu wyrażoną w metrach i podniesioną do kwadratu.
        double heightMSquare=heightM*heightM;
        System.out.println("Wzrost wyrażony w metrach i podniesiony do kwadratu: " + heightMSquare);

        // 3. Oblicz obecne BMI poprzez podzielenie wagi w kilogramach przez wzrost wyrażony w metrach
        //    i podniesiony do kwadratu.
        double currentBmi=(weight/heightMSquare);
        System.out.println("Obecne BMI: " + currentBmi);

        // 4. Oblicz różnicę między BMI obecnym, a BMI docelowym.
        double bmiDiff=currentBmi-bmi;
        System.out.println("Różnica między BMI obecnym, a BMI docelowym: " + bmiDiff);

        // 5. Oblicz potrzebną zmianę wagi jako wynik dzielenia różnicy BMI przez wzrost wyrażony w metrach
        //    i podniesiony do kwadratu.
        double changeWeight=(bmiDiff/heightMSquare);
        System.out.println("Docelowa zmiana wagi: " + changeWeight);
    }
}