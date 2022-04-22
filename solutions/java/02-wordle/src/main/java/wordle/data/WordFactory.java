package wordle.data;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WordFactory {

    public static String createRandomWord( /* FUTURE: wordSize */ ) {
        InputStream is = WordFactory.class.getClassLoader().getResourceAsStream("words.txt");
        ArrayList<String> words = new ArrayList<String>();
        new BufferedReader(new InputStreamReader(is)).lines().forEach( v -> {
            words.add(v);
        });

        int index = (int) (Math.random() * words.size());
        return words.get(index);
    }
}
