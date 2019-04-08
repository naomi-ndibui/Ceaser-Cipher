import org.junit.Test;
import static org.junit.Assert.*;

public class EncryptionTest {
    @Test
    public void testEncryption() {
       // Encryption encryption = new Encryption();


        assertEquals("EPH", Encryption.encrypt("DOG", 1));
    }

    @Test
    public void testEn() {


       assertEquals("GAG", Encryption.encrypt("EYE", 2));
    }
    @Test
    public void testEncry() {

        assertEquals("GAG", Encryption.encrypt("EYE", 2));
    }
    @Test
    public void testEncode() {
        assertEquals("GAG", Encryption.encrypt("EYE", 2));
    }
}