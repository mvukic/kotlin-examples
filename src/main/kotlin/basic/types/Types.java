package basic.types;


// 1. Same class name and file name
// 2. Only one public class
public class Types {

    public static void main(String[] args) {

        // 3. can be null
        // 4. can be mutated
        Integer number = 12;
        String name = "Name";

        System.out.println("Some name: " + name.toUpperCase() + ", some number: " + number);
        System.out.println(String.format("Some name: %s, some number: %s", name.toUpperCase() , number));

        name = "Some other name";

    }

}
