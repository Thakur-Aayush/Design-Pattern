// It overcomes the problem of multi-thread instantiation where multiple threads try to create instance.
// It uses an inner static helper class for object creation which does not loads again if
// multiple threads try to create the instance.

package SingletonPattern;

public class BillPughImplementation {
    private BillPughImplementation() {}
    
    private static class InstanceHelper {
        private static final BillPughImplementation INSTANCE = new BillPughImplementation();
    }
    
    public static BillPughImplementation getInstance() {
        System.out.println("Inside Bill Pugh Static Initialization");
        return InstanceHelper.INSTANCE;
    }
}
