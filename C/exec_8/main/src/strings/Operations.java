package strings;

import java.util.Scanner;

public class Operations {

    public static void main(String[] args) {


        // ---
        // SEKCJA 1: TWORZENIE I DEKLAROWANIE NAPISÓW
        // ---
		
		Scanner scanner = new Scanner(System.in);
		String string = new String("Testowy tekst");
		System.out.println(string);
		String stringTest = "Testowy tekst";
		String stringTestEquals = "Testowy tekst";
		boolean test1 = string == stringTest;
		System.out.println("Wynik == : " + test1);
		boolean test2 = string.equals(stringTestEquals);
		System.out.println("Wynik equals : " + test2);
		
		System.out.println("Czy Testowy tekst zaczyna się od Testo: " + stringTest.startsWith("Testo"));	
		boolean test4 = stringTest.indexOf("Testo") == 0;
		System.out.println("Czy Testowy tekst zaczyna się od Testo indexOf: " + test4);

		System.out.println("Czy Testowy tekst kończy się na ekst: " + stringTest.endsWith("ekst"));
		
		

		boolean test6 = stringTest.lastIndexOf("ekst") == stringTest.length() - "ekst".length();
		System.out.println("Czy Testowy tekst zaczyna się od Testo lastIndexOf: " + test6);

		
        System.out.println("-- Twoje dane identyfikacyjne --\n");
        System.out.print("\tPodaj swoje imię: ");
		
        //System.out.println("Daniel");   // Uzupełnij swoim imieniem
		//String name = "Daniel";
		
		String name = scanner.nextLine();
        System.out.println("\tTwoje imię to: " + name);   // Uzupełnij swoim imieniem, ale wykorzystaj zmienną

        System.out.print("\tPodaj swoje nazwisko: ");
		
        //System.out.println("Rybarczyk");   // Uzupełnij swoim nazwiskiem
		//String surname = "Rybarczyk";
		
		String surname = scanner.nextLine();
        System.out.println("\tTwoje nazwisko to: " + surname);   // Uzupełnij swoim nazwiskiem, ale wykorzystaj zmienną
        System.out.println("\tTwoje nazwisko to: " + surname);   // Uzupełnij swoim nazwiskiem, ale wykorzystaj zmienną

        System.out.print("\tTwoje pełne dane: ");
        //System.out.println("Daniel" + " " + "Rybarczyk");   // Uzupełnij swoim imieniem i nazwiskiem, stosując operator +
        System.out.println(name.concat(" ").concat(surname));   // Uzupełnij swoim imieniem i nazwiskiem, stosując metodę concat

        String fullName = name + " " + surname;
        System.out.println(fullName);   // Uzupełnij swoim imieniem i nazwiskiem, stosując zmienną fullName

        // ---
        // SEKCJA 2: PORÓWNYWANIE NAPISÓW
        // ---

        System.out.println("\n-- Pytania kontrolne --\n");

        // Wykorzystaj zmienne typu boolean do zapisania wyników pytań kontrolnych, jak poniżej
        boolean firstNameSameAsLastName = name.equals(surname);
		boolean firstNameSameAsLastNameTest = name == surname;

        System.out.println("\tCzy Twoje imię jest takie samo jak nazwisko? " + firstNameSameAsLastName);
        System.out.println("\tCzy Twoje imię jest takie samo jak nazwisko? TEST== " + firstNameSameAsLastNameTest);

		boolean nameAleksandra = name.equals("Aleksandra");
        System.out.println("\tCzy Twoje imię, to \"Aleksandra\"? " + nameAleksandra);

		boolean nameConcat = name.equals("Aleks".concat("andra"));
        System.out.println("\tCzy Twoje imię, to połączenie słow \"Aleks\" i \"andra\"? " + nameConcat);

		boolean nameKleofiks = !(name.equals("Kleofiks"));
		boolean nameKleofiksTest = name != "Kleofiks";

        System.out.println("\tCzy Twoje imię, to nie \"Kleofiks\"? " + nameKleofiks);
        System.out.println("\tCzy Twoje imię, to nie \"Kleofiks\"? TEST!=" + nameKleofiksTest);

		boolean compareNames = name.compareTo("Krzysztof") < 0;
        System.out.println("\tCzy Twoje imię jest w słowniku przed \"Krzysztof\"? "  + compareNames);

		boolean compareSurnameName = surname.compareTo(name) < 0;
        System.out.println("\tCzy Twoje nazwisko jest w słowniku przed Twoim imieniem? " + compareSurnameName);

		boolean comparePlemie = Math.abs(name.compareTo("Plemie")) < Math.abs(surname.compareTo("Plemie"));
        System.out.println("\tCzy Twoje imię jest w słowniku bliżej słowa \"Plemie\" niż Twoje nazwisko? " + comparePlemie);

		boolean compareNameAndSurname = name.length() > surname.length();
        System.out.println("\tCzy Twoje imię jest dłuższe od Twojego nazwiska? "  + compareNameAndSurname);

		boolean lastLetterInName1 = name.endsWith("a");
		boolean lastLetterInName2 = name.lastIndexOf("a") == name.length() - 1;
        System.out.println("\tCzy Twoje imię kończy się na literę 'a'? " + lastLetterInName2);

		//boolean sameNameFromStartAndFromEnd = name.lastIndexOf(name);
        //System.out.println("\tCzy Twoje imię pisane od tyłu i przodu jest takie same? " + sameNameFromStartAndFromEnd);

		//boolean sameNameFromStartAndFromEndOtto = "Otto".lastIndexOf("Otto");
       // System.out.println("\tCzy imię \"Otto\" pisane od tyłu i przodu jest takie same? ");

        // ---
        // SEKCJA 3: WYSZUKIWANIE W NAPISACH
        // ---

        System.out.println("\n-- Praca z tekstem --\n");

        String sourceText = "Kilka imion dzieci, które były popularne w Polsce w roku 2018: " +
                "Antoni, Julia, Jakub, Zuzanna, Jan, Zofia, Szymon, Lena, Franciszek, Maja, " +
                "Filip, Hanna, Aleksander, Alicja, Mikołaj, Maria, Wojciech, Daniel, Rybarczyk, Aleksandra.\n" +
                "\tTymczasem Archimedes wykrzynął \"Eureka!\" kiedy wymyślił podstawowe prawo hydrostatyki. " +
                "Czy \"Eureka\" nadawałoby się na imię dla dziecka?\n";
        System.out.println("\tTekst źródłowy: \n\n\t" + sourceText);

        // W kolejnych liniach nie deklaruj i nie korzystaj z nowych zmiennych.
        // W wywołaniach System.out.println(...) użyj wyniku odpowiednich metod klasy String.

		
        System.out.println("\tCzy Twoje imię znajduje się w tekście? " + sourceText.contains(name));

        System.out.println("\tCzy Twoje nazwisko znajduje się w tekście? " + sourceText.contains(surname));

        System.out.println("\tPod jakim indeksem pierwszy raz występuje Twoje imię? " + sourceText.indexOf(name));

        System.out.println("\tPod jakim indeksem występuje ostatni raz słowo \"Eureka\"? " + sourceText.lastIndexOf("Eureka"));
		System.out.println("\tPod jakim indeksem występuje ostatni raz słowo \"Kolendra\"? " + sourceText.indexOf("Kolendra"));
		System.out.println("\tPod jakim indeksem występuje ostatni raz słowo \"Rozmaryn\"? " + sourceText.lastIndexOf("Rozmaryn"));

        System.out.println("\tCzy w tekście znajduje się słowo \"Staw\" (bez uwzględnienia wielkości znaków)? " + sourceText.toLowerCase().contains("Staw".toLowerCase()));

        // ---
        // SEKCJA 4: MODYFIKOWANIE NAPISÓW
        // ---

        // W kolejnych liniach odnosisz się dalej do tekstu w zmiennej sourceText
        // W kolejnych liniach nie deklaruj i nie korzystaj z nowych zmiennych.
        // W wywołaniach System.out.println(...) użyj wyniku odpowiednich metod klasy String.

        System.out.println("\tIle znaczących znaków (bez białych znaków z przodu i tyłu) ma tekst źródłowy? " + sourceText.trim().length());

        System.out.println("\tPierwsza połowa tekstu źródłowego: " + sourceText.substring(0, sourceText.length()/2));

        System.out.println("\tDruga połowa tekstu źródłowego: " + sourceText.substring(sourceText.length()/2, sourceText.length()));

        //System.out.println("\tFragment tekstu zaczynający się od pierwszej litery Twojego imienia: " + sourceText.substring(sourceText.indexOf(name.substring(0)), sourceText.length()));
		System.out.println("\tFragment tekstu zaczynający się od pierwszej litery Twojego imienia: " + sourceText.substring(sourceText.indexOf(name.charAt(0))));

        System.out.println("\tFragment tekstu kończący się na drugą literę Twojego nazwiska: " + sourceText.substring(0, sourceText.lastIndexOf(surname.charAt(1))));

        System.out.println("\tFragment tekstu zaczynający się na pierwszą literę Twojego imienia i kończący na drugą literę Twojego nazwiska: " 
		+ sourceText.substring( sourceText.indexOf(name.charAt(0)) , sourceText.lastIndexOf(surname.charAt(1)) ));




        System.out.println("\tPierwsze słowo zaczynające się na ostatnią litere Twojego imienia: "  
		+ sourceText.substring(sourceText.toLowerCase().indexOf(" " + name.charAt(name.length() - 1)) + 1
		,                      sourceText.indexOf(" ", sourceText.toLowerCase().indexOf(" " + name.charAt(name.length() - 1)) + 1 )));

        System.out.println("\tPierwsze słowo zaczynające się na pierwszą literę Twojego nazwiska: " + 
		sourceText.substring(sourceText.indexOf(" " + surname.charAt(0)) + 1,sourceText.indexOf(" ", sourceText.indexOf(" " + surname.charAt(0)) + 1)));

		int positionOfFirstSpace = sourceText.indexOf(" ");
		int positionOfSecondSpace = sourceText.indexOf(" ", positionOfFirstSpace + 1);
		int positionOfThirdSpace = sourceText.indexOf(" ", positionOfSecondSpace + 1);
		String thirdWord = sourceText.substring(positionOfSecondSpace + 1, positionOfThirdSpace);
        System.out.println("\tTrzecie słowo w tekście: " + thirdWord);

		//System.out.println("\tUwaga wycinam tekst dłuższy niż cały źródłowy: " + sourceText.substring(0, sourceText.length() + 10));


    }
}
