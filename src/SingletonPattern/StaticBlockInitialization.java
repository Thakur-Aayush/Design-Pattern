// Its similar to Eager Initialization
// but instance of class is created in the static block that provide option for Exception Handling

package SingletonPattern;

public class StaticBlockInitialization {
    private static StaticBlockInitialization instance;
    
    // private constructor to prevent client side accessing
    private StaticBlockInitialization() {}
    
    static {
        try{
            instance = new StaticBlockInitialization();
        }catch(Exception e) {
            throw new RuntimeException("Exception occurred during creation of singleton instance");
        }
    }
    
    public static StaticBlockInitialization getInstance() {
        System.out.println("Inside Static Block Initialization");
        return instance;
    }
}
