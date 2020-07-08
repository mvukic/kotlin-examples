package basic.functions;


import java.util.function.Function;

public class JavaFunctions {
    

    public static void main(String[] args) {

        // Has to be static or instance
        JavaFunctions javaFunctions = new JavaFunctions();
        System.out.println(javaFunctions.repeatString("name", 3));

    }

    String repeatString(String name, int n) {
        return String.valueOf(name).repeat(Math.max(0, n));
    }

}
