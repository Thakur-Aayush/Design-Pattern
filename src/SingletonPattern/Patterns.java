package SingletonPattern;

import java.io.*;

public class Patterns {
    public static void main(String[] args) throws IOException {
        EagerInitialization eagerInstance = EagerInitialization.getInstance();

        StaticBlockInitialization staticBlockInstance = StaticBlockInitialization.getInstance();
    
        LazyInitialization lazyInstance = LazyInitialization.getInstance();
    
        ThreadSafeInitialization synchronizedInitialization = ThreadSafeInitialization.getSynchronizedInstance();
        
        DoubleCheckedInitialization doubleCheckedInitialization = DoubleCheckedInitialization.getDoubleCheckedInstance();
        
        BillPughImplementation billPughImplementation = BillPughImplementation.getInstance();
        
        EnumInitialization.EnumSingleton.doSomething();
    
        serializedSingletonTest();
    }
    
    private static void serializedSingletonTest() throws IOException {
        System.out.println("Serializable Singleton Test........");
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instanceOne);
        out.close();
    
        ObjectOutput in = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        SerializedSingleton instanceTwo = SerializedSingleton.getInstance();
        in.close();
    
        System.out.println("Instance one hashcode = " + instanceOne.hashCode());
        System.out.println("Instance two hashcode = " + instanceTwo.hashCode());
    }
}
