package pro.string;

public class RemoveLastChar {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(removeLastChar(str)); // prints "hello worl"
    }

    public static String removeLastChar(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        return str.substring(0, str.length() - 1);
    }
}
