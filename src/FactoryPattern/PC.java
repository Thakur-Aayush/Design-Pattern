package FactoryPattern;

public class PC extends Computer {
    
    private String ram;
    private String hdd;
    private String cpu;
    
    public PC(String ram, String hdd, String cpu) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }
    
    @Override
    public String getRAM() { return this.ram; }
    
    @Override
    public String getHDD() { return this.hdd; }
    
    @Override
    public String getCPU() { return this.cpu; }
}
