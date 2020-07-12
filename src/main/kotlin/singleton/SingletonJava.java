package singleton;


class SingletonJavaClass {

    private static SingletonJavaClass instance = null;

    public String const1 = "Const1";

    private SingletonJavaClass() {
    }

    private synchronized static void createInstance() {
        if (instance == null) {
            instance = new SingletonJavaClass();
        }
    }

    public static SingletonJavaClass getInstance() {
        if (instance == null) createInstance();
        return instance;
    }
}

public class SingletonJava {

    public static void main(String[] args) {
        System.out.println(SingletonJavaClass.getInstance().const1);
    }

}