package basic.types;


// Same class name and file name
// Only one public class
public class Types {

    public static void main(String[] args) {

        // can be null
        // can be mutated
        Integer number = 12;
        String name = "Name";

        System.out.println("Some name: " + name.toUpperCase() + ", some number: " + number);
        System.out.println(String.format("Some name: %s, some number: %s", name.toUpperCase() , number));

        name = "Some other name";

    }

}
