// To overcome situations with reflection, Joshua Bloch suggested enum to implement as any enum value is initiated only
// once in a Java Program. These are globally accessible thus they are singleton.

package SingletonPattern;

public class EnumInitialization {
    public enum EnumSingleton {
        INSTANCE;
        
        public static void doSomething() {
            System.out.println("...Do Something...");
        }
    }
    
}
