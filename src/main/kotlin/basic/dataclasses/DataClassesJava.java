package basic.dataclasses;

public class DataClassesJava {

    public static void main(String[] args) {

        // kotlin will generate get/set for java interoperability
        PersonKotlin personKotlin = new PersonKotlin("Name", 20, "email");
        System.out.println(personKotlin.getAge());
        System.out.println(personKotlin.getName());
        System.out.println(personKotlin.getEmail());

    }
}
