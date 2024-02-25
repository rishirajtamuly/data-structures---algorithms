/*
 Input - "aaabbcccdd"
 Output - "a3b2c3d2"

 "aaaabbbdd" -> "a4b3d2"

 "abc" -> "abc"
 */

import java.lang.StringBuilder;

public class StringCompression {
    
    public static String compressedString(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    /* 
    public static String compressedString(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }
    */

    public static void main(String[] args) {
        System.out.println(compressedString("aaabbcccdd"));
        System.out.println(compressedString("aaaabbbdd"));
        System.out.println(compressedString("abc"));
    }
}
