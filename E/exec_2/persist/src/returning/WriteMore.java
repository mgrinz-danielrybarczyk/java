package returning;

public class WriteMore {

    public static void main(String[] args) {

        // Dostarcz poniżej po trzy różne przypadki użycia wskazanych metod
		{
			 String fragment = getFragment("1;Alicja;Kowalska;67;;180", ';', -1);
			 System.out.println(fragment);
		}
		
		{
			 String fragment = getFragment("1;Alicja;Kowalska;67;;180", ';', 10);
			 System.out.println(fragment);
		}
		
		{
			 String fragment = getFragment("1;Alicja;Kowalska;67;;180", ';', 4);
			 System.out.println(fragment);
		}
		
		{
			String data = "1:Alicja;Kowalska;67;;180\n2:Tomasz;Nowak;30;96;185\n3:Jan;Kowal;19;76;180";
			char separator = ';';
			String searchedData = "Nowak";
			String lineId = inWhichRowThereIsData(data, separator, searchedData);
			
			System.out.printf(
			"Dla podanych wierszy: %n---%n%s%n---%nfragment '%s' występuje w wierszu o Id:%s",
			data, searchedData, lineId
			);
		}
    }
	


    /*
        Tutaj dostarcz kod pierwszej metody.

        Metoda powinna przyjąć trzy parametry. Pierwszy jest tekstem (danymi), drugi symbolem separatora, a trzeci numerem fragmentu.
        Tekst powinien zostać podzielony na fragmenty na podstawie separatora.
        Fragmenty mogą być puste w przypadku gdy separator występuje dwa razy po sobie.

        Metoda powinna zwrócić wartość wskazanego fragmentu. Fragmenty liczymy od `0`.

        Przykład:
        Tekst wejściowy: "1;Alicja;Kowalska;67;;180"
        Separator: ;
        Numer fragmentu: 3

        Wynik: "67"

        Numer fragmentu: 4

        Wynik: "" (pusty tekst)
     */
		 public static String getFragment(String text, char separator, int fragmentNo) {
			String fragment = "";
			int i = 0;
			char c;
			int currentFragmentNo = 0;
			
			if (fragmentNo < 0) {
				System.out.println("Ujemny numer fragmentu tekstu");
				return fragment;
			}
			
			while (i < text.length()) {	
				c = text.charAt(i);
				if (c != separator) {
					fragment += c;
					
				} else {
					if (currentFragmentNo == fragmentNo) {
						return fragment;
					}
					currentFragmentNo++;
					fragment = "";
				}
				i++;
			}
			
			if (currentFragmentNo < fragmentNo) {
				System.out.println("Za duży numer fragmentu tekstu");
				return fragment;
			}
			
			return fragment;
	 }

	 



    /*
        Tutaj dostarcz kod drugiej metody.

        Metoda powinna przyjąć trzy parametry. Pierwszy jest tekstem (danymi), drugi symbolem separatora, a trzeci wyszukiwaną frazą.
        Tekst jest wieloliniowy i każda jego linia powinna zostać podzielona na fragmenty na podstawie separatora.
        Fragmenty mogą być puste w przypadku gdy separator występuje dwa razy po sobie. Przyjmujemy, że pierwszy fragment nigdy nie jest
        pusty i reprezentuje numer wiersza (lub jego identyfikator). Metoda powinna odnależć w tekście pierwszy wiersz,
        który zawiera fragment w całości zgodny z wyszukiwaną frazą.

        Metoda powinna zwrócić wartość numeru wiersza, w którym znaleziono wyszukiwany fragment.

        Przykład:
        Testk wejściowy: "1:Alicja;Kowalska;67;;180\n2:Tomasz;Nowak;30;96;185\n3:Jan;Kowal;19;76;180"
        Separator: ";"
        Wyszukiwana fraza: "Nowak"

        Wynik: 2

        Wyszukiwana fraza: "180"

        Wynik: 1
     */
	 
	 public static String inWhichRowThereIsData(String data, char separator, String searchedData) {
		int i = 0;
		String line;
		while (true) {
			line = getFragment(data, '\n', i);
			
			if (line.equals("")) {
				System.out.println("Nic nie znaleziono");
				break;
			}
			
			String lineId = getLineId(line);
			
			String content = getContent(line);
			
			int fragmentsCount = fragmentCount(content, separator);
			
			if(containsFragment(fragmentsCount, content, separator, searchedData)) {
				return lineId;
			}
			i++;
		}
		return "";		
	 }
	 
	 public static String getLineId(String line) {
		 String lineId = line.substring(0, line.indexOf(':'));
		 return lineId;
	 }	 
	 
	 public static String getContent(String line) {
		String content = line.substring(line.indexOf(':') + 1);
		return content;
	 }	 
	 
	 public static int fragmentCount(String content, char separator) {
		int fragmentsCount = 1;
		int indexOfSeparator = -1;
		do {
			indexOfSeparator = content.indexOf("" + separator, indexOfSeparator + 1);
			if (indexOfSeparator >= 0) {
				fragmentsCount++;
			}
		} while (indexOfSeparator >= 0);
		return fragmentsCount;
	 }	 
	 
	 public static boolean containsFragment(int fragmentsCount, String content, char separator, String searchedData) {
		String fragment;
		int j = 0;
		while(j < fragmentsCount) {
			fragment = getFragment(content, separator, j);
			if (fragment.equals(searchedData)) {
				return true;
			}
			j++;
		}
		return false;
	 }
	 
}
