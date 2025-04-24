package blocks;

public class OrdersAndScopes {

    // (1)


    // (2)
    public static String text = "(2)";
	
	public static int c;
	public static int a;
	public static int b = a;
	
    // (6)
    static {
        c = a + b;
    }
	
    // (3)
    static {
        c = 1 + 1;
    }

    // (4)

    
    
    

    // (5)
    static {
        int a = 10;
        int b = 20;
    }

    // (6)
    static {
        c = a + b;
    }

    // (7)
    public static void main(String[] args) {
        // (7.1)
        String text = "(7.1)";
        String otherText = "Inny " + text;
        String otherOtherText = "Jeszcze " + otherText;

        // (7.2)
        println(text);
        println(otherText);
        println(otherOtherText);

        // (7.3)
        {
            //String text = "(7.3)";
            String anotherText = "Inny " + text;
            println(text);
            println(otherText);
            println(anotherText);
			int result = 5+5;
			System.out.println(result);
        }

        // (7.4)
        {
            //text = "(7.4)";
            String anotherText = "Inny " + text;
			double result = 5+5.5;
			System.out.println(result);
            {
				
                println(text);
                println(otherText);
                println(anotherText);
            }
        }

        // (7.5)
        //println(anotherText);
    }
	
	    public static void println(String text) {
        System.out.println(c + ": " + text);
        {
            //System.out.println(otherText);
            c = c + 1;
        }
    }
}
