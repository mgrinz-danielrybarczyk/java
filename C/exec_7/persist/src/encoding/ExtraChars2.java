package encoding;

public class ExtraChars2 {

    public static void main(String[] args) {

        System.out.println("Odliczanie od 1 do 10 na biało:");
        System.out.println("\u2460");   // 1 w białym okręgu
		System.out.println("\u2461");
		System.out.println("\u2462");
		System.out.println("\u2463");
		System.out.println("\u2464");
		System.out.println("\u2465");
		System.out.println("\u2466");
		System.out.println("\u2467");
		System.out.println("\u2468");
		System.out.println("\u2469");
        // Kolejne symbole reprezentujące liczby do 10 włącznie są kolejnymi wartościami w sekwencji.


        System.out.println("Litery alfabetu do A do K w okręgach:");
        System.out.println("\u24B6");   // Litera A w okręgu
		System.out.println("\u24B7"); 
		System.out.println("\u24B8"); 
		System.out.println("\u24B9"); 
		System.out.println("\u24BA"); 
		System.out.println("\u24BB"); 
		System.out.println("\u24BC"); 
		System.out.println("\u24BD"); 
		System.out.println("\u24BE"); 
		System.out.println("\u24BF"); 
		System.out.println("\u24C0"); 
        // Kolejne symbole reprezentujące litery do K włącznie są kolejnymi wartościami w sekwencji


        System.out.println("Egipskie hieroglify:");
        System.out.println(Character.toChars(0x130D2));  // Bawół
        // Dowolne 5 hieroglifów z zakresu od 0x130D2 do 0x130FC
		System.out.println(Character.toChars(0x130D3));
		System.out.println(Character.toChars(0x130D4));
		System.out.println(Character.toChars(0x130D5));
		System.out.println(Character.toChars(0x130D6));
    }
}
