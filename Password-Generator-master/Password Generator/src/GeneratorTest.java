import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GeneratorTest {

    // Assuming your Password and Alphabet classes are working correctly
    private final Password password = new Password("Secret");
    
    // Note: Ensure your Alphabet constructor arguments match your actual Class definition
    private final Alphabet firstAlphabet = new Alphabet(true, false, false, false);
    private final Alphabet secondAlphabet = new Alphabet(false, true, true, true);
    
    // Note: Ensure your Generator constructor matches these boolean inputs
    private final Generator generator = new Generator(true, false, false, false);

    @Test
    void test1() {
        // Fix: Put the Expected value FIRST
        assertEquals("Secret", password.toString());
    }

    @Test
    void test2() {
        // Fix: Expected value (UPPERCASE_LETTERS) comes first
        assertEquals(Alphabet.UPPERCASE_LETTERS, firstAlphabet.getAlphabet());
    }

    @Test
    void test3() {
        String expectedString = Alphabet.LOWERCASE_LETTERS + Alphabet.NUMBERS + Alphabet.SYMBOLS;
        assertEquals(expectedString, secondAlphabet.getAlphabet());
    }

    @Test
    void test4() {
        assertEquals(generator.alphabet.getAlphabet(), Alphabet.UPPERCASE_LETTERS);
    }

    @Test
    void test5() {
        // Checking length
        assertEquals(26, generator.alphabet.getAlphabet().length());
    }
}