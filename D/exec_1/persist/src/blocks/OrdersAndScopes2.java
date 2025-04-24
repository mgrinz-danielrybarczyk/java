package blocks;

public class OrdersAndScopes2 {

    static {
        beginValue = 1;
    }

    static {
		//błąd??
        //nextValue = beginValue;
        //System.out.println(nextValue);
    }

    static {
        int nextValue;
        nextValue = 2;
        System.out.println(nextValue);
    }

    public static int beginValue;
    public static int nextValue;

    public static int nextValue() {
        int nextValue = OrdersAndScopes2.nextValue;
        {
            OrdersAndScopes2.nextValue += nextValue;
            {
                return nextValue;
            }
        }
    }

    public static void main(String[] args) {
        int nextValue = 1;
        System.out.println("Następna wartość: " + nextValue);

        {
			//błąd??
            //long nextValue;
            // nextValue = 1L;
            long longValue = 1L;
            System.out.println(nextValue);
            System.out.println(longValue);
            System.out.println(nextValue());
        }

        {
			//błąd??
            //double nextValue;
            //nextValue = 1.;
            double doubleValue = 1.;
            System.out.println(nextValue);
            System.out.println(doubleValue);
            System.out.println(nextValue());
        }

        System.out.println(nextValue());
    }

}
