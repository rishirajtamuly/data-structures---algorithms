
public class Substring {

    public static String getSubstring(String str, int startIdx, int endIdx) {
        String substr = "";
        for (int i = startIdx; i < endIdx; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(getSubstring(str, 0, 5));
        System.out.println(str.substring(0, 5));
    }
}
