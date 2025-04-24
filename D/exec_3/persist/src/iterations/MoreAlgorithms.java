package iterations;

import java.util.Random;
import java.util.Scanner;

public class MoreAlgorithms {

    public static void main(String[] args) {

        /*
            Wyświetl kolejne 10 znaków zaczynając od znaku wskazanego
        */
        {
            char c = '0';
			/*
			for (int i=0 ; i<10 ; i++) {
				
				System.out.print(c + " ");
				c++;
				
			}
			*/
			int i = 0;
			while (i<10) {
				System.out.print(c + " ");
				c++;
				i++;
			}

        }

        /*
            Wyświetl wskazany tekst od tyłu
         */
        {
            String text = "Tekst czytany od tyłu może być dziwny";
			int textLength = text.length();
			
			/*
			int i = 0;
			while (textLength > i) {
				i++;
				System.out.print(text.charAt(textLength - i));
			}
			*/
			System.out.println();
			for (int i=1 ; i<textLength ; i++) {
				System.out.print(text.charAt(textLength - i));
			}

			
        }

        /*
            Mając dwa napisy oceń czy pierwszy napis jest równy drugiemu napisowi czytanemu od tyłu.
         */

            String firstText = "test";
            String secondWord = "test";
			
			String secondWordBackwards="";
			for (int i=1 ; i<=secondWord.length() ; i++) {
				
				secondWordBackwards+=secondWord.charAt(secondWord.length() - i);
				
			}
			
			System.out.println();
			if (firstText.equals(secondWordBackwards)) {
				System.out.println("\"" + firstText+ "\" " + "jest takie samo jak " + "\"" + secondWordBackwards + "\"");
			} else {
				System.out.println("false");
			}

        /*
            Mając podany wymiar w postaci nieparzystej liczby całkowitej wyświetl symbol diamentu
            Przykładowo, dla wymiaru o wartości 7, wynik powinien być następujący:

               *
              ***
             *****
            *******
             *****
              ***
               *

         */
        {
            int size = 7;
			int charNumber = 1;
			int lineNumber = 1;
			while (charNumber < size) {
				if (charNumber == ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				charNumber++;
			}

        }
    }
}
