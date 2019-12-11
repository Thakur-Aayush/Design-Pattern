// Super class in Factory Design Pattern can be interface, abstract class or normal class
package FactoryPattern;

public abstract class Computer {
    
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();
    
    @Override
    public String toString() {
        return "RAM = " + this.getRAM() + ", HDD = " + this.getHDD() + ", CPU = " + this.getCPU();
    }
}
