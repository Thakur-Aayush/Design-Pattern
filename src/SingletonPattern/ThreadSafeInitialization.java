// To make global instance thread safe we need to make it synchronized so that only on thread gets executed.
// Though it solves multi-thread problem but increases performance dur to cost associated with synchronization

package SingletonPattern;

public class ThreadSafeInitialization {
    private static ThreadSafeInitialization synchronizedInstance;
    
    private ThreadSafeInitialization() {}
    
    public static synchronized ThreadSafeInitialization getSynchronizedInstance() {
        if(synchronizedInstance == null) {
            System.out.println("Inside Thread Safe Static Initialization");
            synchronizedInstance = new ThreadSafeInitialization();
        }
        return synchronizedInstance;
    }
}
