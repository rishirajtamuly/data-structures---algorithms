
import java.lang.StringBuilder;

public class LettersToUppercase {

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toUpperCase(str.charAt(i)); 
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi, i am shradha ";
        System.out.println(toUpperCase(str)); 
        str = "hello WORLD";
        System.out.println(toUpperCase(str));        
    } 
}
