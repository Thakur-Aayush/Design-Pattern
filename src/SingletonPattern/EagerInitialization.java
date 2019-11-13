// Instance of object is created at the time of class loading
// its drawback is that object is created even though its not going to be used
// This is idol when class is not using lots of resources

package SingletonPattern;

public class EagerInitialization {
    private static final EagerInitialization instance = new EagerInitialization();
    
    // private constructor to prevent client side from accessing
    private EagerInitialization() {}
    
    public static EagerInitialization getInstance() {
        System.out.println("Inside Eager Initialization");
        return instance;
    }
}
