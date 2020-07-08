package basic.dataclasses;

public class DataClassesJava {

    public static void main(String[] args) {

        // kotlin will generate get/set for java interoperability
        PersonKotlin personKotlin = new PersonKotlin("Name", 20);
        personKotlin.getAge();
        personKotlin.getName();

    }
}
