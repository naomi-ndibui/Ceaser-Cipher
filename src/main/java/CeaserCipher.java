public class CeaserCipher {

    public static void main(String[] args) {
//        String text = Encryption.encrypt("NAOMI NDIBUI");
//        Encryption encryption = new Encryption();
        String text = "NAOMI NDIBUI";
        int sh = 2;
        System.out.println("Text  : " + text);
        System.out.println("Shift : " +  sh);
        System.out.println("Cipher: " + Encryption.encrypt(text, sh));
    }

//    private static String encrypt(String text, int sh) {
//    }

}