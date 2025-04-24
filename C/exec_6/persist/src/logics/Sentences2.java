package logics;

public class Sentences2 {

    public static void main(String[] args) {

        // W pierwszej kolejności zapoznaj się ze prawdami o Marudiksie

        boolean gotUpLeftFoot = true;               // Marudiks wstał lewą nogą
        boolean cursedPoliticians = false;          // Marudiks klął na polityków
        boolean complaintAboutWeather = true;       // Marudiks narzekał na pogodę
        boolean gotBackToBed = false;               // Marudiks wrócił do łóżka spać
        boolean decidedTochange = true;             // Marudiks postanowił się zmienić

        // Podstawowe informacje o Marudiksie
        System.out.println("Marudiks wstał lewą nogą? " + gotUpLeftFoot);
        System.out.println("Marudiks klął na polityków? " + cursedPoliticians);
        System.out.println("Marudiks narzekał na pogodę? " + complaintAboutWeather);
        System.out.println("Marudiks wrócił do łóżka spać? " + gotBackToBed);
        System.out.println("Marudiks postanowił się zmienić? " + decidedTochange);

        // Poniżej znajduje się przykładowe zdanie logiczne i jego reprezentacja w postaci operacji
        // logicznych
        System.out.print("Marudiks wstał lewą nogą i klął na polityków? ");
        System.out.println(gotUpLeftFoot && cursedPoliticians);

        // Na podstawie powyższego przykładu zapisz z użyciem zmiennych kolejne zdania logiczne

        // 1.
        System.out.print("Marudiks wstał lewą nogą ale nie narzekał na pogodę? ");
        System.out.println(gotUpLeftFoot && !complaintAboutWeather);

        // 2.
        System.out.print("Marudiks nie wstał lewą nogą i narzekał na pogodę lub klął na polityków? ");
        System.out.println(!gotUpLeftFoot && (complaintAboutWeather || cursedPoliticians));

        // 3.
        System.out.print("Marudiks wrócił do łóżka spać i wstał lewą nogą i nie postanowi się zmienić? ");
        System.out.println(gotBackToBed && gotUpLeftFoot && !decidedTochange);

        // 4.
        System.out.print("Marudiks wstał lewą nogą i nie wrócił do łóżka i postanowił się zmienić? ");
        System.out.println(gotUpLeftFoot && !gotBackToBed && decidedTochange);

        // 5.
        System.out.print("Marudiks klnął na polityków i wrócił do łóżka albo postanowił się zmienić? ");
        System.out.println(cursedPoliticians && (gotBackToBed ^ decidedTochange));

        // 6.
        System.out.print("Marudiks albo wstał lewą nogą i klnął na polityków albo wstał lewą nogą i narzekał na pogodę lub postanowił się zmienić? ");
        System.out.println((gotUpLeftFoot &&cursedPoliticians) ^ (gotUpLeftFoot && (complaintAboutWeather || decidedTochange)));

        // Analogicznie jak w powyższych przykładach dopisz dwa własne zdania logiczne dotyczące Marudiksa
    }
}
