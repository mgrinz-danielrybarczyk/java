package encoding;
import java.nio.charset.Charset;


public class PolishCharactersWindows {

    public static void main(String[] args) {
		System.out.println(Charset.defaultCharset());
        String polishCharactersTest = "Za��� g�l� ja��";

        System.out.println(polishCharactersTest);
    }
}
]