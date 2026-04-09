package study.ch18.ex;

class StringUtil {
    public static boolean isEmpty(String s){
        if (s == null || s.length() == 0) return true;
        return false;
    }

    public static String reserve(String s){
        return new StringBuilder(s).reverse().toString();
        }
    }

    public static int countChar(String s, char c){

    }
}
public class Ex04 {
    public static void main(String[] args) {
        StringUtil.isEmpty(null);        // true
        StringUtil.isEmpty("");          // true
//        StringUtil.reverse("Hello");     // "olleH"
//        StringUtil.countChar("banana", 'a'); // 3
    }
}
