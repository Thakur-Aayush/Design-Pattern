import SingletonPattern.EagerInitialization;
import SingletonPattern.StaticBlockInitialization;

public class Patterns {
    public static void main(String[] args) {
        EagerInitialization eagerInstance = EagerInitialization.getInstance();
    
        StaticBlockInitialization staticBlockInstance = StaticBlockInitialization.getInstance();
        
        System.out.println(eagerInstance);
        System.out.println(staticBlockInstance);
    }
}
