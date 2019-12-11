package FactoryPattern;

public class FactoryPatternTest {
    
    public static void main(String[] args) {
        Computer pc = FactoryClass.getComputer("pc", "8 GB", "1 TB", "2.4 GHz");
        Computer server = FactoryClass.getComputer("server", "32 GB", "20 TB", "2.9 GHz");
    
        System.out.println("Configuration for PC : " + pc);
        System.out.println("Configuration for Server : " + server);
    }
}
