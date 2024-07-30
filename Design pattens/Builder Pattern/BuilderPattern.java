import java.util.concurrent.atomic.AtomicInteger;

class PhoneBuilder{

    private String os;
    private String battery;
    private int size;
    private String camera;
    private double display;

    public PhoneBuilder setOs(String os){
        this.os = os;
        return this;
    }
    public PhoneBuilder setBattery(String battery){
        this.battery = battery;
        return this;
    }
    public PhoneBuilder setSize(int size){
        this.size = size;
        return this;
    }
    public PhoneBuilder setCamera(String camera){
        this.camera = camera;
        return this;
    }
    public PhoneBuilder setDisplay(double display){
        this.display = display;
        return this;
    }
    
    public Phone getPhone(){
        return new Phone(os,battery,size,camera,display);
    }
}

class Phone {
    
    private String os;
    private String battery;
    private int size;
    private String camera;
    private double display;
    
    public Phone(String os, String battery, int size, String camera, double display){
        super();
        this.os = os;
        this.battery = battery;
        this.size = size;
        this.camera = camera;
        this.display = display;
    }

    @Override
    public String toString() {
        return "Phone [os=" + os + ", battery=" + battery + ", size=" + size + ", camera=" + camera + ", display=" + display + "]";
    }
}


public class BuilderPattern {
    
    
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setOs("windows").getPhone();
        System.out.println(phone.toString());
    }    
}
