import SingletonPattern.*;

public class Patterns {
    public static void main(String[] args) {
        EagerInitialization eagerInstance = EagerInitialization.getInstance();

        StaticBlockInitialization staticBlockInstance = StaticBlockInitialization.getInstance();
    
        LazyInitialization lazyInstance = LazyInitialization.getInstance();
    
        ThreadSafeInitialization synchronizedInitialization = ThreadSafeInitialization.getSynchronizedInstance();
        
        DoubleCheckedInitialization doubleCheckedInitialization = DoubleCheckedInitialization.getDoubleCheckedInstance();
        
        BillPughImplementation billPughImplementation = BillPughImplementation.getInstance();
    }
}
