package basic.functions;


// Functional interface SAM
interface JavaFunctionalInterface {
    String process(String name);
}


public class JavaFunctions {
    

    public static void main(String[] args) {

        // Has to be static or instance
        JavaFunctions javaFunctions = new JavaFunctions();
        System.out.println(javaFunctions.repeatString("name", 3));


        JavaFunctionalInterface toUpper = (name) -> name.toUpperCase();
        JavaFunctionalInterface toUpper2 = String::toUpperCase;
        JavaFunctionalInterface doubleIt = (name) -> name + name;

        String name = "Name";
        String upperCased = toUpper.process(name);
        System.out.println(upperCased);

        // Custom functions as a variable?
    }

    String repeatString(String name, int n) {
        return String.valueOf(name).repeat(Math.max(0, n));
    }

}
