package Controller;

public class Tshirt extends Cloth{

    private String size;

    public Tshirt(String name, String material, double price, String size ){
        super(name, material, price);
        this.size = size;
    }

    //Getter und Setter für size
    // in Main testen ob für Tshirt name, material und price über Getter und Setter
    //verwendbar sind


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
