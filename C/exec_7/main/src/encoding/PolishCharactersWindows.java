package encoding;
import java.nio.charset.Charset;


public class PolishCharactersWindows {

    public static void main(String[] args) {
		System.out.println(Charset.defaultCharset());
        String polishCharactersTest = "Za¿ó³æ gêœl¹ jaŸñ";

        System.out.println(polishCharactersTest);
    }
}
]