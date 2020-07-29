package fridayteammeeting.singleton;

// control object creation
// Singletons often control access to resources such as database connections or sockets
// State objects are often singletons
// Singletons are more object oriented (Inheritance and Polymorphism to extend a base class)

public class JavaSingleton {

    private JavaSingleton instance;

    private JavaSingleton() {}

    public synchronized JavaSingleton getInstance() {
        if (instance == null) {
            instance = new JavaSingleton();
        }
        return instance;
    }

}
