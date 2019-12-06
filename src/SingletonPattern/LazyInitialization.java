// This works fine in a single threaded environment but breaks in a multi-threaded environment,
// if multiple threads are inside if at the same time.
// As both the threads will get different instances.

package SingletonPattern;

public class LazyInitialization {
    private static LazyInitialization instance;
    
    private LazyInitialization() {}
    
    public static LazyInitialization getInstance() {
        if(instance == null) {
            System.out.println("Inside Lazy static Initialization");
            instance = new LazyInitialization();
        }
        return instance;
    }
}
