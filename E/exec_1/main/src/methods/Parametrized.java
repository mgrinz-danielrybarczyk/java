package methods;

public class Parametrized {

    public static void main(String[] args) {
     
         /*
            1. Przekształć poniższy fragment kodu w metodę, aby dało się jej użyć do wyświetlenia
            popularności danego języka. Metoda powinna umożliwiać podanie języka i jego popularności
            w promilach (0,1 procenta).

            Wykorzystaj metodę do wyświetlenia popularności języków: Java (15,0%), Python (8,5%) oraz JavaScript (2,7%).

         */
        String language = "Java";
        int popularity = 150;

        System.out.println(language + ": " + (popularity / 10) + "," + (popularity % 10) + "%");
     
     
         /*
            2. Przekształć poniższy fragment kodu w metodę, aby dało się jej użyć do wyświetlenia
            kwadratu (z gwiazdek) o wskazanym rozmiarze.

            Wykorzystaj metodę do wyświetlenia 4 kwadratów o różnych rozmiarach.

         */
        int size = 5;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == 0 || row == (size - 1)) {
                    System.out.print("*");
                } else if (col == 0 || col == (size - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
     
         /*
            3. Napisz metodę, która poprosi użytkownika o podanie przeciwieństwa do wskazanego słowa.
            Metoda powinna przyjąć jako parametr słowo do wyświetlenia oraz słowo będące przeciwieństwem
            (poprawną odpowiedź). Metoda powinna wyświetlić użytkownikowi czy odpowiedział poprawnie czy nie.

            Wykorzystaj metodę do uzyskania odpowiedzi dla 4 słów.

         */
     
     
         /*
            4. Napisz metodę, która wyświetli nagłówek tekstu. Nagłówek powinien mieć ustalony rozmiar,
            np. 100 znaków i składa się z treści nagłówka oraz znaków "estetycznych". Znaki estetyczne,
            to np. znak "=" albo "*". Znaki estetyczne powinny być w równej ilości przed treścią nagłówka
            i po treści nagłówka. Między treścią nagłowka, a znakami estetycznymi musi wystąpić pojedyncza
            spacja.

            UWAGA: Jeżeli treść nagłowka będzie dłuższa od wskazanego rozmiaru nagłówka, to należy przyjąć,
            że rozmiar nagłowka jest równy długości treści powiększonej o 4 znaki. W ten sposób z lewej i z
            prawej strony treści zawsze będzie miejsce na przynajmniej jeden znak estetyczny i pojedynczą spację.

            Metoda jako parametry powinna przyjąć kolejno: rozmiar nagłówka, treść nagłówka oraz pojedynczy
            symbol reprezentujący znak estetyczny.

            Wykorzystaj metodę do wyświetlenia 3 nagłówków o różnej treści, długości i symolu estetycznym.

         */

    }

}