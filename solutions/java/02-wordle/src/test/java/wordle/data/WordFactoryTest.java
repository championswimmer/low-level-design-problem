package wordle.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordFactoryTest {

    @Test
    void wordFactoryCreatesRandomWords() {
        String word1 = WordFactory.createRandomWord();
        String word2 = WordFactory.createRandomWord();

        Assertions.assertNotEquals(word1, word2);
        Assertions.assertEquals(5, word1.length());
    }

}
