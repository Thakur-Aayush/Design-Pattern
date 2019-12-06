// Its to remove the drawback of Synchronized Thread Safe Initialization
package SingletonPattern;

public class DoubleCheckedInitialization {
    private static DoubleCheckedInitialization doubleCheckedInstance;
    
    // Double Checked Locking Principle
    public static DoubleCheckedInitialization getDoubleCheckedInstance() {
        if (doubleCheckedInstance == null) {
            synchronized (DoubleCheckedInitialization.class) {
                if (doubleCheckedInstance == null) {
                    System.out.println("Inside Thread Safe Double Checked Static Initialization");
                    doubleCheckedInstance = new DoubleCheckedInitialization();
                }
            }
        }
        return doubleCheckedInstance;
    }
}
