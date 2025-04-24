package conditionals;

import java.util.Random;

public class GoTo {

    public static void main(String[] args) {

        Random r = new Random();

        /*
            Poniżej znajdują się zakomentowane bloki kodu z instrukcjami goto.
            Przeanalizuj działanie każdego z bloków kodu i zapisz pod nim analogiczny fragment kodu.
            Korzystaj z tych samych nazw zmiennych i operacji, ale linie z instrukcjami `goto`
            zastąp wykorzystaniem instrukcji if oraz if else
         */

        /* 1. Fragment
        {
            1: int value = r.nextInt(100);
            2: !(value % 2 == 0) goto 4;
            3: System.out.println("Wylosowana wartość jest parzysta: " + value);
            4:
        }
        */

        // Twój kod do 1. Fragmentu:
        {
			int value = r.nextInt(100);
			if (value % 2 == 0) {
				System.out.println("Wylosowana wartość jest parzysta: " + value);
			}
        }

        /* 2. Fragment
        {
            1: int value = r.nextInt(100);
            2: !(value % 2 == 0) goto 4;
            3: System.out.println("Wylosowana wartość jest parzysta: " + value);
            4: !(!(value % 2 == 0)) goto 6;
            5: System.out.println("Wylosowana wartość jest nieparzysta: " + value);
            6:
        }
        */

        // Twój kod do 2. Fragmentu:
        {
			int value = r.nextInt(100);
			if (value % 2 == 0) {
				System.out.println("Wylosowana wartość jest parzysta: " + value);
			}
			else {
				System.out.println("Wylosowana wartość jest nieparzysta: " + value);

			}
        }

        /* 3. Fragment
        {
            1: int value = r.nextInt(100);
				2: !(value % 2 == 0 && value % 5 == 0) goto 5;
            3: System.out.println(value + " jest podzielne przez 2");
            4: System.out.println(value + " jest podzielne przez 5");
				5: !(!(value % 2 == 0 && value % 5 == 0)) goto 10;
				6: !(value % 2 == 0) goto 8;
            7: System.out.println(value + " jest podzielne przez 2");
				8: !(value % 5 == 0) goto 10;
            9: System.out.println(value + " jest podzielne przez 5");
            10:
        }
        */

        // Twój kod do 3. Fragmentu:
        {
			int value = r.nextInt(100);
			if (value % 2 == 0 && value % 5 == 0) {
				System.out.println(value + " jest podzielne przez 2 i 5");
			}
			else {
				if (value % 5 == 0) {
					System.out.println(value + " jest podzielne przez 5");
				}
				if(value % 2 == 0) {
					System.out.println(value + " jest podzielne przez 2");
				}
			}
        }

        /* 4. Fragment
        {
            1:  int score = r.nextInt(100);
            2:  		!(score >= 95) goto 4;
            3:  System.out.println("Twoja ocena: 6!");
            4:  		!(!(score >= 95)) goto 15;
            5:  		!(score >= 80) goto 7;
            6:  System.out.println("Twoja ocena: 5");
            7:  		!(!score >= 80) goto 15;
            8:  		!(score >= 60) goto 10;
            9:  System.out.println("Twoja ocena: 4");
            10: 		!(!score >= 60) goto 15;
            11: 		!(score >= 40) goto 13;
            12: System.out.println("Twoja ocena: 3");
            13: 		!(!(score >= 40)) goto 15;
            14: System.out.println("Twoja ocena: 2");
            15: System.out.println("Ilość punktów: " + score);
        }
        */

        // Twój kod do 4. Fragmentu:
        {
			int score = r.nextInt(100);
			if (score >= 95) {
				System.out.println("Twoje ocena: 6!");
			}
			else {
				if (score >= 80) {
					System.out.println("Twoje ocena: 5!");
				}
				else {
					if (score >= 60) {
						System.out.println("Twoje ocena: 4!");
					}
					else {
						if (score >= 40) {
							System.out.println("Twoje ocena: 3!");
						}
						else {
							System.out.println("Twoja ocena: 2");
						}	
					}
				}
			}
			System.out.println("Ilość punktów: " + score);
        }

        /* 5. Fragment
        {
            1:  int score = r.nextInt(100);
            2:  	!(score >= 95) goto 5;
            3:  System.out.println("Twoja ocena: 6!");
            4:  System.out.println("Egzamin zaliczony");
            5:  	!(!(score >= 95)) goto 20;
            6:  	!(score >= 80) goto 9;
            7:  System.out.println("Twoja ocena: 5");
            8:  System.out.println("Egzamin zaliczony");
            9:  	!(!score >= 80) goto 20;
            10: 	!(score >= 60) goto 13;
            11: System.out.println("Twoja ocena: 4");
            12: System.out.println("Egzamin zaliczony");
            13: 	!(!score >= 60) goto 20;
            14: 	!(score >= 40) goto 17;
            15: System.out.println("Twoja ocena: 3");
            16: System.out.println("Egzamin zaliczony");
            17: 	!(!(score >= 40)) goto 20;
            18: System.out.println("Twoja ocena: 2");
            19: System.out.println("Egzamin nie zaliczony");
            20: System.out.println("Ilość punktów: " + score);
        }
        */

        // Twój kod do 5. Fragmentu:
        {
						int score = r.nextInt(100);
			if (score >= 95) {
				System.out.println("Twoje ocena: 6!");
				System.out.println("Egzamin zaliczony");
			}
			else {
				if (score >= 80) {
					System.out.println("Twoje ocena: 5!");
					System.out.println("Egzamin zaliczony");
				}
				else {
					if (score >= 60) {
						System.out.println("Twoje ocena: 4!");
						System.out.println("Egzamin zaliczony");
					}
					else {
					if (score >= 40) {
						System.out.println("Twoje ocena: 3!");
						System.out.println("Egzamin zaliczony");
					}
						else {
							System.out.println("Twoja ocena: 2");
							System.out.println("Egzamin niezaliczony");
						}	
				}
				}
			}
			System.out.println("Ilość punktów: " + score);
			
        }

    }
}
