package logics;

public class Sentences {

    public static void main(String[] args) {

        // W pierwszej kolejności zapoznaj się ze prawdami o Kleofiksie

        boolean sleptWell = false;              // Jak spał dzisiaj Kleofiks?
        boolean ateBreakfast = true;            // Kleofiks zjadł śniadanie?
        boolean drankMorningCoffee = true;      // Kleofiks napił się porannej kawy?
        boolean readyToWork = true;            // Czy Kleofiks jest gotowy do pracy?
		
		int age = Prompt.promptInt("Ile masz lat? ");
		
		if(age<18){
			Prompt.promptEnd("Nara: ");
		}
		else{
		
        // Podstawowe informacje o Kleofiksie
        System.out.println("Kleofiks spał dobrze? " + sleptWell);
        System.out.println("Kleofiks zjadł śniadanie? " + ateBreakfast);
        System.out.println("Kleofiks wypił poranną kawę? " + drankMorningCoffee);
        System.out.println("Kleofiks jest gotowy do pracy? " + readyToWork);

        // Poniżej znajduje się przykładowe zdanie logiczne i jego reprezentacja w postaci operacji
        // logicznych
        System.out.print("Kleofiks spał dobrze i zjadł śniadanie? ");
        System.out.println(sleptWell & ateBreakfast);

        // Na podstawie powyższego przykładu zapisz z użyciem zmiennych kolejne zdania logiczne

        // 1.
        System.out.print("Kleofiks zjadł śniadanie lub wypił poranną kawę? ");
        System.out.println(ateBreakfast | drankMorningCoffee);

        // 2.
        System.out.print("Kleofiks spał dobrze lub wypił poranną kawę? ");
        System.out.println(sleptWell | drankMorningCoffee);

        // 3.
        System.out.print("Kleofiks nie spał dobrze i wypił poranną kawę? ");
        System.out.println(!sleptWell & drankMorningCoffee);

        // 4.
        System.out.print("Kleofiks nie jest gotowy do pracy i nie wypił porannej kawy? ");
        System.out.println(!readyToWork & !drankMorningCoffee);

        // 5.
        System.out.print("Kleofiks albo wypił poranną kawę albo zjadł śniadanie i jest gotowy do pracy? ");
        System.out.println(drankMorningCoffee ^ (ateBreakfast & readyToWork));

        // 6.
        System.out.print("Kleofiks spał dobrze i jest gotowy do pracy lub wypił poranną kawę i jest gotowy do pracy? ");
        System.out.println((sleptWell & readyToWork) | (drankMorningCoffee & readyToWork));

        // Analogicznie jak w powyższych przykładach dopisz dwa własne zdania logiczne dotyczące Kleofiksa
		}
    }
}
