import org.junit.Test;
import static org.junit.Assert.*;

    public class DencryptionTest {
        @Test
        public void testEncryption() {
            // Dencryption dencryption = new dencryption();


            assertEquals("NAOMI NDIBUI", Dencryption.dencrypt("PCQOK PFKDWK", 2));
        }

        @Test
        public void testEn() {


            assertEquals("EYE", Dencryption.dencrypt("GAG", 2));
        }
        @Test
        public void testEncode() {
            assertEquals("CAT", Dencryption.dencrypt("ECV", 2));
        }
    }

