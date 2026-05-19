package Controller;

public class Cloth {

    //HA: Fügen Sie eine weiter Eigenschaft "name" hinzu,
    //Erweitern Sie um 2 weiteren Konstruktoren
    // * name, material, price
    // * name, price
    // Fügen Sie die Getter und Setter für den Namen hinzu

    private String material;
    private double price;
    private String name;



    //ToDo: Konstruktor hinzufügen, der alle Daten annimmt.
    //Eine Art Methode, die bei Instanziierung eines Objektes dieser Klasse
    //aufgerufen wird. Er soll initial Code ausführen. Oft wird genutzt um Eigenschaften
    //des Objekts direkt bei der Erstellung zuzuweisen.Es gibt einen Standardkonstruktor,
    //welcher auch nicht geschrieben werden muss, falls nicht benötigt.
    //Dieser ist dennoch vorhanden.
    public Cloth( String material, double price ){
        this.material = material;
        this.price = price;
        this.name = "Cloth";
    }

    public Cloth( double price ){
        this.material = "Baumwolle";
        this.price = price;
        this.name = "Cloth";
    }

    public Cloth( String name,  String material, double price ){
        this.name = name;
        this.material = material;
        this.price = price;
    }

    public Cloth(  double price, String name ){
        this.name = name;
        this.price = price;
        this.material = "Baumwolle";
    }


    //Getter
    public String getMaterial(){
       return material;
    }

    //Setter
    public void setMaterial( String material){
        if(material.isBlank()) return;
        this.material = material;
    }

    public double getPrice(){
       return price;
    }

    public void setPrice( double price){
        if(price <= 0){
            System.err.println("Arrgument nicht zulässig");
            return;
        }

        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
