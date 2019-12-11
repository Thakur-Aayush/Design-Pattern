// Sometimes distributed systems we need to implement Serializable interface in Singleton class so that
// we can store in the file system and retrieve it at the later point of time.

package SingletonPattern;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {
    private static final long serialVersionUID = 23639266493L;
    
    private SerializedSingleton() {}
    
    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }
    
    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }
    
    protected Object readResolve() {
        return getInstance();
    }
}
