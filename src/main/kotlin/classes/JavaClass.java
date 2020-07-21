package classes;

public class JavaClass {

    private String name;

    public JavaClass(String name) {
        this.name = name;
    }

    public static String constValue = "Const";

    public static void constFun() {
        System.out.println("I am static " + constValue);
    }

}
