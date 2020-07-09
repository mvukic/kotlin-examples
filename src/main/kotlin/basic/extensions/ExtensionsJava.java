package basic.extensions;

public class ExtensionsJava {

    public static void main(String[] args) {
        String name = "Name";
        String repeatedTwice = StringUtils.repeatTwice(name);
        System.out.println(repeatedTwice);
    }

}


// classes with static methods
class StringUtils {

    public static String repeatTwice(String value) {
        return value + value;
    }

}
