package statics;

public class Donts {

	public static int sum;
	public static int base;

    public static void main(String[] args) {
		sum = 0;
        System.out.println("Suma liczb 3 i 4 to: " + sumNumbers(3, 4));
		sum = 0;
		System.out.println("Suma liczb 5 i 6 to: " + sumNumbers(5, 6));
		sum = 0;
        System.out.println("Suma liczb 10 i 12 to: " + sumNumbers(10, 12));
		
		base = 2;
        System.out.println("Wynik 2^5 to: " + pow(5));
		base = 3;
        System.out.println("Wynik 3^4 to: " + pow(4));
		base = 10;
        System.out.println("Wynik 10^3 to: " + pow(3));

        printCurrentSum();
        printCurrentBase();
    }

    public static int sumNumbers(int a, int b) {
        sum += a;
        sum += b;
        return sum;
    }

    public static long pow(int pow) {
        long result = 1L;
        for (int i = 1; i <= pow; i++) {
            result *= base;
        }
        return result;
    }

    public static void printCurrentSum() {
        System.out.println("Obecna wartość sumy: " + sum);
    }

    public static void printCurrentBase() {
        System.out.println("Obecna wartość podstawy potęgowania: "  + base);
    }
}
