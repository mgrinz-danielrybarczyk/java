package statements;

public class Typing {

    public static void main(String[] args) {
        /*

            Twoim zadaniem jest napisanie programu, który będzie wyświetlał użytkownikowi kolejne słowa.
            Zadaniem użytkownika jest przepisanie poprawnie tego słowa. Każde słowo jest punktowane:
            - jeżeli zostało przepisane bezbłędnie, to otrzymuje tyle punktów ile znaków w słowie,
            - jeżeli zostało przepisane bezblędnie, ale bez rozróżniania dużych i małych liter,
            to otrzymuje 0,5 punkta za każdy znak w tym słowie,
            - w przeciwnym razie nie dostaje punktów za słowo.

            Gra trwa do momentu gdy zostaną przepisane wszystkie słowa lub gdy po wpisaniu kolejnego
            słowa gra trwa już dłużej niż 1 minutę.

            Na zakończenie gry wyświetl użytkownikowi liczbę zdobytych punktów oraz jego skuteczność,
            a więc procent zdobytych punktów do wszystkich, które mógł zdobyć. Wyświetl również informacje
            o maksymalnej możliwej ilości punktów do zdobycia wynikającej z długości całego tekstu
            bez znaków średnika.

            Całe zadanie zrealizujesz metodą od szczegółu do ogółu, a więc najpierw zaimplementujesz
            fragmenty pełnego rozwiązania, aby potem je połączyć.

            Zadania dodatkowe:
            1. Po zrealizowaniu wersji gry jednorazowej możesz wykorzystać zewnętrzną pętle,
            aby gra rozegrała się przynajmniej jeden raz, a potem użytkownik mógł zadecydować czy gra dalej
            czy nie.
            2. Możesz zapamiętać najlepszy wynik gracza ze wszytskich jego gier i wyświetlić go na sam koniec,
            gdy zrezygnuje z dalszej rozrywki.
            3. Możesz zmienić algorytm punktacji i punktować osobno każdy poprawnie wpisany znak, a nie
            całe napisy. W ten sposób obniżysz poziom trudności rozgrywki.

         */

        /*
            Napisz fragment kodu, który dla zadanego tekstu obliczy maksymalną ilość punktów do zdobycia.
         */

        String data = "Ania;je;jabłko;Ma;rumiane;policzki;Paweł i Robert;zrywają;jabkła z jabłoni;" +
                "Jedzą;dojrzałe, żółte gruszki;Piją zimną;krystaliczną wodę;Ania;zrywa;truskawki;Żeby;później;" +
                "zrobić z nich dżem;Paweł i Robert;uwielbiają;dżem Ani;Gdy nadchodzi jesień;cała kuchnia;" +
                "pachnie konfiturami;Ani Robert;otwiera;słoik z kompotem;z czereśni;Paweł;piecze;malinową;tartę";

        double maxPoints;
        {
            maxPoints = -1;
        }


        /*
            Napisz fragment kodu, który dla zadanego tekstu odnajdzie ostatnie wystąpienie w nim symbolu
            średnika, a następnie wylosuje wartość liczbową od 0 do pozycji, na której występuje ten średnik.
         */

        int position;
        {
            String separator = ";";
            position = -1;
        }


        /*
            Napisz fragment kodu, który dla zadanej pozycji znajdzie pierwszy średnik od tej pozycji
            oraz zapamięta napis występujący po tym średniku do następnego średnika lub końca tekstu.
         */

        String text;
        {
            text = "";
        }


        /*
            Napisz fragment kodu, który porówna dwa napisy i obliczy wartość punktową na podstawie
            zgodności drugiego napisu z pierwszym i zasad opisanych na początku klasy
         */

        String userText = "";
        double points;
        {
            points = -1;
        }


        /*
            Napisz fragment kodu, który będzie działał tak długo, aż nie minie przynajmniej 1 minuta.
            Czas sprawdzaj korzystając z metody System.currentTimeMillis, która zwraca liczbę milisekund,
            które upłynęło od północy 1 stycznia 1970 roku.
         */

        long startTime = -1;
        {
            long currentTime = -1;
        }


        /*
            Wykorzystaj wszystkie dotychczasowe fragmenty kodu, aby zbudować pełne rozwiązanie.
            Gdy wdrożysz dany fragment w pełnym rozwiązaniu, to zakomentuj go lub usuń.

            Uzupełnij je o dodatkowe elementy, które pojawiły się w opisie zadania.
         */
    }
}
