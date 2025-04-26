package returning;

public class WriteMore {

    public static void main(String[] args) {

        // Dostarcz poniżej po trzy różne przypadki użycia wskazanych metod
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
}
