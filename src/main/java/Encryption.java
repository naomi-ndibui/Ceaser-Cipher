public class Encryption {

    public static String encrypt(String text,int sh) {
        String result = new String();

        for(int i = 0; i < text.length(); i++){
          if(Character.isUpperCase(text.charAt(i)) && text.charAt(i) != ' '){
              char ch = (char)(((int)text.charAt(i)+ sh - 65) % 26 + 65);

              result += ch;
          }
          else
          {
              result += ' ';
          }
        }
        return result;
    }


//    private static  result(char ch) {
//    }
}
