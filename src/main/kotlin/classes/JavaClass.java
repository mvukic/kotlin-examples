package classes;

public class JavaClass {

    private String name;

    private Integer age;

    public JavaClass(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }



    // Static members

    public static String constValue = "Const";

    public static void constFun() {
        System.out.println("I am static " + constValue);
    }


    public static void main(String[] args) {
        // Interoperability with kotlin
        var kotlinClass = new KotlinClass("Name", 25);
        // properties as get/set methods
        kotlinClass.getAge();
        kotlinClass.getName();

    }

}
