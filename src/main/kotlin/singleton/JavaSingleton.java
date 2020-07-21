package singleton;

public class JavaSingleton {

    private JavaSingleton instance;

    private JavaSingleton() {}

    public JavaSingleton getInstance() {
        if (this.instance == null) {
            this.instance = new JavaSingleton();
        }
        return this.instance;
    }


}
